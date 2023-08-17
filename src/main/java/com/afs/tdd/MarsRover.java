package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeBatchCommands(List<Command> givenCommands) {
        for (Command givenCommand : givenCommands) {
            if (givenCommand == Command.MOVE) {
                move();
            } else if (givenCommand == Command.TURN_LEFT) {
                turnLeft();
            } else if (givenCommand == Command.TURN_RIGHT) {
                turnRight();
            }
        }
    }

    private void move() {
        if (location.getDirection() == Direction.NORTH) {
            location.setY(location.getY() + 1);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setY(location.getY() - 1);
        } else if (location.getDirection() == Direction.EAST) {
            location.setX(location.getX() + 1);
        } else if (location.getDirection() == Direction.WEST) {
            location.setX(location.getX() - 1);
        }
    }

    private void turnLeft() {
        if (location.getDirection() == Direction.NORTH) {
            location.setDirection(Direction.WEST);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setDirection(Direction.EAST);
        } else if (location.getDirection() == Direction.EAST) {
            location.setDirection(Direction.NORTH);
        } else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.SOUTH);
        }
    }

    private void turnRight() {
        if (location.getDirection() == Direction.NORTH) {
            location.setDirection(Direction.EAST);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setDirection(Direction.WEST);
        } else if (location.getDirection() == Direction.EAST) {
            location.setDirection(Direction.SOUTH);
        } else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.NORTH);
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}
