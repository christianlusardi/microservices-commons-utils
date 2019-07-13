package it.christianlusardi.mcu.exceptions;

public class ConfigurationFileNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConfigurationFileNotFoundException() {
		super();
	}

	public ConfigurationFileNotFoundException(String message) {
		super(message);
	}

	public ConfigurationFileNotFoundException(Throwable cause) {
		super(cause);
	}

	public ConfigurationFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}