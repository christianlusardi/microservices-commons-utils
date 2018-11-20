package it.christianlusardi.mcu.core;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.christianlusardi.mcu.constants.GlobalConstants;
import it.christianlusardi.mcu.exceptions.ConfigurationFileNotFoundException;



/**
 * Configuratore generale delle proprietà. Questo oggetto consente, una volta
 * inizializzato, di poter accedere a tutte le proprietà di un dato file.
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
public class Configurator {

	private static final Logger LOGGER = LoggerFactory.getLogger(Configurator.class);

	protected static String path = "";
	protected static Properties prop = new Properties();
	
	
	
	private Configurator() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}
	
	
	
	/**
	 * Procedura iniziale per inizializzare l'oggetto {@link Configurator}
	 * 
	 * @throws ConfigurationFileNotFoundException exception when configuration file was not found
	 * 
	 * @throws IOException exception when there are IO problems
	 */
	public static void initialize() throws ConfigurationFileNotFoundException, IOException {
		
		String fileName = EnvironmentUtils.getConfigurationFileName(EnvironmentUtils.getEnvironmentProfile());
		ClassLoader classLoader = Configurator.class.getClassLoader();
		
		try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
			// caricamento delle properties
			prop.load(inputStream);
		} catch ( NullPointerException e) {
			LOGGER.error("Configuration file [{}] not found", fileName);

			throw new ConfigurationFileNotFoundException("Configuration file " + fileName + " not found");
		}

		LOGGER.info("configuration file loaded");
	}
	
	
	
	/**
	 * Procedura iniziale per inizializzare l'oggetto {@link Configurator}
	 * 
	 * @param pathParam the configuration file path
	 * 
	 * @throws IOException
	 */
	public static void initialize(String pathParam) throws IOException {

		path = pathParam;

		// inizializzazione dello stream di input del file delle properties
		InputStream inputStream = new FileInputStream(path);

		// caricamento delle properties
		prop.load(inputStream);
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @return {@link String} valore della proprietà
	 */
	public static String getStringValue(String propertyName) {
		return prop.getProperty(propertyName);
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata. In caso di valore
	 * nullo o vuoto, verrà restituito il valore indicato di default come parametro.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @param defaultValue {@link String} valore di default
	 * @return {@link String} valore della proprietà
	 */
	public static String getStringValue(String propertyName, String defaultValue) {
		return prop.getProperty(propertyName, defaultValue);
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @return {@link int} valore della proprietà
	 * @throws NullPointerException
	 */
	public static int getIntValue(String propertyName) {
		int result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			throw new NullPointerException("Property " + propertyName + " is empty.");
		else
			result = Integer.parseInt(strResult);

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata. In caso di campo non
	 * valorizzato (un intero non può essere nullo), verrà restituito il valore
	 * indicato di default come parametro.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @param defaultValue {@link int} valore di default
	 * @return {@link int} valore della proprietà
	 */
	public static int getIntValue(String propertyName, int defaultValue) {
		int result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			result = defaultValue;
		else
			result = Integer.parseInt(strResult);

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @return {@link long} valore della proprietà
	 * @throws {@link NullPointerException}
	 */
	public static long getLongValue(String propertyName) {
		long result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			throw new NullPointerException("Property " + propertyName + " is empty.");
		else
			result = Long.parseLong(strResult);

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata. In caso di campo non
	 * valorizzato (un long non può essere nullo), verrà restituito il valore
	 * indicato di default come parametro.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @param defaultValue {@link long} valore di default
	 * @return {@link long} valore della proprietà
	 */
	public static long getLongValue(String propertyName, long defaultValue) {
		long result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			result = defaultValue;
		else
			result = Long.parseLong(strResult);

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @return {@link float} valore della proprietà
	 * @throws NullPointerException
	 */
	public static float getFloatValue(String propertyName) {
		float result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			throw new NullPointerException("Property " + propertyName + " is empty.");
		else
			result = Float.parseFloat(strResult);

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata. In caso di campo non
	 * valorizzato (un float non può essere nullo), verrà restituito il valore
	 * indicato di default come parametro.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @param defaultValue {@link float} valore di default
	 * @return {@link float} valore della proprietà
	 */
	public static float getFloatValue(String propertyName, float defaultValue) {
		float result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			result = defaultValue;
		else
			result = Float.parseFloat(strResult);

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @return {@link double} valore della proprietà
	 * @throws NullPointerException
	 */
	public static double getDoubleValue(String propertyName) {
		double result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty()) {
			throw new NullPointerException("Property " + propertyName + " is empty.");
		} else {
			result = Double.parseDouble(strResult.replace(',', '.'));
		}

		return result;
	}
	
	
	
	/**
	 * Funzione che ritorna il valore della proprietà indicata. In caso di campo non
	 * valorizzato (un double non può essere nullo), verrà restituito il valore
	 * indicato di default come parametro.
	 * 
	 * @param propertyName {@link String} nome della proprietà
	 * @param defaultValue {@link double} valore di default
	 * @return {@link double} valore della proprietà
	 */
	public static double getDoubleValue(String propertyName, double defaultValue) {
		double result;
		String strResult = prop.getProperty(propertyName);

		if (strResult.isEmpty())
			result = defaultValue;
		else
			result = Double.parseDouble(strResult);

		return result;
	}

}