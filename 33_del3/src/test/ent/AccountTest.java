package ent;

import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    //Test1
    @org.junit.jupiter.api.Test
    void addToScore() {
        Player player = new Player();
        Account testScore = player.getxAccount();
        int result = 2;
        assertEquals(2, testScore+result);
    }

    @org.junit.jupiter.api.Test
    void getScore() {
    }

    @org.junit.jupiter.api.Test
    void setScore() {
    }

    @org.junit.jupiter.api.Test
    void addField() {
    }
}