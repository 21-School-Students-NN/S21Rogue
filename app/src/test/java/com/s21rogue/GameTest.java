package com.s21rogue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test void gameHasAGreeting() {
        Game classUnderTest = new Game();
        assertNotNull(classUnderTest.getGreeting(), "game should have a greeting");
    }
}
