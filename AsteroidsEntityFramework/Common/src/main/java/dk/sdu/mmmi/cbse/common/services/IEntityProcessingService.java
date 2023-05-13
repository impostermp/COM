package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IEntityProcessingService {
    /**
     * Desc: Update entity by setting shape and checking hp
     * Pre-condition: A game tick has passed since last call. />
     * Post-condition: The entity has been processed and updated.
     *
     * @param gameData Data for the game
     * @param world World of the game
     *
     */
    void process(GameData gameData, World world);
}
