package com.jmr256.DuckTypes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MallardDuckTest {
    
    @Test
    void shouldDisplayAsMallardDuck(){
        MallardDuck duck = generateDuck();

        assertEquals("I'm a Mallard Duck!", duck.display());
    }

    @Test
    void shouldFlyWithWings(){
        MallardDuck duck = generateDuck();
        
        assertEquals("Fly with wings!", duck.performFly());
    }

    private MallardDuck generateDuck(){
        return new MallardDuck();
    }
}
