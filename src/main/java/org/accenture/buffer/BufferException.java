package org.accenture.buffer;

public class BufferException extends Exception{
    
    public BufferException(String message) {
	super(message);
	System.err.print("Error: "+message);
}
    

}
