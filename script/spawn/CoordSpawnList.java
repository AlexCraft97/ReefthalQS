package script.spawn;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Used for spawning entities at specific coordinates Maps all the Entity names
 * with {@link EnumSpawnableEntity} to a {@link SpawnEntry}
 *
 * @author Alex
 *
 */
public class CoordSpawnList {
	private final Map<EnumSpawnableEntity, SpawnEntry> entsToSpawn = new EnumMap<EnumSpawnableEntity, SpawnEntry>(
			EnumSpawnableEntity.class);
	private final Map<EnumSpawnableEntity, SpawnEntry> spawnedEnts = new EnumMap<EnumSpawnableEntity, SpawnEntry>(
			EnumSpawnableEntity.class);

	/**
	 * Call this every tick, update the yet to be spawned and already spawned
	 * Entities
	 */
	public void tick() {
		final Iterator<Entry<EnumSpawnableEntity, SpawnEntry>> iter = this.entsToSpawn.entrySet().iterator();

		while (iter.hasNext()) {
			final Entry<EnumSpawnableEntity, SpawnEntry> entry = iter.next();
			if (entry.getValue().canSpawn()) {
				entry.getValue().spawn();
			}
			this.spawnedEnts.put(entry.getKey(), entry.getValue());
			iter.remove();
		}
	}
}
