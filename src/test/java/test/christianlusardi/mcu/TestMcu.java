package test.christianlusardi.mcu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.christianlusardi.mcu.core.Configurator;
import it.christianlusardi.mcu.core.Mcu;
import it.christianlusardi.mcu.exceptions.McuStartupException;
import test.christianlusardi.mcu.constants.TestConstants;

public class TestMcu {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestEnvironmentUtils.class);

	@Test
	public void testStart() {
		try {
			Mcu.start();
			assert (true);
		} catch (McuStartupException e) {
			assert (false);
		}
	}
	
	@Test
	public void testProperties() {
		try {
			Mcu.start();
			
			//Test
			assertEquals(Configurator.getStringValue(TestConstants.PROP_TEST), TestConstants.VAL_TEST);
			
			//String
			assertEquals(Configurator.getStringValue(TestConstants.PROP_STRING), TestConstants.VAL_STRING);

			//String
			assertEquals(Configurator.getIntValue(TestConstants.PROP_INT), TestConstants.VAL_INT);

			//String
			assertEquals(Configurator.getDoubleValue(TestConstants.PROP_DOUBLE), TestConstants.VAL_DOUBLE);

			//String
			assertEquals(Configurator.getFloatValue(TestConstants.PROP_FLOAT), TestConstants.VAL_FLOAT);

			//String
			assertEquals(Configurator.getLongValue(TestConstants.PROP_LONG), TestConstants.VAL_LONG);

		} catch (McuStartupException e) {
			assert (false);
		}
	}
}
