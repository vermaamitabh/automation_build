package com.edunacor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



import com.edunacor.DataService;


/**
 * Unit test for simple App.
 */
//
public class AppTest 
    extends TestCase
{
	DataService dataImpl = new DataService();
	
	MyMath myMath= new MyMath(dataImpl);
	
	
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
    
	public void testSum() {		
		int result=myMath.Sum(new int[] {1,2,3});
		//check result
		assertEquals(6, result);
		System.out.println("sum_with3numbers Result:"+ result);
	}
	
	public void testSubtraction() {
		assertEquals(2, myMath.Subtraction(4, 6));
	}
	
	public void testMultiply() {
		assertEquals(6, myMath.multiply(new int[] {2,3}));
	}
	
	public void testStubData() {
		int result=myMath.findGreatestFromAllData();	
		assertEquals(8, result);
	}
	
	
}
