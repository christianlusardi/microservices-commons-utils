package it.christianlusardi.mcu.core;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.christianlusardi.mcu.constants.GlobalConstants;
import it.christianlusardi.mcu.exceptions.ConfigurationFileNotFoundException;
import it.christianlusardi.mcu.exceptions.McuStartupException;



/**
 * Microservices Commons Utils Engine
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
public class Mcu {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Mcu.class);
	
	
	
	/**
	 * 
	 * @throws McuStartupException
	 */
	public static void start() throws McuStartupException {
		//insert logger here pls ;)
		LOGGER.info("Starting MCU system");
		
		try {
			Configurator.initialize();
		} catch (ConfigurationFileNotFoundException | IOException e) {
			LOGGER.error("Error during MCU startup: {}", e.getMessage(), e);
			throw new McuStartupException("Error during MCU startup: "+e.getMessage(), e);
		}
	}
	
	private Mcu() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

}
