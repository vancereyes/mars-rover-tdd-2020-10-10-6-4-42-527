package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_have_x_0_y_1_heading_N_when_command_M_given_x_0_y_0_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executesCommands("M");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_W_when_command_L_given_x_0_y_0_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executesCommands("L");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getHeading());
    }

    @Test
    void should_have_x_0_y_0_heading_E_when_command_R_given_x_0_y_0_heading_N() {
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
    void should_have_x_negative1_y_0_heading_S_when_command_M_given_x_0_y_0_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executesCommands("M");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

}
