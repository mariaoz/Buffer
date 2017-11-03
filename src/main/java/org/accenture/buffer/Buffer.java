package org.accenture.buffer ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Buffer<T> {//generico
  private Queue<T> buffer ;
  private int capacity ;
  int numerOperationPut = 0 ;
  int numberOperationGet = 0 ;

  /**
   * Constructor
   * @param bufferSize
   */
  public Buffer(int bufferSize) {
    capacity = bufferSize ;
    buffer = new LinkedList<T>() ;
  }
  private static final Logger LOGGER=LogManager.getLogger(Buffer.class);

  public void put(T element) throws BufferException {
	  if (buffer.size() == capacity)
	        throw new BufferException("\n El buffer está lleno") ;

      LOGGER.info("Element inserted");

	  buffer.add(element) ; 
	  numerOperationPut++ ;
  }

  public T get() throws BufferException {
    if (buffer.isEmpty()) 
        throw new BufferException("\n El buffer está vacío") ;

    T value = buffer.remove() ; 
    LOGGER.info("Element extracted");
    
  numberOperationGet++ ; 
    return value ;
  }
  
  public int getNumberOfElements() {
    return buffer.size() ;
  }

  public int getNumberOfHoles() {
    return capacity - buffer.size() ;
  }

  public int getCapacity() {
    return capacity ;
  }
  
  public int getNumberOfOperations() {
	  return numerOperationPut + numberOperationGet ;
  }
}