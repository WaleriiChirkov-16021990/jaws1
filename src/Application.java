import java.util.*;
import java.util.Scanner;

public class Application {
	private UI worker;
	
	
	public void runApplication(){
		Scanner scanner = new Scanner(System.in);
		BData bData =  this.getBase();
		worker = this.getWorker();
		String inputUser;
		BData sorted;
		System.out.println(worker.getUserUI(1));
		while (true) {
			System.out.println(worker.getUserUI(0));
			System.out.println("Ваш выбор: ");
			inputUser = scanner.nextLine();
			if (inputUser.equalsIgnoreCase("1")){
//				bData.collection().forEach(System.out::println);
				for (Film s: bData.collection()
				     ) {
				new Printer().printSkaObjectFilm(s);
				}
			} else if (inputUser.equalsIgnoreCase("2")){
			
			} else if (inputUser.equalsIgnoreCase("3")) {
				while (true) {
					System.out.println(worker.getUserUI(3));
					System.out.println("Ваш выбор: ");
					inputUser = scanner.nextLine();
					if (inputUser.equalsIgnoreCase("1")){
						System.out.println("Введите ID: ");
						inputUser = scanner.nextLine();
						sorted = getFindFilmID(bData,inputUser);
						new Printer().printBData(sorted);
						sorted = new BData();
					} else if (inputUser.equalsIgnoreCase("2")) {
						System.out.println("Введите название фильма: ");
						inputUser = scanner.nextLine();
						sorted = getFindFilmName(bData,inputUser);
						new Printer().printBData(sorted);
						sorted = new BData();
					} else if (inputUser.equalsIgnoreCase("3")) {
						System.out.println("Введите жанр: ");
						inputUser = scanner.nextLine();
						sorted = getFindFilmGenre(bData,inputUser);
						new Printer().printBData(sorted);
						sorted = new BData();
					} else if (inputUser.equalsIgnoreCase("4")) {
						System.out.println("Введите имя актёра: ");
						inputUser = scanner.nextLine();
						sorted = getFindFilmActor(bData,inputUser);
						new Printer().printBData(sorted);
						sorted = new BData();
					} else if (inputUser.equalsIgnoreCase("5")) {
						System.out.println("Введите имя режиссёра: ");
						inputUser = scanner.nextLine();
						sorted = getFindFilmDirector(bData,inputUser);
						new Printer().printBData(sorted);
						sorted = new BData();
					}else if (inputUser.equalsIgnoreCase("6")){
						break;
					} else System.out.println("Такого фильтра нет.");
				}
			} else if (inputUser.equalsIgnoreCase("4")) {
				System.out.println("Приложение закрывается. До новых встреч!");
				break;
			} else System.out.println(" Нет такого пункта.");
			
		}
	}
	
	BData getBase(){
		BData bData = new BData();
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER(4, bData).getUniqueID(),"Алые паруса","драма", new ArrayList<>(Arrays.asList("Анастасия Вертинская", "Василий Лановой")),"Александр Птушко"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER(bData).getUniqueID(),"Белое солнце пустыни","боевик", new ArrayList<>(Arrays.asList("Анатолий Кузнецов", "Спартак Мишулин")),"Владимир Мотыль"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER(bData).getUniqueID(),"Приключения Шурика","комедия", new ArrayList<>(Arrays.asList("Александр Демьяненко", "Юрий Никулин", "Георгий Вицин", "Евгений Моргунов", "Наталья Селезнёва")),"Леонид Гайдай"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER(bData).getUniqueID(),"Звёздные войны эпизод 1","фантастика", new ArrayList<>(Arrays.asList("Лиам Нисон", "Юэн Макгрегор", "Натали Портман")),"Джордж Лукас"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER(bData).getUniqueID(),"Дум","ужасы", new ArrayList<>(Arrays.asList("Дуэйн Джонсон", "Карл Урбан")),"Анджей Бартковяк"));
		return bData;
	}
	
	UI getWorker(){
		UI menu = new UI(Map.of(0,"\nДля дальнейшей работы выберите необходимый пункт в меню. \n1. Просмотреть информайию о всех фильмах \n2. Просмотреть алфавитный указатель наименований фильмов \n3. Найти фильм \n4. Выход",
				3, "\n Мы ищем фильм. \nВыберите критерии поиска или вернитесь в главное меню. \n1.Ищем по ID, это глупо. \n2.Ищем по названию \n3.Ищем по жанру \n4.Ищем по актёру \n5. Ищем по режиссёру \n6. Выйти на главную",1,"\nДобро пожаловать в нашу фильмотеку!"));
		return menu;
	}
	
	BData getFindFilmName(BData data, String letter){
		BData sorted = new BData();
		for (Film s : data.collection()
		     ) {
			if(s.getName().contains(letter)){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	
	BData getFindFilmID(BData data, String ID) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getId()== Integer.parseInt(ID)){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	BData getFindFilmGenre(BData data, String genre) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getGenre().contains(genre)){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	BData getFindFilmActor(BData data, String Actor) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getMainRole().contains(Actor)){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
	BData getFindFilmDirector(BData data, String director) {
		BData sorted = new BData();
		for (Film s : data.collection()
		) {
			if(s.getFilmDirector().contains(director)){
				sorted.collection().add(s);
			}
		}
		return sorted;
	}
}
