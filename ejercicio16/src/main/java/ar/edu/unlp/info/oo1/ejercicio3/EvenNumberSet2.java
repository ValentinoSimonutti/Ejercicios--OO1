package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.Collection;
import java.util.HashSet;

public class EvenNumberSet2 extends HashSet<Integer> {
	
	public boolean add(Integer numero) {
		if ((numero != null) && (numero % 2 == 0)) {
			return super.add(numero);
		}
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
	    boolean modified = false;
	    for (Integer num : c) {
	        if (num != null && num % 2 == 0) {
	            if (super.add(num)) {
	                modified = true;
	            }
	        }
	    }
	    return modified;
	}

}
