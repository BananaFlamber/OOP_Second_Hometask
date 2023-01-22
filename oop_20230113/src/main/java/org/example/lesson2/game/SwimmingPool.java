package org.example.lesson2.game;

public class SwimmingPool extends BaseObstacleParameter{


    public SwimmingPool(int swimmingDistance) {
        this.swimmingDistance = swimmingDistance;
    }

    public boolean overcome(Participant swimmable) {
        int swimLimit = swimmable.getSwimLimit();
        return  swimLimit >= getSwimmingDistance();
    }
}
