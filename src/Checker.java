/*
4. Чекер ввода данных пользователем
    1. Строка введенная юзером.
 */

import java.util.Objects;

public class Checker {
	private String input;
	
	public Checker(String input) {
		this.input = input;
	}
	
	public Checker() {
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Checker checker)) return false;
		return input.equals(checker.input);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(input);
	}
	
	public boolean isInteger(){
		return input.matches("^\\d$");
	}
	
	public  boolean isCoincidence(String character){
		String[] name = this.input.split("");
		return name[0].toLowerCase().equals(character.toLowerCase());
	}
	
	public boolean isOneLetter(){
		return this.input.matches("[a-zа-яA-ZА-Я]$");
	}
}
