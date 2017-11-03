package org.accenture.counter;
/*
 * Esta clase permite que por mucho que se vuelva a crear una nueva variable, siga por donde estaba la anterior
 * Se suele usar cuando sólo se quiere una instancia en toda la aplicación, por ejemplo para comprobar números aleatorios
 */

public class SingletonCounter {
    private static SingletonCounter instance; //static hace que sea como una instancia de solo esta clase
    private int counter;
    
    private SingletonCounter() {
	counter=0;
	instance= null;
    }
    
    public static SingletonCounter getInstance() {
	if(instance==null) {
	    instance=new SingletonCounter();
	}
	return instance;
    }

    public int getCounter() {
	return counter++;
    }
}
