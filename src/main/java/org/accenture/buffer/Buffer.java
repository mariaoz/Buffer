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
<<<<<<< HEAD
	  if (buffer.size() == capacity)//si es igual al tope de capacidad sale del programa
=======
	  if (buffer.size() == capacity)
>>>>>>> 0ecb3051d5997e1bebc3adf1e0c2167a61b658ed
		  System.exit(-1); ;

      System.out.println("Element inserted");

<<<<<<< HEAD
	  buffer.add(element) ; //sino añade elemento y aumeta el contador de elementos
=======
	  buffer.add(element) ;
>>>>>>> 0ecb3051d5997e1bebc3adf1e0c2167a61b658ed
	  numerOperationPut++ ;
  }

  public Object get() throws BufferException {
    if (buffer.isEmpty()) 
<<<<<<< HEAD
        throw new BufferException("\n El buffer está vacío") ;//si está vacío lanza excepción

    Object value = buffer.remove() ; //sino lo borra y lo almacena en value que después lo extrae
  System.out.println("Element extracted");
    
  numberOperationGet++ ; //aumenta el extraido
=======
        throw new BufferException("\n El buffer está vacío") ;

    Object value = buffer.remove() ;
  System.out.println("Element extracted");
    
  numberOperationGet++ ;
>>>>>>> 0ecb3051d5997e1bebc3adf1e0c2167a61b658ed
    return value ;
  }

  public int GetNumberOfElements() {
    return buffer.size() ;
  }

<<<<<<< HEAD
  public int getNumberOfHoles() {
    return capacity - buffer.size() ; //numero de huecos
  }

  public int getCapacity() {
=======
  public int get_number_of_holes() {
    return capacity - buffer.size() ;
  }

  public int gc() {
>>>>>>> 0ecb3051d5997e1bebc3adf1e0c2167a61b658ed
    return capacity ;
  }
  
  public double getNumberOfOperations() {
	  return numerOperationPut + numberOperationGet ;
  }
}