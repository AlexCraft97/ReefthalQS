package script.flags;

/**
 * Every enum which is a flag enum should implement this
 * @author Alex
 *
 */
public interface IEnumFlag {

	/**
	 * A getter for the flag
	 *
	 * @return the flag this class holds
	 */
	GenericFlagDefaulter<?> getFlag();
}
