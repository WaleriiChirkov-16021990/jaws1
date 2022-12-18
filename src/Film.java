/*
1. Фильм
    0.int-ID
    1.Строка-Нэйм
    2.Строка-Жанр
    3.АррэйЛист-Главная роль(Актёр(ы))
    4.Строка-Режиссёр
 */

import java.util.ArrayList;
import java.util.Objects;

public class Film {
	private int id;
	private String name;
	private String genre;
	private ArrayList<String> mainRole;
	private String filmDirector;
	
	public Film() {
	}
	
	public Film(int id, String name, String genre, ArrayList<String> mainRole, String filmDirector) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.mainRole = mainRole;
		this.filmDirector = filmDirector;
	}

	
	@Override
	public String toString() {
		return "Film{" +
				"id=" + id +
				", name='" + name + '\'' +
				", genre='" + genre + '\'' +
				", mainRole=" + mainRole +
				", filmDirector=" + filmDirector +
				'}';
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Film film)) return false;
		return getId() == film.getId() && getName().equals(film.getName()) && getGenre().equals(film.getGenre()) && Objects.equals(getMainRole(), film.getMainRole()) && Objects.equals(getFilmDirector(), film.getFilmDirector());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getGenre(), getMainRole(), getFilmDirector());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public ArrayList<String> getMainRole() {
		return mainRole;
	}
	
	public void setMainRole(ArrayList<String> mainRole) {
		this.mainRole = mainRole;
	}
	
	public String getFilmDirector() {
		return filmDirector;
	}
	
	public void setFilmDirector(String filmDirector) {
		this.filmDirector = filmDirector;
	}
	
}
