	<?xml version="1.0" encoding="UTF-8"?>;
	
	<Configuration status="WARN">
	
	  <Properties>
	    <Property name="basepath">./logs</property>
	  </Properties>
	  

	  <Appenders>
	     <Console  name="Console" target="SYSTEM_OUT">
	       <PatternLayout pattern="%d{HH:ss.SSSS} [%t] %-5level %logger{36} - %msg%n"/>
	     </Console>
	    
	    <RollingFile name="File" filename="${basepath}/automation.log" filePattern="${basePath}/automation-%d{yyyy-MM-dd}.log">
	       <PatternLayout pattern="%d{HH:mm:ss.SSSS} [%t] %-5level %logger{36}- %msg%n"/>
	       <SizeBasedTriggeringPolicy size="50000" />
	    </RollingFile>
	  </Appenders>
	   
	    
	  <Loggers>
	    <Logger name="name1">
	      <filter  ... />
	    </Logger>
	    ...
	    <Root level="Info">
	      <AppenderRef ref="File"/>
	    </Root>
	  </Loggers>
	</Configuration>

