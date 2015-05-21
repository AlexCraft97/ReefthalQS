package script.flags;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * A tool for holding arbitrary data types and their corresponding Enum entry
 * and value
 *
 * @author Alex
 *
 * @param <T>
 *            the type of Enum
 */
public class FlagMapper<T extends Enum<T> & IEnumFlag> {
	private final Map<Class<?>, Map<T, Object>> flags = new HashMap<>();
	private final Class<T> enumClass;
	
	/**
	 * Create an instance with the given type class
	 * @param clas of the type T
	 */
	public FlagMapper(Class<T> clas) {
		this.enumClass = clas;
	}

	/**
	 * Resets all the flags to their default value as specified in
	 * {@link GenericFlagDefaulter}
	 */
	public void resetFlags() {
		// lambda
		this.flags.values().forEach(value -> value.forEach((innerK, innerV) -> innerV = innerK.getFlag().defaultValue));
	}

	/**
	 * Adds an {@link IEnumFlag} type T
	 *
	 * @param flag
	 *            is the Enum entry of the flag
	 */
	public void addFlag(T flag) {
		if (this.flags.get(flag.getFlag().type) != null) {
			this.flags.get(flag.getFlag().type).put(flag, flag.getFlag().defaultValue);
		} else {
			this.flags.put(flag.getFlag().type, new EnumMap<T, Object>(this.enumClass));
		}
	}
	
	/**
	 * Return the map of the flags
	 * @return the map of the flags
	 */
	public Map<Class<?>, Map<T, Object>> getAll() {
		return this.flags;
	}

	public boolean getBoolean(EnumPlayerFlag flag) {
		return (boolean) this.flags.get(flag.getFlag().type).get(flag);
	}
}
