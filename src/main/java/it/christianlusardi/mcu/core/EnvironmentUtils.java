package it.christianlusardi.mcu.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.christianlusardi.mcu.constants.ConfiguratorConstants;
import it.christianlusardi.mcu.constants.EnvironmentConstants;
import it.christianlusardi.mcu.constants.GlobalConstants;

public class EnvironmentUtils {

	/**
	 * The logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentUtils.class);

	/**
	 * Private constructor for an utility class
	 */
	private EnvironmentUtils() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

	/**
	 * 
	 * @return {@link String} the environment profile name
	 */
	public static String getEnvironmentProfile() {
		String env = System.getenv(EnvironmentConstants.MCU_ENV_VAR_NAME);

		if (isBlank(env)) {
			LOGGER.info("System enviroment not set. Try with System property");

			env = System.getProperty(EnvironmentConstants.MCU_ENV_VAR_NAME);

			if (isBlank(env)) {
				LOGGER.info("Profile not set");
			} else {
				LOGGER.info("Profile set to: {} with system property", env);
			}

		} else {
			LOGGER.info("Profile set to: {} with enviroment variable", env);
		}

		return env;
	}

	/**
	 * 
	 * @param env the environment name
	 * 
	 * @return {@link String} the configuration file name
	 */
	public static String getConfigurationFileName(String env) {
		String name = null;

		if (isBlank(env)) {
			name = ConfiguratorConstants.DEFAULT_FILE_NAME + ConfiguratorConstants.DEFAULT_FILE_EXTENSION;
		} else {
			name = ConfiguratorConstants.DEFAULT_FILE_NAME + "-" + env + ConfiguratorConstants.DEFAULT_FILE_EXTENSION;
		}

		LOGGER.info("Using {} as property file", name);

		return name;
	}

	/**
	 * <p>
	 * Checks if a CharSequence is empty (""), null or whitespace only.
	 * </p>
	 *
	 * <p>
	 * Whitespace is defined by {@link Character#isWhitespace(char)}.
	 * </p>
	 *
	 * <pre>
	 * StringUtils.isBlank(null)      = true
	 * StringUtils.isBlank("")        = true
	 * StringUtils.isBlank(" ")       = true
	 * StringUtils.isBlank("bob")     = false
	 * StringUtils.isBlank("  bob  ") = false
	 * </pre>
	 *
	 * @param cs the CharSequence to check, may be null
	 * @return {@code true} if the CharSequence is null, empty or whitespace only
	 * @since 2.0
	 * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
	 */
	private static boolean isBlank(final CharSequence cs) {
		int strLen;
		if (cs == null || (strLen = cs.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
