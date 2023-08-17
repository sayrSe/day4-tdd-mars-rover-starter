package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0 , currentLocation.getX());
        assertEquals(1 , currentLocation.getY());
        assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_North_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0 , currentLocation.getX());
        assertEquals(0 , currentLocation.getY());
        assertEquals(Direction.WEST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_North_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0 , currentLocation.getX());
        assertEquals(0 , currentLocation.getY());
        assertEquals(Direction.EAST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_neg_1_S_when_executeCommand_given_0_0_South_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0 , currentLocation.getX());
        assertEquals(-1 , currentLocation.getY());
        assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
}
