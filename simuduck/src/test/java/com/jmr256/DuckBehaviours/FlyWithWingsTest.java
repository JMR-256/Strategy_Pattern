package com.jmr256.DuckBehaviours;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FlyWithWingsTest {
    @Test
    void shouldFlyWithWings(){
        FlyBehaviour fww = new FlyWithWings();
        assertEquals("Fly with wings!", fww.fly());
    }
}
