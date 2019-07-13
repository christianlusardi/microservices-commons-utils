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

	/**
	 * The logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Mcu.class);

	/**
	 * Private constructor for an utility class
	 */
	private Mcu() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

	/**
	 * 
	 * @throws McuStartupException exception when configuration file not found or IO
	 *                             problems
	 */
	public static void start() throws McuStartupException {
		// insert logger here pls ;)
		LOGGER.info("Starting MCU system");

		try {
			Configurator.initialize();
		} catch (ConfigurationFileNotFoundException | IOException e) {
			LOGGER.error("Error during MCU startup: {}", e.getMessage(), e);
			throw new McuStartupException("Error during MCU startup: " + e.getMessage(), e);
		}
	}

}
