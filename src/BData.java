/*
2. База данных
    1.HashSet<Film> - коллекция добавленных фильмов
    2. Алфавитный указатель (Map)
        1.Словарь с ключами = буква алфавита русского
        2.Словарь с ключами = letter of the English alphabet
    3. База данных ID.
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class BData {
//	public Object Film;
	private HashSet<Film> collection = new HashSet<>();
	private static HashSet<Integer> id = new HashSet<>();
	
	
	@Override
	public String toString() {
		return "BData{" +
				"collection=" + collection +
				", id=" + id +
				'}';
	}
	
	public BData() {
	}
	
	public BData(HashSet<Film> collection, Map<String, Map<Character, ArrayList<String>>> alfaBet, HashSet<Integer> id) {
		this.collection = collection;
		this.id = id;
	}
	
	protected HashSet<Film> collection() {
		return collection;
	}
	
	protected BData setCollection(HashSet<Film> collection) {
		this.collection = collection;
		return this;
	}
	
	protected HashSet<Integer> id() {
		return id;
	}
	
	protected BData setId(HashSet<Integer> id) {
		this.id = id;
		return this;
	}
}
