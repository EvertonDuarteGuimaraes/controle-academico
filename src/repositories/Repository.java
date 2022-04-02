package repositories;

import java.util.ArrayList;
import java.util.List;

abstract class Repository<T> {
	
	private List<T> data = new ArrayList<>();
	
	public void create(T t) {
		this.data.add(t);
	}
	
	public T read(T t) throws Exception {
		for(T e : this. data) {
			if(e.equals(t)) {
				return e;
			}
		}
		throw new Exception("Not find!");
	}
	
	public void update(T t, T newT) {
		t = newT;
	}
	
	public void delete(T t) {
		this.data.remove(t);
	}
}
