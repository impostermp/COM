package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * Description: Process entity after all ordinary processing, mainly for collision detection.
 *
 * Pre-condition: A game tick has passed since last call and all entities has been processed.<br />
 * Post-condition: The entity has been processed and updated.
 *
 * @param gameData Data for the game
 * @param world World of the game
 *
 */
public interface IPostEntityProcessingService  {
        void process(GameData gameData, World world);
}
