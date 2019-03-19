Run Configurations -> Arguments -> VM arguments:

-Dosgi.framework.extensions=org.eclipse.equinox.weaving.hook
-Daj.weaving.verbose=true
-Dorg.aspectj.weaver.showWeaveInfo=true
-Dorg.aspectj.osgi.verbose=true

Run Configurations -> Plugins:

org.eclipse.equinox.weaving.aspectj, start-level:1 Auto-start: true.