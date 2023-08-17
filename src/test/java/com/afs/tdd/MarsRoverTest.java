package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_N_when_executeBatchCommands_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.MOVE);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(1, currentLocation.getY());
        assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeBatchCommands_given_0_0_North_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_LEFT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeBatchCommands_given_0_0_North_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_negative_1_S_when_executeBatchCommands_given_0_0_South_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.MOVE);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(-1, currentLocation.getY());
        assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeBatchCommands_given_0_0_South_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_LEFT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeBatchCommands_given_0_0_South_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_1_0_E_when_executeBatchCommands_given_0_0_East_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.MOVE);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(1, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeBatchCommands_given_0_0_East_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_LEFT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeBatchCommands_given_0_0_East_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_negative_1_0_W_when_executeBatchCommands_given_0_0_West_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.MOVE);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(-1, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeBatchCommands_given_0_0_West_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_LEFT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeBatchCommands_given_0_0_West_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.TURN_RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_negative_1_1_N_when_executeBatchCommands_given_0_0_North_and_command_Move_Turn_Left_Move_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        List<Command> givenCommands = new ArrayList<>();
        givenCommands.add(Command.MOVE);
        givenCommands.add(Command.TURN_LEFT);
        givenCommands.add(Command.MOVE);
        givenCommands.add(Command.TURN_RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        assertEquals(-1, currentLocation.getX());
        assertEquals(1, currentLocation.getY());
        assertEquals(Direction.NORTH, currentLocation.getDirection());
    }
}
