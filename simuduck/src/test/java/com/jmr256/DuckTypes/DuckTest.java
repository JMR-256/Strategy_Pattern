package com.jmr256.DuckTypes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jmr256.DuckBehaviours.FlyWithRockets;
import com.jmr256.DuckBehaviours.FlyWithWings;
import com.jmr256.DuckBehaviours.QuackLoud;
import com.jmr256.DuckBehaviours.QuackQuiet;

public class DuckTest {
    
    @Test
    void shouldSwim(){
        Duck testDuck = generateDuck();
        assertEquals("I'm swimming!", testDuck.swim());
    }

    @Test
    void shouldChangeFlyBehaviour(){
        Duck testMallardDuck = generateMallardDuck();
        
        testMallardDuck.setFlyBehaviour(new FlyWithWings());
        assertEquals("Fly with wings!", testMallardDuck.flyBehaviour.fly());

        testMallardDuck.setFlyBehaviour(new FlyWithRockets());
        assertEquals("Fly with rockets!", testMallardDuck.flyBehaviour.fly());
    }

    @Test
    void shouldChangeQuackBehaviour(){
        Duck testMallardDuck = generateMallardDuck();

        testMallardDuck.setQuackBehaviour(new QuackQuiet());
        assertEquals("quack...", testMallardDuck.quackBehaviour.quack());
        
        testMallardDuck.setQuackBehaviour(new QuackLoud());
        assertEquals("QUACK!", testMallardDuck.quackBehaviour.quack());
    }

    private Duck generateDuck(){
        return new Duck() {
            public String display(){
                return "I'm a test duck!";
            }
        };
    }

    private Duck generateMallardDuck(){
        return new MallardDuck();
    }
    
}
