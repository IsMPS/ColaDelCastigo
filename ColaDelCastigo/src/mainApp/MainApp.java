package mainApp;

import Exception.ColaExceededSizeException;
import models.ColaDelCastigo;
import models.Comparador;

import java.util.Comparator;

public class MainApp {

	public static void main(String[] args) throws ColaExceededSizeException {
//		Comparador comp = new Comparador();
//		ColaDelCastigo<Integer> cola = new ColaDelCastigo<Integer>(comp);
		ColaDelCastigo<Integer> cola = new ColaDelCastigo<Integer>((Integer o1, Integer o2) -> o1-o2);
		
		cola.meter(1);
		cola.meter(2);
		cola.meter(5);
		cola.meter(4);
		
		cola.mostrar();
		
		System.out.println();
		cola.meter(6);
		cola.mostrar();
	}
}
