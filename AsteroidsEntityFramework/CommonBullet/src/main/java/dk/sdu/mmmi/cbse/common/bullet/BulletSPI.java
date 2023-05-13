package dk.sdu.mmmi.cbse.common.bullet;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.Entity;
/**
 * Description: This method is called when a player is attempting to shoot.
 *
 * Pre-condition: Game is running, and player is shooting.<br />
 * Post-condition: Bullet entity has been added to the world.
 *
 * @param shooter World of the game
 * @param gameData Data for the game
 *
 */
public interface BulletSPI {
    Entity createBullet(Entity e, GameData gameData);
}
