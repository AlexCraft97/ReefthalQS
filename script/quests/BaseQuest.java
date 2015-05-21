package script.quests;

import script.hooks.IPlayer;
import script.util.Statics;
/**
 * A base quest, every quest should extend this and override methods
 * @author Alex
 *
 */
public class BaseQuest {
	private final EnumQuest questType;
	private final IPlayer questPlayer;

	/**
	 * Creates a new Quest instance
	 *
	 * @param questType
	 *            is the type of quest
	 * @param questUser
	 *            the Player who is participating in this quest
	 */
	public BaseQuest(EnumQuest questType, IPlayer questUser) {
		this.questType = questType;
		this.questPlayer = questUser;
	}

	/**
	 * Start the quest
	 */
	public void startQuest() {
	}

	/**
	 * Update the quest; call this every game tick, so 20 times a second
	 */
	public void tickQuest() {
	}

	/**
	 * Finishes the quest
	 *
	 * @param success
	 *            whether the quest was finished successfully or not
	 */
	public void finishQuest(boolean success) {
	}

	/**
	 * Get the translation of the quest name
	 *
	 * @return the translated name
	 */
	public String getTranslatedName() {
		return Statics.translator.translateKey("test.name");
	}

	/**
	 * Get the translation of the quest description
	 *
	 * @return the translated description
	 */
	public String getTranslatedDescription() {
		return Statics.translator.translateKey("test.desc");
	}
}
