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
	
	@Override
	public String toString() {
		return "Checker{" +
				"input='" + input + '\'' +
				'}';
	}
	
	
//	@Override
//	public String toString() {
//		return "Checker{" +
//				"input='" + input + '\'' +
//				'}';
//	}


//	@Override
//	public String toString() {
//		final StringBuffer sb = new StringBuffer("Checker{");
//		sb.append("input='").append(input).append('\'');
//		sb.append('}');
//		return sb.toString();
//	}
}
