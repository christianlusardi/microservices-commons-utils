package test.christianlusardi.mcu.constants;

import it.christianlusardi.mcu.constants.GlobalConstants;

public class TestConstants {
	
	public static final String TEST_ENVIROMENT = "test";
	
	public static final String PROP_TEST   = "prop.test";
	
	public static final String PROP_STRING = "string.value";
	
	public static final String PROP_INT    = "int.value";
	
	public static final String PROP_DOUBLE = "double.value";
	
	public static final String PROP_FLOAT  = "float.value";
	
	public static final String PROP_LONG   = "long.value";
	
	public static final String VAL_TEST    = "test";
	
	public static final String VAL_STRING  = "hello";
	
	public static final int VAL_INT        = 10;
	
	public static final double VAL_DOUBLE  = 5.5;
	
	public static final float VAL_FLOAT    = 14.76f;
	
	public static final long VAL_LONG      = 8573894782498532743L;
	
	
	
	private TestConstants() {
		throw new IllegalAccessError(GlobalConstants.STANDARD_MESSAGE_UTILITY_CLASS);
	}

}
