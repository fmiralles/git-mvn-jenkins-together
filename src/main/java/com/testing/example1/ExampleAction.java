package com.testing.example1; 

import org.slf4j.*; 

public class ExampleAction {
	
	final Logger logger = LoggerFactory.getLogger(ExampleAction.class);    
	
	public boolean execute() {        
		logger.info( "Example action executed 1" );        
		logger.info( "Example action executed 2" );        
		logger.info( "Example action executed 3" );        
		return true;    
	}
} 