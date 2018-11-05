package it.christianlusardi.mcu;

import java.io.IOException;

import it.christianlusardi.mcu.core.Configurator;
import it.christianlusardi.mcu.exceptions.ConfigurationFileNotFoundException;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] args) {

		try {
			Configurator.initialize();
		} catch (ConfigurationFileNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}
