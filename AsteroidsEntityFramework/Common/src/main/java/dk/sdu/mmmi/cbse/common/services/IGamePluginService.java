package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IGamePluginService {
    /**
    * Description: Called when a service provider is started.

    * @param gameData data for the game
    * @param world The world of the game

    * Pre-conditions: The values gameData and world are not null.
    * Post-conditions: The element has started and has been added to the game.*/

    void start(GameData gameData, World world);
    /**
     * Description: removes element from world.

     * @param gameData data for the game
     * @param world The world of the game

     * Pre-conditions: The values gameData and world are not null.
     * Post-conditions: The plugin has been stopped and entities have been removed from the world.*/
    void stop(GameData gameData, World world);
}
