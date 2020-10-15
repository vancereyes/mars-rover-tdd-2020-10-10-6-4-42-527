package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String NORTH = "N";
    public static final String WEST = "W";
    private int locationX;
    private int locationY;
    private String heading;

    public MarsRover(int locationX, int locationY, String heading) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }

    public void executesCommands(String commands) {
        Arrays.asList(commands.split(""))
                .forEach(this::executesCommand);
    }

    private void executesCommand(String command) {
        if (command.equals(MOVE)) {
            move();
        }
        if (command.equals(LEFT)) {
            turnLeft();
        }
        if (command.equals(RIGHT)) {
            turnRight();
        }

    }

    private void turnRight() {
        if (heading.equals(NORTH)){
            heading = "E";
        }
    }

    private void turnLeft() {
        if (heading.equals(NORTH)) {
            heading = WEST;
        }
    }

    private void move() {
        if (heading.equals(NORTH)) {
            locationY += 1;
        }

    }
}
