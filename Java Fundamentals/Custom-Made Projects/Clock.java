package projetosFuncionais;

import java.util.Calendar;

public class Clock {

public static void main(String[] args) {
		 int count = 1;   
	     while (true) {  
	          Calendar d = Calendar.getInstance();
	          System.out.printf ("%02d:%02d:%02d - Contador = %5d\r",
	              d.get (Calendar.HOUR_OF_DAY), 
	              d.get (Calendar.MINUTE), 
	              d.get (Calendar.SECOND),
	              count);
	          count++;
	          // A linha abaixo espera meio segundo. 
	     try { Thread.sleep (500); } catch (InterruptedException ex) { }
	    }   
	}
}
