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
		Finder finder = new Finder();
		while (true) {
			System.out.println(worker.getUserUI(0));
			System.out.println("Ваш выбор: ");
			inputUser = scanner.nextLine();
			if (inputUser.equalsIgnoreCase("1")){
				new Printer().printBData(bData);
			} else if (inputUser.equalsIgnoreCase("2")){
				System.out.println("Введите букву , на которую должно начинаться название фильма: ");
				inputUser = scanner.nextLine();
				if(new Checker(inputUser).isOneLetter()) {
					sorted = finder.alfaBetSorted(bData, inputUser);
					new Printer().printBData(sorted);
				} else System.out.println("Вы ввели не одну букву.");
			} else if (inputUser.equalsIgnoreCase("3")) {
				while (true) {
					finder = new Finder();
					System.out.println(worker.getUserUI(3));
					System.out.println("Ваш выбор: ");
					inputUser = scanner.nextLine();
					if (inputUser.equalsIgnoreCase("1")){
						System.out.println("Введите ID: ");
						inputUser = scanner.nextLine();
						Checker checker = new Checker(inputUser);
						if(checker.isInteger()) {
							finder.setId(Integer.parseInt(inputUser));
							sorted = finder.filter(bData);
							new Printer().printBData(sorted);
						} else System.out.println("ввод не является числом!");
					} else if (inputUser.equalsIgnoreCase("2")) {
						System.out.println("Введите название фильма: ");
						inputUser = scanner.nextLine();
						finder.setFindName(inputUser);
						sorted = finder.filter(bData);
						new Printer().printBData(sorted);
					} else if (inputUser.equalsIgnoreCase("3")) {
						System.out.println("Введите жанр: ");
						inputUser = scanner.nextLine();
						finder.setFindGenre(inputUser);
						sorted = finder.filter(bData);
						new Printer().printBData(sorted);
					} else if (inputUser.equalsIgnoreCase("4")) {
						System.out.println("Введите имя актёра: ");
						inputUser = scanner.nextLine();
						finder.setFindActor(inputUser);
						sorted = finder.filter(bData);
						new Printer().printBData(sorted);
					} else if (inputUser.equalsIgnoreCase("5")) {
						System.out.println("Введите имя режиссёра: ");
						inputUser = scanner.nextLine();
						finder.setFindFilmDirector(inputUser);
						sorted = finder.filter(bData);
						new Printer().printBData(sorted);
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
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER(4).getUniqueID(),"Алые паруса","драма", new ArrayList<>(Arrays.asList("Анастасия Вертинская", "Василий Лановой")),"Александр Птушко"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER().getUniqueID(),"Белое солнце пустыни","боевик", new ArrayList<>(Arrays.asList("Анатолий Кузнецов", "Спартак Мишулин")),"Владимир Мотыль"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER().getUniqueID(),"Приключения Шурика","комедия", new ArrayList<>(Arrays.asList("Александр Демьяненко", "Юрий Никулин", "Георгий Вицин", "Евгений Моргунов", "Наталья Селезнёва")),"Леонид Гайдай"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER().getUniqueID(),"Звёздные войны эпизод 1","фантастика", new ArrayList<>(Arrays.asList("Лиам Нисон", "Юэн Макгрегор", "Натали Портман")),"Джордж Лукас"));
		bData.collection().add(new Film(new CommonUniqueIDENTIFIER().getUniqueID(),"Дум","ужасы", new ArrayList<>(Arrays.asList("Дуэйн Джонсон", "Карл Урбан")),"Анджей Бартковяк"));
		return bData;
	}
	
	UI getWorker(){
		return new UI(Map.of(0,"\nДля дальнейшей работы выберите необходимый пункт в меню. \n1. Просмотреть информайию о всех фильмах \n2. Просмотреть алфавитный указатель наименований фильмов \n3. Найти фильм \n4. Выход",
				3, "\n Мы ищем фильм. \nВыберите критерии поиска или вернитесь в главное меню. \n1.Ищем по ID, это глупо. \n2.Ищем по названию \n3.Ищем по жанру \n4.Ищем по актёру \n5. Ищем по режиссёру \n6. Выйти на главную",
				1,"\nДобро пожаловать в нашу фильмотеку!"));
	}
}
