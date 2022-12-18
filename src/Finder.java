/*
5. Поисковик фильма по части информации.
    1.Строка для нэйм
    2.строка жарн
    3.строка-Актёр
    4.строка Режисёр
    5. Дата - год премьеры
 */


import java.util.Scanner;

public class Finder {
	private int id = 0;
	private String findName = "";
	private String findGenre = "";
	private String findActor = "";
	private String findFilmDirector = "";
	
	
	public Finder(int id, String findName, String findGenre, String findActor, String findFilmDirector) {
		this.id = id;
		this.findName = findName;
		this.findGenre = findGenre;
		this.findActor = findActor;
		this.findFilmDirector = findFilmDirector;
	}
	
	public Finder() {
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFindName() {
		return findName;
	}
	
	public void setFindName(String findName) {
		this.findName = findName;
	}
	
	public String getFindGenre() {
		return findGenre;
	}
	
	public void setFindGenre(String findGenre) {
		this.findGenre = findGenre;
	}
	
	public String getFindActor() {
		return findActor;
	}
	
	public void setFindActor(String findActor) {
		this.findActor = findActor;
	}
	
	public String getFindFilmDirector() {
		return findFilmDirector;
	}
	
	public void setFindFilmDirector(String findFilmDirector) {
		this.findFilmDirector = findFilmDirector;
	}
	
	
	public BData alfaBetSorted(BData bData, String alpha){
		BData sortedAlfaBet = new BData();
		for (Film f: bData.collection()
		     ) {
			Checker checker = new Checker(f.getName());
			if(checker.isCoincidence(alpha)){
				sortedAlfaBet.collection().add(f);
			}
		}
		return sortedAlfaBet;
	}
	
	public BData filter(BData bData){
		if(this.id > 0) {
			return getFindFilmID(bData, getId());
		} else if (!this.findName.equalsIgnoreCase("")) {
			return getFindFilmName(bData,getFindName());
		} else if (!this.findGenre.equalsIgnoreCase("")) {
			return getFindFilmGenre(bData,getFindGenre());
		} else if (!this.findActor.equalsIgnoreCase("")) {
			return getFindFilmActor(bData,getFindActor());
		} else if (!this.findFilmDirector.equalsIgnoreCase("")) {
			return getFindFilmDirector(bData,getFindFilmDirector());
		} else return new BData();
	}
	BData getFindFilmName(BData data, String letter){
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getName().toLowerCase().contains(letter.toLowerCase())){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	
	BData getFindFilmID(BData data, int ID) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getId() == ID){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	BData getFindFilmGenre(BData data, String genre) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getGenre().toLowerCase().contains(genre.toLowerCase())){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	BData getFindFilmActor(BData data, String Actor) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			for (String e:s.getMainRole()){
				if(e.toLowerCase().contains(Actor.toLowerCase())){
					sorted.collection().add(s);
				}
			}
		}
		return sorted;
	}
	BData getFindFilmDirector(BData data, String director) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getFilmDirector().toLowerCase().contains(director.toLowerCase())){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
}
