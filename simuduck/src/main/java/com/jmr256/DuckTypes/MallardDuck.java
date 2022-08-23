package com.jmr256.DuckTypes;

import com.jmr256.DuckBehaviours.FlyWithWings;
import com.jmr256.DuckBehaviours.QuackLoud;

public class MallardDuck extends Duck{
    
    public MallardDuck(){
        //initialise behaviours
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new QuackLoud();
    }

    public String display(){
        return "I'm a Mallard Duck!";
    }
}
