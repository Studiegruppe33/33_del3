package ent;

import Stub.StubPlayer;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void amount() {
    }

    @Test
    void playerTurn() {
        assertEquals(4, StubPlayer.stubPlayerTurn4());
        assertEquals(3, StubPlayer.stubPlayerTurn3());
        assertEquals(2, StubPlayer.stubPlayerTurn2());
        assertEquals(1, StubPlayer.stubPlayerTurn1());
    }

    @Test
    void startScore() {
    }
}