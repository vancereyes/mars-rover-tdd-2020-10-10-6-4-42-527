package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_have_x_0_y_1_heading_N_when_move_M_given_x_0_y_0_heading_N() {
        //given
        Application marsRover = new Application();
        //when
        marsRover.executesCommand("M");
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }
}
