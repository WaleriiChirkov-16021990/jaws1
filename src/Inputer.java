/*
6. Ввод данных пользователя
    1.Строка - ввод юзера
    2.LinkedList - история ввода пользователя.
 */

import java.util.LinkedList;

public class Inputer {
	private String inputUser;
	private LinkedList<String> historyIUser;
	
	public Inputer(String inputUser, LinkedList<String> historyIUser) {
		this.inputUser = inputUser;
		this.historyIUser = historyIUser;
	}
	
	public Inputer() {
	}
	
	public String getInputUser() {
		return inputUser;
	}
	
	public void setInputUser(String inputUser) {
		this.inputUser = inputUser;
	}
	
	public LinkedList<String> getHistoryIUser() {
		return historyIUser;
	}
	
	public void setHistoryIUser(LinkedList<String> historyIUser) {
		this.historyIUser = historyIUser;
	}
}
