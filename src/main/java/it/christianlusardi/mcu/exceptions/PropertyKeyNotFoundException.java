package it.christianlusardi.mcu.exceptions;

public class PropertyKeyNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PropertyKeyNotFoundException() {
		super();
	}

	public PropertyKeyNotFoundException(String message) {
		super(message);
	}

	public PropertyKeyNotFoundException(Throwable cause) {
		super(cause);
	}

	public PropertyKeyNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
