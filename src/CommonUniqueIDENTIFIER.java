import java.util.HashSet;
import java.util.Random;

public class CommonUniqueIDENTIFIER {
	private int uniqueID = -1;
	private static HashSet<Integer> id = new HashSet<>();
	
	public CommonUniqueIDENTIFIER(int uniqueID) {
			if (!id.contains(uniqueID)) {
				this.uniqueID = uniqueID;
				id.add(uniqueID);
			} else System.out.printf("Error!\nИдентификатор '%s' уже занят!\n", uniqueID);
	}
	
	public CommonUniqueIDENTIFIER() {
		Random rnd = new Random();
		int rndId = rnd.nextInt(1000000);
		while(true) {
			if(!id.contains(rndId)){
				id.add(rndId);
				break;
			}
			rndId = rnd.nextInt(1000000);
		}
		this.uniqueID = rndId;
	}
	
	public int getUniqueID() {
		return uniqueID;
	}
	public static HashSet<Integer> getId() {
		return id;
	}
}
