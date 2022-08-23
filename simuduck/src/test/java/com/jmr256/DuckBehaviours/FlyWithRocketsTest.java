package com.jmr256.DuckBehaviours;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FlyWithRocketsTest {
    @Test
    void shouldFlyWithRockets(){
        FlyBehaviour fww = new FlyWithRockets();
        assertEquals("Fly with rockets!", fww.fly());
    }
}
