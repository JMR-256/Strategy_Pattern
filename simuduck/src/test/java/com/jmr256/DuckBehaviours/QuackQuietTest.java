package com.jmr256.DuckBehaviours;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuackQuietTest {
    
    @Test
    void shouldQuackQuiet(){
        QuackBehaviour quackQuiet = new QuackQuiet();
        assertEquals("quack...", quackQuiet.quack());
    }
}
