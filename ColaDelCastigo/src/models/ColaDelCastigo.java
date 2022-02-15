package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Exception.ColaExceededSizeException;
import Exception.LlevateTuNullDeAquiException;
import utils.Comparador;

public class ColaDelCastigo<T> {
	private List<T> array;
	private Comparador comp;
	
	/**
	 * @param comp
	 */
	public ColaDelCastigo(Comparador comp) {
		super();
		this.comp = comp;
		array = new ArrayList<T>(10);
		
	}
	
	public int size() {
		return array.size();
	}
	
	public void meter(T numero) throws ColaExceededSizeException {
		if(this.array.size()<10) {
			if(!numero.equals(null)) {
				this.array.add(numero);
			} else {
				throw new LlevateTuNullDeAquiException("No metas un null");
			}
		} else {
			throw new ColaExceededSizeException("Máximo 10 por array");
		}
	}
	
	public void sacar(T a) throws ColaExceededSizeException {
		if(this.array.size()>1) {
			for (int i = 0; i < array.size(); i++) {
				if(this.array.get(i).equals(a)) {
					this.array.remove(i);
				}		
			}	
		} else {
			throw new ColaExceededSizeException("Minimo debe haber 1");
		}
	}
	
	public void mostrar() {
		// AQUÍ NO ENTIENDO EL ERROR he cambiado la clase comparador de comparador<T> a comparador aun así no entiendo
//		array.sort(comp);
			for (int i = 0; i < array.size(); i++) {
					System.out.println(this.array.get(i));
				}		
			}	
}
