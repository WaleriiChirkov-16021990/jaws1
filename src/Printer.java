/*
8. Принтер
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Printer {
	public Printer() {
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Printer{");
		sb.append('}');
		return sb.toString();
	}
	
	public void printSkaObjectFilm(Film s){
		System.out.printf("\nИД фильма : %s \nИмя : %s \nЖанр : %s \nГлавные роли : %s \nРежиссёр : %s\n\n",s.getId(), s.getName(), s.getGenre(), s.getMainRole(), s.getFilmDirector());
	}
	
	public void printBData(BData data){
		for (Film s: data.collection()
		     ) {
			printSkaObjectFilm(s);
		}
	}
	
}
