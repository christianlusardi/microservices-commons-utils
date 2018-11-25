package it.christianlusardi.mcu.constants;

import it.christianlusardi.mcu.core.Configurator;

/**
 * Constants for {@link Configurator}
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
public class ConfiguratorConstants {

	public static final String DEFAULT_FILE_NAME = "configuration";

	public static final String DEFAULT_FILE_EXTENSION = ".properties";

	/**
	 * Private constructor for an utility class
	 */
	private ConfiguratorConstants() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}
}
