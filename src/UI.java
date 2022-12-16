/*
3. Юзер интерфейс
    1.Словарь< уровни,соответствующий уровню АррэйЛист Строк> - пункты меню для пользователя.
 */

import java.util.Map;

public class UI {
	private Map<Integer,String> userUI;
	
	public UI(Map<Integer, String> userUI) {
		this.userUI = userUI;
	}
	
	public UI() {
	}
	
	
	public Map<Integer, String> getUserUI() {
		return userUI;
	}
	
	public void setUserUI(Map<Integer, String> userUI) {
		this.userUI = userUI;
	}
}
