Run as -> Run configurations:

1 . Program Arguments:

	-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog-clearPersistedState -persistState false

2. VM arguments:

	-Dosgi.framework.extensions=org.eclipse.equinox.weaving.hook
	-Daj.weaving.verbose=true
	-Dorg.aspectj.weaver.showWeaveInfo=true
	-Dorg.aspectj.osgi.verbose=true

3. Plugins:

	org.eclipse.equinox.weaving.aspectj, start-level:1 Auto-start: true.