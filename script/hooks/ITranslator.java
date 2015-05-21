package script.hooks;
/**
 * A basic interface for a translator
 * @author Alex
 *
 */
public interface ITranslator {
	/**
	 * Translate the given String to the language specified in Minecraft
	 *
	 * @param unlocalized
	 *            the non translated String
	 * @return the translated String
	 */
	String translateKey(String unlocalized);
}
