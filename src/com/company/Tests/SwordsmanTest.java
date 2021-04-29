package com.company.Tests;

import com.company.soldiers.melee.Swordsman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordsmanTest {
    Swordsman Bob =  new Swordsman("Bob");


    @Test
    void defend() {
        Assertions.assertEquals("defended by shield", Bob.defend());
    }

    @Test
    void attack(){
        Swordsman frenchLeBaguette = new Swordsman("LeBaguette");
        Assertions.assertEquals("successfully attacked with a sword, enemy health is at: 275 HP",
                Bob.attack(frenchLeBaguette));
    }

//    @Test
//    void testToString() {
//        Assertions.assertEquals("", Bob.toString());
//    }

    @Test
    void getCurrentHP() {
        Assertions.assertEquals(315,Bob.getCurrentHP());
    }

    @Test
    void getArmorSet() {

    }

    @Test
    void getAliveStatus() {
        Assertions.assertEquals(true,Bob.getAliveStatus());
    }
}