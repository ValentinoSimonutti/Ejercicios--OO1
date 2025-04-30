package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet implements Set<Integer> {
	
	private Set<Integer> setPrivado;
	
	public EvenNumberSet() {
		this.setPrivado= new HashSet<Integer>();
		
	}
	
	public boolean add(Integer numero) {
		if ((numero != null) && (numero % 2 == 0)) {
			return this.setPrivado.add(numero);
		}
		return false;
	}


	@Override
	public int size() {
		return this.setPrivado.size();
	}

	@Override
	public boolean isEmpty() {
		return this.setPrivado.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.setPrivado.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.setPrivado.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.setPrivado.toArray();
				
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return (T[]) this.setPrivado.toArray();
	}

	@Override
	public boolean remove(Object o) {
		return this.setPrivado.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.setPrivado.contains(c);
	}

	/*@Override
	public boolean addAll(Collection<? extends Integer> c) {
		if(c.stream().allMatch(n -> n % 2 == 0 )) {
			return this.setPrivado.addAll(c);			
		}
		return false;
	}*/
	
	@Override
	public boolean addAll(Collection<? extends Integer> c) {
	    boolean modified = false;
	    for (Integer num : c) {
	        if (num != null && num % 2 == 0) {
	            if (this.setPrivado.add(num)) {
	                modified = true;
	            }
	        }
	    }
	    return modified;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.setPrivado.removeAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.setPrivado.retainAll(c);
	}

	@Override
	public void clear() {
		this.setPrivado.clear();
	}

}
