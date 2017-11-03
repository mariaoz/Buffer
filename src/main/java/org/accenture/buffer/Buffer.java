package org.accenture.buffer ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer {
  private Queue buffer ;
  private int capacity ;
  int numerOperationPut = 0 ;
  int numberOperationGet = 0 ;

  /**
   * Constructor
   * @param bufferSize
   */
  public Buffer(int bufferSize) {
    capacity = bufferSize ;
    buffer = new LinkedList() ;
  }

  public void put(Object element) {
	  if (buffer.size() == capacity)//si es igual al tope de capacidad sale del programa
		  System.exit(-1); ;

      System.out.println("Element inserted");

	  buffer.add(element) ; //sino añade elemento y aumeta el contador de elementos
	  numerOperationPut++ ;
  }

  public Object get() throws BufferException {
    if (buffer.isEmpty()) 
        throw new BufferException("\n El buffer está vacío") ;//si está vacío lanza excepción

    Object value = buffer.remove() ; //sino lo borra y lo almacena en value que después lo extrae
  System.out.println("Element extracted");
    
  numberOperationGet++ ; //aumenta el extraido
    return value ;
  }

  public int GetNumberOfElements() {
    return buffer.size() ;
  }

  public int getNumberOfHoles() {
    return capacity - buffer.size() ; //numero de huecos
  }

  public int getCapacity() {
    return capacity ;
  }
  
  public double getNumberOfOperations() {
	  return numerOperationPut + numberOperationGet ;
  }
}