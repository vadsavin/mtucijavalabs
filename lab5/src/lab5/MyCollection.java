package lab5;

import java.util.LinkedList;

public class MyCollection<T>{
	private LinkedList<T> _collection;

	public MyCollection(){
		_collection = new LinkedList<T>();
	}
	
	public int size() {
		return _collection.size();
	}
	public void add(T item) {
		_collection.add(item);
	}
	public void remove(int index) {
		_collection.remove(index);
	}
	public void remove(T item) {
		_collection.remove(item);
	}
	public T get(int index)  {
		return _collection.get(index);
	}
	public void clear() {
		_collection.clear();
	}
}
