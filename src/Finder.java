/*
5. Поисковик фильма по части информации.
    1.Строка для нэйм
    2.строка жарн
    3.строка-Актёр
    4.строка Режисёр
    5. Дата - год премьеры
 */


import java.util.Date;

public class Finder {
	private String findName;
	private String findGenre;
	private String findActor;
	private String findFilmDirector;
	private Date findDate;
	
	
	public Finder(String findName, String findGenre, String findActor, String findFilmDirector, Date findDate) {
		this.findName = findName;
		this.findGenre = findGenre;
		this.findActor = findActor;
		this.findFilmDirector = findFilmDirector;
		this.findDate = findDate;
	}
	
	public Finder() {
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
	
	public Date getFindDate() {
		return findDate;
	}
	
	public void setFindDate(Date findDate) {
		this.findDate = findDate;
	}
}
