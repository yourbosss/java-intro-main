package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EquationRootsTest {

    @Test
    public void testTwoRealRoots() {
        double[] result = EquationRoots.findRoots(1, -3, 2);
        assertArrayEquals(new double[] {2.0, 1.0}, result);
    }

    @Test
    public void testOneRealRoot() {
        double[] result = EquationRoots.findRoots(1, -2, 1);
        assertArrayEquals(new double[] {1.0}, result);
    }

    @Test
    public void testNoRealRoots() {
        double[] result = EquationRoots.findRoots(1, 0, 1);
        assertArrayEquals(new double[0], result);
    }

    @Test
    public void testNegativeDiscriminant() {
        double[] result = EquationRoots.findRoots(1, 2, 5);
        assertArrayEquals(new double[0], result);
    }

}