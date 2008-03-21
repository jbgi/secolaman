package secolaman.impl.data.internal;

public abstract class Utils {

	public static void checkForNullAndThrow(Object val)
	{
		if (val == null)
			throw new IllegalArgumentException("Value must not be null");
	}
	
	public static void checkKeyAndThrow(String key)
	{
		if (key == null || key.isEmpty() || key.length()>128)
			throw new IllegalArgumentException("key must not be null and length must be <= 128 characters");
	}
	
	public static void checkValAndThrow(String val)
	{
		if (val == null || val.isEmpty() || val.length()>512)
			throw new IllegalArgumentException("Value must not be null and length must be <= 512 characters");
	}
	
}
