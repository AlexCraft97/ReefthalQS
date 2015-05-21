package script.flags;

import java.util.HashMap;
import java.util.Map;

import script.hooks.IPlayer;

/**
 * Maps players to {@link FlagMapper}s
 *
 * @author Alex
 */
public class PlayerFlagManager {
	private final Map<IPlayer, FlagMapper<EnumPlayerFlag>> players = new HashMap<IPlayer, FlagMapper<EnumPlayerFlag>>();

	/**
	 * Add a player to the Map
	 *
	 * @param player
	 *            is the player to be added
	 */
	public void addPlayer(IPlayer player) {
		this.players.put(player, new FlagMapper<EnumPlayerFlag>(EnumPlayerFlag.class));
	}

	/**
	 * Get the {@link FlagMapper} for the given player
	 *
	 * @param player
	 *            is the player whose {@link FlagMapper} should be opened
	 * @return returns the mapper
	 */
	public FlagMapper<EnumPlayerFlag> getPlayer(IPlayer player) {
		return this.players.get(player);
	}

	/**
	 * Reset all flags for the given player's {@link FlagMapper}
	 *
	 * @param player
	 *            to be reset
	 */
	public void resetPlayer(IPlayer player) {
		this.players.get(player).resetFlags();
	}

}
