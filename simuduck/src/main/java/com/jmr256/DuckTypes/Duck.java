package com.jmr256.DuckTypes;

import com.jmr256.DuckBehaviours.FlyBehaviour;
import com.jmr256.DuckBehaviours.QuackBehaviour;

public abstract class Duck {
    
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract String display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public String swim() {
        return "I'm swimming!";
    }

    public String performFly(){
        return flyBehaviour.fly();
    }
    
}
