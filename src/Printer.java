/*
8. Принтер
 */

public class Printer {
	public Printer() {
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Printer{");
		sb.append('}');
		return sb.toString();
	}
	
	public String printSkaObjectFilm(Film s){
		return String.format("\nИД фильма : %s \nИмя : %s \nЖанр : %s \nГлавные роли : %s \nРежиссёр : %s\n",s.getId(), s.getName(), s.getGenre(), s.getMainRole(), s.getFilmDirector());
	}
	
	public void printBData(BData data){
		if(data.collection().size() > 0) {
			for (Film s : data.collection()
			) {
				System.out.println(printSkaObjectFilm(s));
			}
		} else System.out.println("нет файлов в базе");
	}
	
}
