package it.christianlusardi.mcu.exceptions;

public class McuStartupException extends Exception {

	private static final long serialVersionUID = 1L;

	public McuStartupException() {
		super();
	}

	public McuStartupException(String message) {
		super(message);
	}

	public McuStartupException(Throwable cause) {
		super(cause);
	}

	public McuStartupException(String message, Throwable cause) {
		super(message, cause);
	}

}
