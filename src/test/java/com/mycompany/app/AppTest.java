package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    //It found on the array but their index are not equal 
    public void testFoundButWrongIndex() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4,73));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

      assertFalse(new App().indexEqual(array1,array2,4,3));
    }
    
    //Integers are found in the array and have same index
    public void testFound() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
      assertTrue(new App().indexEqual(array1, array2, 3, 6));
    }
    
    
    //First param array is empty
    public void testEmptyArray1() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().indexEqual(array,array1,1, 1));
    }
    //Second parameter array is empty
    public void testEmptyArray2() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().indexEqual(array1,array,1, 1));
    }
    //First parameter is null
    public void testNull() {
      assertFalse(new App().indexEqual(null,null,2, 1));
    }
    //Array have 2 3 elemet but first index of 3 is equal so it should be return true
    public void testTwoIndex() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
      assertTrue(new App().indexEqual(array1, array2,3, 6));
    }
    
}
