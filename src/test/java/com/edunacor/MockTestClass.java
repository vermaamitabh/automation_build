package com.edunacor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockTestClass{	
	
	@Mock
	DataService dataMock; //= new DataService();
	
	@InjectMocks
	MyMath myMath;// = new MyMath(dataMock);
	
	@Test
	public void testMockData() {
		//use mock to create a dataservice mock class
		//DataService dataServiceMock= mock(DataService.class);
		
		//when retrieveAllData method is called on it, we will return following
		when(dataMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		//Mockito.when(dataMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		//MyMath MockMath = new MyMath(dataServiceMock);
		
		assertEquals(24, myMath.findGreatestFromAllData());
	}
}