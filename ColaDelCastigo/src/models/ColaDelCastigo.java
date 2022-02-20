package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

import Exception.ColaExceededSizeException;
import Exception.ElementBlockedException;
import Exception.LlevateTuNullDeAquiException;

public class ColaDelCastigo<T extends Integer>{
	private ArrayList<T> array;
	private Comparator<T> comp;
	
	/**
	 * @param comp
	 */
	public ColaDelCastigo(Comparator<T> comp) {
		super();
		this.comp = comp;
		array = new ArrayList<T>(10);
		
	}
	
	public int size() {
		return array.size();
	}
	
	public void meter(T numero) throws ColaExceededSizeException, LlevateTuNullDeAquiException {
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
	
	public void sacar(T a) throws ColaExceededSizeException, ElementBlockedException {
		if(this.array.size()==10) {
		if(this.array.size()>1) {
			for (int i = 0; i < array.size(); i++) {
				if(this.array.get(i).equals(a)) {
					this.array.remove(i);
				}		
			}	
		} else {
			throw new ColaExceededSizeException("Minimo debe haber 1");
		}
		} else {
			throw new ElementBlockedException("La cola está llena, es imposible sacar algo");
		}
	}
	
	public void mostrar() {
		array.sort(comp);
			for (int i = 0; i < array.size(); i++) {
					System.out.println(this.array.get(i));
				}		
			}
}
