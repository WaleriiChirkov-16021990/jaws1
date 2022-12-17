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
	private HashSet<Film> collection;
	private Map<String,Map<Character, ArrayList<String>>> alfaBet;
	private HashSet<Integer> id;
	
	
	@Override
	public String toString() {
		return "BData{" +
				"collection=" + collection +
				", alfaBet=" + alfaBet +
				", id=" + id +
				'}';
	}
	
	public BData() {
	}
	
	public BData(HashSet<Film> collection, Map<String, Map<Character, ArrayList<String>>> alfaBet, HashSet<Integer> id) {
		this.collection = collection;
		this.alfaBet = alfaBet;
		this.id = id;
	}
	
	public HashSet<Film> collection() {
		return collection;
	}
	
	public BData setCollection(HashSet<Film> collection) {
		this.collection = collection;
		return this;
	}
	
	public Map<String, Map<Character, ArrayList<String>>> alfaBet() {
		return alfaBet;
	}
	
	public BData setAlfaBet(Map<String, Map<Character, ArrayList<String>>> alfaBet) {
		this.alfaBet = alfaBet;
		return this;
	}
	
	public HashSet<Integer> id() {
		return id;
	}
	
	public BData setId(HashSet<Integer> id) {
		this.id = id;
		return this;
	}
}
