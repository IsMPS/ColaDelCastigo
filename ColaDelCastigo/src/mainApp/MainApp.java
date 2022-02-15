package mainApp;

import Exception.ColaExceededSizeException;
import models.ColaDelCastigo;
import utils.Comparador;

public class MainApp {

	public static void main(String[] args) throws ColaExceededSizeException {
//		ColaDelCastigo<Integer> depresion = new ColaDelCastigo<Integer>((n1,n2) -> {});
		Comparador comp = new Comparador();
		ColaDelCastigo<Integer> cola = new ColaDelCastigo<>(comp);
		
		cola.meter(1);
		cola.meter(2);
		cola.meter(5);
		cola.meter(4);
		
		cola.mostrar();
		
		System.out.println();
		cola.meter(null);
		cola.mostrar();
	}

}
