package script.util;

import script.flags.PlayerFlagManager;
import script.hooks.ITranslator;
/**
 * Holds some static fields for easy access
 * @author Alex
 *
 */
public class Statics {
	/**
	 * A reference to the {@link ITranslator}
	 */
	public static ITranslator translator;

	/**
	 * A reference to the {@link PlayerFlagManager}
	 */
	public static final PlayerFlagManager PFM = new PlayerFlagManager();
	
	/**
	 * Prevent instantiation
	 */
	private Statics() {

	}
}
