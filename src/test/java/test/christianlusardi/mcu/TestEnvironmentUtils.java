package test.christianlusardi.mcu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.christianlusardi.mcu.constants.EnvironmentConstants;
import it.christianlusardi.mcu.core.EnvironmentUtils;
import test.christianlusardi.mcu.constants.TestConstants;
import test.christianlusardi.mcu.utils.SystemProperty;



/**
 * Test suite for {@link EnvironmentUtils}
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
public class TestEnvironmentUtils {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestEnvironmentUtils.class);
	
	
	
	@Test
	@SystemProperty(key = EnvironmentConstants.MCU_ENV_VAR_NAME, value = TestConstants.TEST_ENVIROMENT)
	public void testEnvOk() {
		assertEquals(EnvironmentUtils.getEnvironmentProfile(), TestConstants.TEST_ENVIROMENT);
	}
	
	
	
	@Test
	public void testEnvNull() {
		assertEquals(EnvironmentUtils.getEnvironmentProfile(), null);
	}
	
	
	
	@Test
	public void testEnvConstructor() {
        
        for (Constructor<?> ctor : EnvironmentUtils.class.getDeclaredConstructors()) {
            LOGGER.info("Constructor --> {}",ctor);
            
            ctor.setAccessible(true);
            
            try {
				ctor.newInstance(EnvironmentUtils.class);
				assert(false);
			} catch (Exception e) {
				assert(true);
			}
        }

	}

}
