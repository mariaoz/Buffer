package org.accenture.buffer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BufferTest {
	private Buffer buffer;
	private static final int LENGHT_BUFFER=10;
	private static final double DELTA=0.0000000000000000001;
	
	@Before
	public void init() {
		buffer = new Buffer(LENGHT_BUFFER);
	}
	@Test
	public void shouldConstructorCreateABuffer() {
	    Buffer<Integer> buffer =new Buffer<>(4);
	    assertNotNull(buffer);
	    assertEquals(4,buffer.getCapacity());
	    assertEquals(0,buffer.getNumberOfHoles());
	    assertEquals(0,buffer.getNumberOfElements());
	    assertEquals(0,buffer.getNumberOfOperations());   
	   
	
	}
	
	@Test
	public void getReturnLastPut() throws BufferException {
		int expectedValue=12;
		buffer.put(expectedValue);
		assertEquals(expectedValue,buffer.get());
	}
	
	@Test(expected=BufferException.class)
	public void shouldAGetOnAnEmptyBufferRaisenAnException() throws BufferException {
	    Buffer<String> buffer= new Buffer<>(2);
	    buffer.get();
	}
	
	@Test(expected=BufferException.class)
	public void shouldPutOnAFullBufferRaisenAnException() throws BufferException {
	    int capacity=2;
	    Buffer<Double> buffer= new Buffer<>(capacity);
	    buffer.put(2.0);
	    buffer.put(3.0);
	    buffer.put(4.0);
	    
	}
	
	@Test
	public void shouldAPutOnEmptyBufferRaisenMakeTheBufferContainsOneElement() throws BufferException {
	    int capacity=2;
	    Buffer<Double> buffer= new Buffer<>(capacity);
	    
	    buffer.put(4.0);
	    
	    assertEquals(1,buffer.getNumberOfElements());
	    
	}
	
	@Test
	public void shouldAPutOnEmptyBufferRaisenMakeTheBufferContainsMoreElement() throws BufferException {
	    int capacity=2;
	    Buffer<Double> buffer= new Buffer<>(capacity);
	    
	    buffer.put(4.0);
	    
	    int numberOfElements=buffer.getNumberOfElements();
	    
	    assertEquals(numberOfElements+1 ,buffer.getNumberOfElements());
	    assertEquals(0,buffer.getNumberOfHoles());
	    assertEquals(capacity,buffer.getNumberOfElements());
	    
	}
	

}
