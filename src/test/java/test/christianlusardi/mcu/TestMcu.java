package test.christianlusardi.mcu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.christianlusardi.mcu.core.Configurator;
import it.christianlusardi.mcu.core.Mcu;
import it.christianlusardi.mcu.exceptions.McuStartupException;
import it.christianlusardi.mcu.exceptions.PropertyKeyNotFoundException;
import test.christianlusardi.mcu.constants.TestConstants;

public class TestMcu {

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

			try {
				//Int
				assertEquals(Configurator.getIntValue(TestConstants.PROP_INT), TestConstants.VAL_INT);
				assert(true);
			} catch (PropertyKeyNotFoundException e) {
				assert(false);
			}

			try {
				//Double
				assertEquals(Configurator.getDoubleValue(TestConstants.PROP_DOUBLE), TestConstants.VAL_DOUBLE);
				assert(true);
			} catch (PropertyKeyNotFoundException e) {
				assert(false);
			}

			try {
				//Float
				assertEquals(Configurator.getFloatValue(TestConstants.PROP_FLOAT), TestConstants.VAL_FLOAT);
				assert(true);
			} catch (PropertyKeyNotFoundException e) {
				assert(false);
			}

			try {
				//Long
				assertEquals(Configurator.getLongValue(TestConstants.PROP_LONG), TestConstants.VAL_LONG);
				assert(true);
			} catch (PropertyKeyNotFoundException e) {
				assert(false);
			}
			
			//String
			assertEquals(Configurator.getStringValue("notExistKey"), null);
			
			
			try {
				assertEquals(Configurator.getIntValue("notExistKey"), 0);
				assert(false);
			} catch (PropertyKeyNotFoundException e) {
				assert(true);
			}
			

		} catch (McuStartupException e) {
			assert (false);
		}
	}
}
