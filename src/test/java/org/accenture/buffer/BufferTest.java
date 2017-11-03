package org.accenture.buffer;

public class BufferTest {
	private Buffer buffer;
	private static int LENGHT_BUFFER=10;
	
	@Before
	public void init() {
		buffer = new Buffer(LENGHT_BUFFER);
	}
	@Test
	public void lengthBuffer() {
		int expectedValue=LENGHT_BUFFER;
		assertEquals(expectedValue,buffer.GetNumberOfElements());
		
	}
	public void getReturnLastPut() {
		int expectedValue=12;
		buffer.put(expectedValue);
		assertEquals(expectedValue,buffer.get());
	}
	

}
