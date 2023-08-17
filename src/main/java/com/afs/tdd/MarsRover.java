package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeBatchCommands(List<Command> givenCommands) {
        givenCommands.forEach(givenCommand -> {
            if (Command.MOVE.equals(givenCommand)) {
                move();
            } else if (Command.TURN_LEFT.equals(givenCommand)) {
                turnLeft();
            } else if (Command.TURN_RIGHT.equals(givenCommand)) {
                turnRight();
            }
        });
    }

    private void move() {
        if (Direction.NORTH.equals(location.getDirection())) {
            location.setY(location.getY() + 1);
        } else if (Direction.SOUTH.equals(location.getDirection())) {
            location.setY(location.getY() - 1);
        } else if (Direction.EAST.equals(location.getDirection())) {
            location.setX(location.getX() + 1);
        } else if (Direction.WEST.equals(location.getDirection())) {
            location.setX(location.getX() - 1);
        }
    }

    private void turnLeft() {
        if (Direction.NORTH.equals(location.getDirection())) {
            location.setDirection(Direction.WEST);
        } else if (Direction.SOUTH.equals(location.getDirection())) {
            location.setDirection(Direction.EAST);
        } else if (Direction.EAST.equals(location.getDirection())) {
            location.setDirection(Direction.NORTH);
        } else if (Direction.WEST.equals(location.getDirection())) {
            location.setDirection(Direction.SOUTH);
        }
    }

    private void turnRight() {
        if (Direction.NORTH.equals(location.getDirection())) {
            location.setDirection(Direction.EAST);
        } else if (Direction.SOUTH.equals(location.getDirection())) {
            location.setDirection(Direction.WEST);
        } else if (Direction.EAST.equals(location.getDirection())) {
            location.setDirection(Direction.SOUTH);
        } else if (Direction.WEST.equals(location.getDirection())) {
            location.setDirection(Direction.NORTH);
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}
