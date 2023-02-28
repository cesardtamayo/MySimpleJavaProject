/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package mysimplejavaprojecttest;

import mysimplejavaproject.MySimpleClass;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ctamayo
 */
public class MySimpleClassNGTest {
        
    /**
     * Test of get_sum method, of class MySimpleClass.
     */
    @Test
    public void testGet_sum() {
        System.out.println("get_sum");
        int a = 2;
        int b = 3;
        MySimpleClass instance = new MySimpleClass();
        int expResult = 5;
        int result = instance.get_sum(a, b);
        assertEquals(result, expResult);
    }

    /**
     * Test of get_diff method, of class MySimpleClass.
     */
    @Test
    public void testGet_diff() {
        System.out.println("get_diff");
        int a = 7;
        int b = 3;
        MySimpleClass instance = new MySimpleClass();
        int expResult = 4;
        int result = instance.get_diff(a, b);
        assertEquals(result, expResult);
    }
    
}
