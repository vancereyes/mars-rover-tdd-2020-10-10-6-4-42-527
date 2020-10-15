package com.afs.tdd;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    public static final String MOVE = "M";
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final String NORTH = "N";
    public static final String WEST = "W";

    @Test
    void should_have_x_0_y_1_heading_N_when_command_M_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executesCommands(MOVE);
        //then
        assertEquals(ZERO, marsRover.getLocationX());
        assertEquals(ONE, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_W_when_command_L_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executesCommands("L");
        //then
        assertEquals(ZERO, marsRover.getLocationX());
        assertEquals(ZERO, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_E_when_command_R_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executesCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

    @Test
    void should_have_x_negative1_y_0_heading_S_when_command_M_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executesCommands("M");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_E_when_command_L_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executesCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_W_when_command_L_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executesCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getHeading());
    }

    @Test
    void should_have_x_1_y_0_heading_E_when_command_M_given_x_0_y_0_heading_E() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executesCommands("M");
        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_E_when_command_L_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executesCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_E_when_command_R_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executesCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getHeading());
    }

    @Test
    void should_have_x_negative1_y_0_heading_W_when_command_M_given_x_0_y_0_heading_W() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executesCommands("M");
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_W_when_command_L_given_x_0_y_0_heading_W() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executesCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_N_when_command_R_given_x_0_y_0_heading_W() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executesCommands("R");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_have_x_negative1_y_1_heading_N_when_command_F_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executesCommands("MLMR");
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_have_executable_message_when_command_F_given_x_0_y_0_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        Executable executables = () ->{
            marsRover.executesCommands("F");
        };

        assertThrows(CommandNotDefinedException.class,executables);
    }


}
