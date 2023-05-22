package dk.sdu.mmmi.cbse.collisionsystem;
import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CollisionDetectorTest {
    private CollisionDetector collisionDetector;
    @BeforeEach
    void setUp() {
        collisionDetector = new CollisionDetector();
    }
    @Test
    public void testCollides_EntitiesDoNotCollide() {

        Entity entity1 = createEntity(0, 0, 0, 5);  // Centered at (0, 0) with radius 5
        Entity entity2 = createEntity(12, 0, 0, 3);  // Centered at (12, 0) with  radius 3

        boolean expected = false;
        boolean result = collisionDetector.collides(entity1, entity2);

        // Assert
        assertEquals(expected, result);
    }

    private Entity createEntity(float x, float y, float radians, float radius) {
        Entity entity = new Entity();
        entity.add(new PositionPart(x, y, radians));
        entity.setRadius(radius);
        return entity;
    }
}