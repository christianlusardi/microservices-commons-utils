package it.christianlusardi.mcu.constants;

/**
 * Enviroment Constants
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
public class EnvironmentConstants {

	public static final String MCU_ENV_VAR_NAME = "mcu.profile.active";

	/**
	 * Private constructor for an utility class
	 */
	private EnvironmentConstants() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

}
