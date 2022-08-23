package com.jmr256.DuckBehaviours;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuackLoudTest {
    
    @Test
    void quack(){
        QuackBehaviour quackLoud = new QuackLoud();
        assertEquals("QUACK!", quackLoud.quack());
    }
}
