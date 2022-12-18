/*
2. База данных
    1.HashSet<Film> - коллекция добавленных фильмов
 */


import java.util.HashSet;

public class BData {
	private HashSet<Film> collection = new HashSet<>();
	
	@Override
	public String toString() {
		return "BData{" +
				"collection=" + collection +
				'}';
	}
	
	public BData() {
	}
	
	public BData(HashSet<Film> collection) {
		this.collection = collection;
	}
	
	protected HashSet<Film> collection() {
		return collection;
	}
	
	protected BData setCollection(HashSet<Film> collection) {
		this.collection = collection;
		return this;
	}
}
