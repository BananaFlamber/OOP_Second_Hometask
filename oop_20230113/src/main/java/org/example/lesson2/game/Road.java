package org.example.lesson2.game;

public class Road extends BaseObstacleParameter {


    public Road(int runDistance) {
        super(runDistance);
        this.runDistance = runDistance;
    }


    public boolean overcome(Runnable runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        return distanceLimit >= getDistance();
    }


}
