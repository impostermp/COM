package dk.sdu.mmmi.cbse.common.bullet;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.Entity;

public interface BulletSPI {
    Entity createBullet(Entity e, GameData gameData);
}
