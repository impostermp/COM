import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;

module Asteroid {

    requires Common;
    requires CommonAsteroids;

    provides IGamePluginService with dk.sdu.mmmi.cbse.asteroid.AsteroidPlugin;
    provides IEntityProcessingService with dk.sdu.mmmi.cbse.asteroid.AsteroidProcessor;
}