package org.example.lesson2.game;

public class Wall extends BaseObstacleParameter {

    public Wall(int jumpHeight) {
        this.height = jumpHeight;
    }


    public boolean overcome(Jumpable jumpable) {
        int jumpLimit = jumpable.getJumpLimit();
        return jumpLimit >= getHeight();
    }
}
