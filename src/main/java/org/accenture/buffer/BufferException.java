package org.accenture.buffer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BufferException extends Exception{
    private static final Logger LOGGER=LogManager.getLogger(BufferException.class);
    
    public BufferException(String message) {
	super(message);
	LOGGER.fatal("Error: "+message);
}
    

}
