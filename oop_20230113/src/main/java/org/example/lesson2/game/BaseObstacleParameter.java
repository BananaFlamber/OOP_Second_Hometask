package org.example.lesson2.game;

public abstract class BaseObstacleParameter {
    protected int height;
    protected int runDistance;
    protected int swimmingDistance;

    public BaseObstacleParameter(int height, int runDistance, int swimmingDistance){
        this.height = height;
        this.runDistance = runDistance;
        this.swimmingDistance = swimmingDistance;
    }


    public int getDistance() {
        return runDistance;
    }

    public int getHeight() {
        return height;
    }

    public int getSwimmingDistance() {
        return swimmingDistance;
    }
}
