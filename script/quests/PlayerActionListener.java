package script.quests;

import script.hooks.IPlayer;

/**
 * Forwards many player methods to all of his current quests
 *
 * @author Alex
 *
 */
public class PlayerActionListener {
	private final IPlayer player;
	
	/**
	 * Create a new instance for the given player
	 * @param thePlayer to create the listener for
	 */
	public PlayerActionListener(IPlayer thePlayer) {
		this.player = thePlayer;
	}
}
