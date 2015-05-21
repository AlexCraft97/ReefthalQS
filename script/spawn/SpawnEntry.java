package script.spawn;

/**
 * Holds the coordinates of an entity to be spawned Only spawns if it can spawn,
 * and will spawn with the specific method implementation
 *
 * @author Alex
 *
 */
public class SpawnEntry {
	private final double x, y, z;
	/**
	 * Create a new SpawnEntry with given coordinates
	 * @param x is the X coordinate
	 * @param y is the Y coordinate
	 * @param z is the Z coordinate
	 */
	public SpawnEntry(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Whether this entity is able to spawn
	 *
	 * @return whether it can spawn
	 */
	public boolean canSpawn() {
		return true;
	}

	/**
	 * Spawns the entity
	 */
	public void spawn() {

	}
}
