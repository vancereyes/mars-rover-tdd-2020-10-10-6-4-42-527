package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
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
            heading = EAST;
        } if(heading.equals(SOUTH)){
            heading = WEST;
        } if(heading.equals(EAST)){
            heading = SOUTH;
        }
    }

    private void turnLeft() {
        if (heading.equals(NORTH)) {
            heading = WEST;
        } if (heading.equals(SOUTH)){
            heading = EAST;
        } if (heading.equals(EAST)){
            heading = NORTH;
        }
    }

    private void move() {
        if (heading.equals(NORTH)) {
            locationY += 1;
        }if (heading.equals(SOUTH)){
            locationY -= 1;
        }if (heading.equals(EAST)){
            locationX += 1;
        } if (heading.equals(WEST)){
            locationX -= 1;
        }

    }
}
