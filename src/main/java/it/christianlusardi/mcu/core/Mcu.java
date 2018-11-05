package it.christianlusardi.mcu.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.christianlusardi.mcu.constants.GlobalConstants;

/**
 * Microservices Commons Utils Engine
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
public class Mcu {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Mcu.class);
	
	public static void start() {
		//insert logger here pls ;)
	}
	
	private Mcu() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

}
