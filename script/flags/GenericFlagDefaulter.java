package script.flags;

/**
 * Stores the type and default value of a quest
 *
 * @author Alex
 *
 * @param <T>
 *            is the type of the quest
 */
public class GenericFlagDefaulter<T> {
	public final T defaultValue;
	public final Class<T> type;
	
	/**
	 * Create a new instance
	 * @param defaultValue is the default value of the flag
	 * @param valueType is the class of the flag
	 */
	public GenericFlagDefaulter(T defaultValue, Class<T> valueType) {
		this.defaultValue = defaultValue;
		this.type = valueType;
	}
}
