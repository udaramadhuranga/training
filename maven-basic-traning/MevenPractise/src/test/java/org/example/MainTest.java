package org.example;

import static org.example.Main.Square;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void square() {
        double result = Square(3);
        double Correct = 9.0;

        assertEquals(Correct,result);
    }
}