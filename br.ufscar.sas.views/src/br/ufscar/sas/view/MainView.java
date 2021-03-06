package br.ufscar.sas.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;

import br.ufscar.sas.createKDM.CreateKDM;
import br.ufscar.sas.cripto.CriptoBase64;
import br.ufscar.sas.database.QueryClass;
import br.ufscar.sas.fca.Algorithm;
import br.ufscar.sas.generator.GeneratorMain;
import br.ufscar.sas.modelgraph.ArchitectureVisualization;
import br.ufscar.sas.parser.FieldClassVisitor;
import br.ufscar.sas.parser.MethodVisitor;
import br.ufscar.sas.parser.VariableVisitor;
import br.ufscar.sas.tableviewer.Data;
import br.ufscar.sas.tableviewer.EditingAnnotationBelong;
import br.ufscar.sas.tableviewer.EditingAnnotationInstance;
import br.ufscar.sas.tableviewer.TableLabelProvider;
import br.ufscar.sas.transformation.RenameClass;

public class MainView extends ViewPart implements IPartListener2 {

	// get workbench window
	IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	// set selection service
	ISelectionService service = window.getSelectionService();
	// set structured selection
	IStructuredSelection structured = (IStructuredSelection) service.getSelection();
	// Progress Monitor
	ProgressMonitorDialog dialog = new ProgressMonitorDialog(window.getShell());
	// TableViewer
	TableViewer viewer;
	//TreeViewer
	TreeViewer treeViewer;
	// Data
	ArrayList<Data> arrData = new ArrayList<Data>();
	//Database Path
	static String databaseUrl = "";
	//Resultset
	List<String> rs = null;
	//Tree
	Tree tree = null;

	@Override
	public void createPartControl(Composite parent) {

		String projectName = null;
		if (structured != null) {

			IProject jProject = (IProject) structured.getFirstElement();
			projectName = jProject.getName();
			URI path = jProject.getLocationURI();
			databaseUrl = path.getPath() + "/";

			try 
			{	
				QueryClass queryClass = new QueryClass(databaseUrl);
				queryClass.createTables(); 
				queryClass.populateAbstractions(); 

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
		// Register add listener
		final IWorkbenchWindow workbenchWindow = getSite().getWorkbenchWindow();
		workbenchWindow.getPartService().addPartListener(this);

		parent.setLayout(new GridLayout(1, false));
		TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
		GridData gd_tabFolder = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_tabFolder.widthHint = 1280;
		gd_tabFolder.heightHint = 800;
		tabFolder.setLayoutData(gd_tabFolder);

		// Tab1
		this.UIAbstractionMaintainer(tabFolder, projectName);
		// Tab2
		this.UIAnnotation(tabFolder, projectName);
		//Tab3
		this.UIArchitectureVisualization(tabFolder, projectName);
		// this.UIArchitecturalRefactoring(tabFolder, projectName);
		// Tab4
		// this.UICodeGenerator(tabFolder, projectName);

		tabFolder.setSelection(1);
	}

	private void UIAbstractionMaintainer(TabFolder tabFolder, String projectName)
	{	
		TabItem tab1 = new TabItem(tabFolder, SWT.NONE);
		tab1.setText("Abstraction Maintainer");

		Group group = new Group(tabFolder, SWT.NONE);
		Group treeViewGroup = new Group(group, SWT.NONE);
		treeViewGroup.setText("Abstractions Instances");
		treeViewGroup.setBounds(10, 55, 500, 450);
		treeViewGroup.setLayout(new FillLayout());
		tab1.setControl(group);

		Group controlGroup = new Group(group, SWT.NONE);
		controlGroup.setText("Control");
		controlGroup.setBounds(10, 0, 500, 50);

		Label label1 = new Label(controlGroup, SWT.NONE);
		label1.setText("Project Name: " + projectName);
		label1.setBounds(15, 3, 300, 20);


		tree = new Tree(treeViewGroup, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		tree.setLayout(new FillLayout());

		List<String> abstractions = null;
		final Menu menu = new Menu(tree);
		tree.setMenu(menu);

		try 
		{
			QueryClass queryClass = new QueryClass(MainView.getDatabaseUrl());
			abstractions = queryClass.getAbstractions();
			for (String abstraction : abstractions)
			{
				TreeItem item = new TreeItem(tree,0);
				item.setText(abstraction);
				String child = this.searchForChild(abstraction);
				if (child != null)
				{
					TreeItem itemChild = new TreeItem(item, 0);
					itemChild.setText(child);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


		menu.addListener(SWT.Show, new Listener() {
			public void handleEvent(Event event) {
				MenuItem[] menuItems = menu.getItems();
				for (int i = 0; i < menuItems.length; i++) {
					menuItems[i].dispose();
				}
				TreeItem[] treeItems = tree.getSelection();
				for (int i = 0; i < treeItems.length; i++) {

					MenuItem menuItem1 = new MenuItem(menu, SWT.PUSH);
					menuItem1.setText("Add Instance");
					menuItem1.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							if (tree.getSelection()[0].getItemCount() == 0)
							{
								if (tree.getSelection()[0].getParentItem() == null)
								{
									TreeItem treeItem = new TreeItem(tree.getSelection()[0],0);
									treeItem.setText(tree.getSelection()[0].getText() + "_" + 1);
									try {

										QueryClass queryClass = new QueryClass(MainView.getDatabaseUrl());
										queryClass.insertInstance(tree.getSelection()[0].getText(), treeItem.getText());
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

								}
							}
							else
							{
								TreeItem[] items = tree.getSelection()[0].getItems();
								int number = Integer.valueOf((items[items.length-1]).getText().split(Pattern.quote("_"))[1]);
								number = number + 1;
								TreeItem treeItem = new TreeItem(tree.getSelection()[0],0);
								treeItem.setText(tree.getSelection()[0].getText() + "_" + number);

								try {

									QueryClass queryClass = new QueryClass(MainView.getDatabaseUrl());
									queryClass.insertInstance(tree.getSelection()[0].getText(), treeItem.getText());
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}

							}
							tree.getSelection()[0].setExpanded(true);
						}
					});

					MenuItem menuItem2 = new MenuItem(menu, SWT.PUSH);
					menuItem2.setText("Remove Instance");
					menuItem2.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {

							TreeItem[] items = tree.getSelection()[0].getItems();
							String text = items[items.length-1].getText();


							try {
								QueryClass queryClass = new QueryClass(MainView.getDatabaseUrl());
								boolean rtn = queryClass.isUsingData(items[items.length-1].getText());
								if (rtn == false)
								{
									items[items.length-1].dispose();
									queryClass.deleteInstance(text);
								}
								else
									MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", "It can not be delete because it is already in use!");



							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

						}
					});
				}
			}
		});
	}

	private void UIAnnotation(TabFolder tabFolder, String projectName) {
		TabItem tab1 = new TabItem(tabFolder, SWT.NONE);
		tab1.setText("Annotating Code");

		Group group = new Group(tabFolder, SWT.NONE);

		Group controlGroup = new Group(group, SWT.NONE);
		controlGroup.setText("Control");
		controlGroup.setBounds(10, 0, 500, 50);

		Label label1 = new Label(controlGroup, SWT.NONE);
		label1.setText("Project Name: " + projectName);
		label1.setBounds(15, 3, 300, 20);

		Group tableViewGroup = new Group(group, SWT.NONE);
		tableViewGroup.setText("Mapping Code Elements with Abstraction Instances");
		tableViewGroup.setBounds(10, 55, 500, 450);
		tableViewGroup.setLayout(new FillLayout());
		tab1.setControl(group);

		viewer = new TableViewer(tableViewGroup, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = viewer.getTable();

		TableViewerColumn column0 = new TableViewerColumn(viewer, SWT.CENTER);
		column0.getColumn().setText("Element");
		column0.getColumn().setWidth(75);
		column0.getColumn().setResizable(false);

		TableViewerColumn column = new TableViewerColumn(viewer, SWT.CENTER);
		column.getColumn().setText("Element Name");
		column.getColumn().setWidth(190);
		column.getColumn().setResizable(false);

		TableViewerColumn column2 = new TableViewerColumn(viewer, SWT.CENTER);
		column2.getColumn().setText("Instance");
		column2.getColumn().setWidth(120);
		column2.getColumn().setResizable(false);

		TableViewerColumn column3 = new TableViewerColumn(viewer, SWT.CENTER);
		column3.getColumn().setText("Container");
		column3.getColumn().setWidth(120);
		column3.getColumn().setResizable(false);

		EditingAnnotationInstance editingAnnotation = new EditingAnnotationInstance(column2.getViewer());
		EditingAnnotationBelong editingBelong = new EditingAnnotationBelong(column3.getViewer());
		column2.setEditingSupport(editingAnnotation);
		column3.setEditingSupport(editingBelong);

		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new TableLabelProvider());

		//Update combocellviewer
		tabFolder.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent event) {
				if (tabFolder.getSelection()[0].getText().equals("Annotating Code"))
				{
					EditingAnnotationInstance editingAnnotation = new EditingAnnotationInstance(column2.getViewer());
					column2.setEditingSupport(editingAnnotation);

					EditingAnnotationBelong editingBelong = new EditingAnnotationBelong(column3.getViewer());
					column3.setEditingSupport(editingBelong);
				}
			}
		});

		Button processAnnotation = new Button(controlGroup, SWT.NONE);
		processAnnotation.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		processAnnotation.setBounds(350, 0, 140, 25);
		processAnnotation.setText("Process Annotations");

		processAnnotation.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				try {

					boolean check1 = false;
					boolean check2 = false;
					boolean check3 = false;
					try {
						QueryClass queryClass = new QueryClass(databaseUrl);
						check1 = queryClass.selectDifferentBelongToInstance();
						check2 = queryClass.checkIfBelongsExistAsInstance();
						check3 = queryClass.checkRecursiveRelations();

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (check1 == false && check2 == true && check3 == true)
					{
						dialog.run(true, true, new IRunnableWithProgress()
						{ 
							public void run(IProgressMonitor monitor) 
							{ 
								//Creates KDM instance 
								int totalUnitsOfWork = IProgressMonitor.UNKNOWN;
								monitor.beginTask("Creating Structure Package in KDM...",totalUnitsOfWork); 

								String projectName = MainView.getDatabaseUrl().split("\\/")[MainView.getDatabaseUrl().split("\\/").length-1];
								CreateKDM ck = new CreateKDM();
								ck.createKDMFile(projectName); 
								monitor.done(); 
								try 
								{ 
									refreshProjects(); 
								}
								catch (CoreException e) 
								{
									e.printStackTrace();
								} 
							} 
						});
					}
					else
					{
						if (check1 == true && check2 == true && check3 == true)
							MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", "Same 'Instances' must have the same 'Container'!");
						else
						{
							if (check1 == false && check2 == false && check3 == true)
								MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", "One or more 'Containers' do not exist as an 'Instance'!");
							else
							{
								if (check1 == true && check2 == false && check3 == true)
									MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", ""
											+ "One or more 'Containers' do not exist as an 'Instance'! and \n "
											+ "Same 'Instances' must have the same 'Container'!");
								else
								{
									if (check1 == false && check2 == false && check3 == false)
										MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", ""
												+ "One or more 'Containers' do not exist as an 'Instance'! and \n "
												+ "There are recursive relations'!");
									else
									{
										if (check1 == false && check2 == true && check3 == false)
											MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", "There are recursive relations'!");
										else
										{
											if (check1 == true && check2 == false && check3 == false)
												MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", ""
														+ "Same 'Instances' must have the same 'Container'!, \n "
														+ "One or more 'Containers' do not exist as an 'Instance'! and \n "
														+ "There are recursive relations'!");
											else
											{
												if (check1 == true && check2 == true && check3 == false)
													MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info", ""
															+ "Same 'Instances' must have the same 'Container'!, \n "
															+ "There are recursive relations'!");
											}
										}
									}
								}		
							}
						}
					}

				} catch (InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	private void UIArchitectureVisualization(TabFolder tabFolder, String projectName) {
		TabItem tab1 = new TabItem(tabFolder, SWT.NONE);
		tab1.setText("Visualization of Architectures");

		Group group = new Group(tabFolder, SWT.NONE);

		Group controlGroup = new Group(group, SWT.NONE);
		controlGroup.setText("Control of Architecture Visualization");
		controlGroup.setBounds(10, 0, 500, 140);

		Label label1 = new Label(controlGroup, SWT.NONE);
		label1.setText("Project Name: " + projectName);
		label1.setBounds(15, 3, 300, 20);


		Group radioButtons = new Group(controlGroup, SWT.NONE);
		radioButtons.setLayout(new RowLayout(SWT.HORIZONTAL));
		radioButtons.setBounds(10, 35, 280, 30);

		Button[] radios = new Button[3];
		radios[0] = new Button(radioButtons, SWT.RADIO);
		radios[0].setText("Current");
		radios[0].setBounds(10, 35, 200, 30);
		radios[0].setSelection(true);

		radios[1] = new Button(radioButtons, SWT.RADIO);
		radios[1].setText("Planned");
		radios[1].setBounds(120, 35, 160, 30);

		radios[2] = new Button(radioButtons, SWT.RADIO);
		radios[2].setText("Differences");
		radios[2].setBounds(200, 35, 160, 30);

		Button btnFCA = new Button(controlGroup, SWT.NONE);
		btnFCA.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnFCA.setBounds(10, 75, 100, 25);
		btnFCA.setText("Show");

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String folder = workspace.getRoot().getLocation().toFile().getPath().toString();

		String kdmFileFolder = folder + "/" + projectName + "/";
		String kdmFile = projectName + "_KDM.xmi";
		btnFCA.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				if (radios[0].getSelection())
				{
					try {
						Algorithm algorithm = new Algorithm(kdmFileFolder, projectName, kdmFile);
						Map<String, List<String>> map = (Map<String,List<String>>) algorithm.getArchitecture().get(0);
						List<String> relations = (List<String>) algorithm.getArchitecture().get(1);
						IViewPart myView = window.getActivePage().showView("visualization");
						((ArchitectureVisualization) myView).setListNodes(map, relations);
						
					} catch (PartInitException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					if (radios[1].getSelection()) {



					}
					else
					{
						if (radios[2].getSelection()) {



						}
					}
				}

			}
		});

		tab1.setControl(group);
	}

	private void UIArchitecturalRefactoring(TabFolder tabFolder, String projectName) {

		TabItem tab2 = new TabItem(tabFolder, SWT.NONE);
		tab2.setText("Architectural Refactorings for SaS");

		Group group = new Group(tabFolder, SWT.NONE);
		Label label1 = new Label(group, SWT.NONE);
		label1.setText("Project Name:");
		label1.setBounds(10, 10, 100, 20);
		tab2.setControl(group);

		Button btnRR = new Button(group, SWT.NONE);
		btnRR.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnRR.setBounds(10, 87, 146, 25);
		btnRR.setText("Run Refactorings");

		btnRR.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				try {
					dialog.run(true, true, new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) {
							// Creates KDM instance
							int totalUnitsOfWork = IProgressMonitor.UNKNOWN;
							monitor.beginTask("Performing Architectural Refactorings....", totalUnitsOfWork);
							RenameClass rc = new RenameClass();
							try {
								rc.renameClass(projectName);
							} catch (ExecutionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							monitor.done();
						}
					});
				} catch (InvocationTargetException | InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	private void UICodeGenerator(TabFolder tabFolder, String projectName) {
		TabItem tab3 = new TabItem(tabFolder, SWT.NONE);
		tab3.setText("SaS Code Generator");

		Group group = new Group(tabFolder, SWT.NONE);
		Label label1 = new Label(group, SWT.NONE);
		label1.setText("Project Name:");
		label1.setBounds(10, 10, 100, 20);
		tab3.setControl(group);

		Button btnGC = new Button(group, SWT.NONE);
		btnGC.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnGC.setBounds(10, 87, 140, 25);
		btnGC.setText("Generate SaS Code");

		btnGC.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				try {
					dialog.run(true, true, new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) {
							int totalUnitsOfWork = IProgressMonitor.UNKNOWN;
							monitor.beginTask("Performing Forward Engineering....", totalUnitsOfWork);
							IPath newJavaProjectPath = null;
							try {
								newJavaProjectPath = createRefactoredJavaProject(projectName);
							} catch (CoreException e) {
								e.printStackTrace();
							}
							GeneratorMain kdm2Code = new GeneratorMain();
							String pathKDM = "";
							String iProjectStr = "";
							if (structured != null) {
								if (structured.getFirstElement() instanceof IJavaProject) {
									IJavaProject jProject = (IJavaProject) structured.getFirstElement();
									IProject iProject = jProject.getProject();
									iProjectStr = iProject.getName();
									IFile iFile = iProject.getFile(iProject.getName() + "_REFACTORED_KDM.xmi");
									pathKDM = iFile.getLocation().toString();
								}
							}
							kdm2Code.mainGenerator(pathKDM, newJavaProjectPath.toString() + "/src");
							moveFile(pathKDM,
									newJavaProjectPath.toString() + "/" + iProjectStr + "_REFACTORED_KDM.xmi");
							monitor.done();
							try {
								refreshProjects();
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
					});
				} catch (InvocationTargetException | InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	public void moveFile(String in, String out) {

		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			File afile = new File(in);
			File bfile = new File(out);

			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);

			}

			inStream.close();
			outStream.close();

			// delete the original file
			afile.delete();

			System.out.println("File is copied successful!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void refreshProjects() throws CoreException {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		}
	}

	public IPath createRefactoredJavaProject(String projectName) throws CoreException {

		// create a simple project of type org.eclipse.core.resources.IProject:
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String newProjectName = projectName + "_Refactored";
		IProject project = root.getProject(newProjectName);
		project.create(null);
		project.open(null);
		IPath path = project.getLocation();
		// set the Java nature to the created project:
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		project.setDescription(description, null);
		// create our Java project
		IJavaProject javaProject = JavaCore.create(project);
		IFolder binFolder = project.getFolder("bin");
		binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);
		// set the Java build path
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		// add libs to project class path
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);

		// source folder created:
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		// the created source folder should be added to the class entries of the
		// project,
		IPackageFragmentRoot _root = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(_root.getPath());
		javaProject.setRawClasspath(newEntries, null);

		return path;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	@Override
	public void partActivated(IWorkbenchPartReference arg0) {

		arrData.clear();

		// TODO Auto-generated method stub
		if (arg0 instanceof IEditorReference) {
			IEditorReference editor = (IEditorReference) arg0;

			IEditorInput input = null;
			try {
				input = editor.getEditorInput();
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			IPath path = ((IFileEditorInput) input).getFile().getFullPath();
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			IResource resource = root.findMember(path);

			try 
			{	
				QueryClass queryClass = new QueryClass(databaseUrl);
				rs = queryClass.selectInstance(2);

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}


			if (resource != null) {
				if (resource.getLocation().toOSString().split("\\.")[1].equals("java")) {

					//Package Name
					CriptoBase64 criptoBase64 = new CriptoBase64();
					String pathCode = criptoBase64.codeBase64Path(resource.getLocation().toOSString().split("\\.")[0]);
					String packageName = resource.getLocation().toOSString().split("\\/src/")[1];
					String realPackages[] = packageName.split("\\/");
					String realPackage = "";
					for (int p=0; p<realPackages.length-1; p++)
						realPackage = realPackage + "." + realPackages[p];

					realPackage = realPackage.substring(1);

					QueryClass queryClass;
					List <String> lstAnnotation = new ArrayList<String>();
					try {

						queryClass = new QueryClass(databaseUrl);
						String projectName = MainView.getDatabaseUrl().split("\\/")[MainView.getDatabaseUrl().split("\\/").length-1];
						String realPath = criptoBase64.decodeBase64Path(pathCode);
						lstAnnotation = queryClass.selectAnnotationPackage(projectName, realPackage, realPath);

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (lstAnnotation.isEmpty())
						arrData.add(new Data("Package", realPackage, pathCode,  rs.get(0), "", "", rs.get(0)));
					else
						arrData.add(new Data("Package", realPackage, pathCode,  lstAnnotation.get(0).split(Pattern.quote("|"))[0], "", "", lstAnnotation.get(0).split(Pattern.quote("|"))[1]));

					// Class Name
					String strPath[] = resource.getLocation().toOSString().split("\\/");
					String className = strPath[strPath.length - 1].split("\\.")[0];
					criptoBase64 = new CriptoBase64();
					pathCode = criptoBase64.codeBase64Path(resource.getLocation().toOSString().split("\\.")[0]);

					try {

						queryClass = new QueryClass(databaseUrl);
						String projectName = MainView.getDatabaseUrl().split("\\/")[MainView.getDatabaseUrl().split("\\/").length-1];
						String realPath = criptoBase64.decodeBase64Path(pathCode);
						lstAnnotation = queryClass.selectAnnotationClass(projectName, className, realPath);

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (lstAnnotation.isEmpty())
						arrData.add(new Data("Class Name", className, pathCode,  rs.get(0), "", "", rs.get(0)));
					else
						arrData.add(new Data("Class Name", className, pathCode,  lstAnnotation.get(0).split(Pattern.quote("|"))[0], "", "", lstAnnotation.get(0).split(Pattern.quote("|"))[1]));

					// Class fields
					try 
					{
						NodeList<VariableDeclarator> nl = this.classField(new File(resource.getLocation().toOSString()));
						queryClass = new QueryClass(databaseUrl);
						String projectName = MainView.getDatabaseUrl().split("\\/")[MainView.getDatabaseUrl().split("\\/").length-1];
						String realPath = criptoBase64.decodeBase64Path(pathCode);

						for (int j = 0; j < nl.size(); j++)
						{
							lstAnnotation = queryClass.selectAnnotationFieldClass(projectName, className, nl.get(j).getNameAsString().toString(), realPath);
							if (lstAnnotation.isEmpty())
								arrData.add(new Data("Field Class", nl.get(j).getNameAsString().toString(),  pathCode, rs.get(0), className, "", rs.get(0)));
							else
								arrData.add(new Data("Field Class", nl.get(j).getNameAsString().toString(),  pathCode,  lstAnnotation.get(0).split(Pattern.quote("|"))[0], className, "", lstAnnotation.get(0).split(Pattern.quote("|"))[1]));
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// methods and variables
					try {
						List<String> nl = this.methodAndVariables(new File(resource.getLocation().toOSString()));
						queryClass = new QueryClass(databaseUrl);
						String projectName = MainView.getDatabaseUrl().split("\\/")[MainView.getDatabaseUrl().split("\\/").length-1];
						String realPath = criptoBase64.decodeBase64Path(pathCode);

						for (int j = 0; j < nl.size(); j++) {
							if (nl.get(j).toString().contains("|")) {
								String mv[] = nl.get(j).toString().split("\\|");
								lstAnnotation = queryClass.selectAnnotationMethod(projectName, className, mv[0], realPath);
								if (lstAnnotation.isEmpty())
									arrData.add(new Data("Method", mv[0],  pathCode, rs.get(0), className, "", rs.get(0)));
								else
									arrData.add(new Data("Method", mv[0],  pathCode, lstAnnotation.get(0).split(Pattern.quote("|"))[0], className, "", lstAnnotation.get(0).split(Pattern.quote("|"))[1]));

								for (int k = 1; k < mv.length; k++)
								{
									pathCode = criptoBase64.codeBase64Path(resource.getLocation().toOSString().split("\\.")[0]);
									lstAnnotation = queryClass.selectAnnotationVariable(projectName, className, mv[0], mv[k], realPath);
									if (lstAnnotation.isEmpty())
										arrData.add(new Data("Variable", mv[k], pathCode, rs.get(0), className, mv[0], rs.get(0)));
									else
										arrData.add(new Data("Variable", mv[k], pathCode, lstAnnotation.get(0).split(Pattern.quote("|"))[0], className, mv[0], lstAnnotation.get(0).split(Pattern.quote("|"))[1]));
								}
							} 
							else
							{
								lstAnnotation = queryClass.selectAnnotationMethod(projectName, className, nl.get(j).toString(), realPath);
								if (lstAnnotation.isEmpty())
									arrData.add(new Data("Method", nl.get(j).toString(),  pathCode, rs.get(0), className,"",rs.get(0)));
								else
									arrData.add(new Data("Method", nl.get(j).toString(),  pathCode, lstAnnotation.get(0).split(Pattern.quote("|"))[0], className, "", lstAnnotation.get(0).split(Pattern.quote("|"))[1]));
							}
						}

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					viewer.setInput(arrData);
				}
			}
		}
	}

	private NodeList<VariableDeclarator> classField(File file) throws FileNotFoundException {

		NodeList<VariableDeclarator> nl = new NodeList<VariableDeclarator>();
		CompilationUnit cu = JavaParser.parse(file);
		FieldClassVisitor fdc = new FieldClassVisitor();
		List<FieldDeclaration> listFd = fdc.getFieldClasses(cu);
		for (int i = 0; i < listFd.size(); i++)
			nl.addAll(listFd.get(i).getVariables());
		return nl;
	}

	private List<String> methodAndVariables(File file) throws FileNotFoundException {
		// Methods and variables
		List<String> methodAndVariables = new ArrayList<String>();
		String str = "";
		MethodVisitor md = new MethodVisitor();
		CompilationUnit cu = JavaParser.parse(file);
		List<MethodDeclaration> listMd = md.getMethodClasses(cu);
		for (int i = 0; i < listMd.size(); i++) {
			String methodName = listMd.get(i).getName().toString();
			VariableVisitor vv = new VariableVisitor();
			List<VariableDeclarator> listVD = vv.getVariableExpr(listMd.get(i));
			for (int j = 0; j < listVD.size(); j++) {
				String variable = listVD.get(j).getNameAsString().toString();
				str = str + "|" + variable;
			}
			methodAndVariables.add(methodName + str);
			str = "";
		}
		return methodAndVariables;
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partClosed(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partDeactivated(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partHidden(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partInputChanged(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partOpened(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void partVisible(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub

	}

	public static String getDatabaseUrl() {
		return databaseUrl;
	}

	private String searchForChild(String parent) throws Exception
	{
		QueryClass queryClass = new QueryClass(databaseUrl);
		List<String> instances = queryClass.selectInstance(1);
		for (String instance: instances)
			if (instance.split(Pattern.quote("|"))[0].equals(parent))
				return instance.split(Pattern.quote("|"))[1];

		return null;
	}
}
