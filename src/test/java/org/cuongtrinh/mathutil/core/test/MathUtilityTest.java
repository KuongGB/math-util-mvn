/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.cuongtrinh.mathutil.core.test;

import org.cuongtrinh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HIEP PC
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(120, MathUtility.getFactorial(5));
    }
}

//TDD: TEST DRIVEN DEVELOPMENT

//DDT: DATA DRIVEN TESTING