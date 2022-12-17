import java.util.HashSet;
import java.util.Random;

public class CommonUniqueIDENTIFIER extends BData{
	private int uniqueID = -1;
	
	public CommonUniqueIDENTIFIER(int uniqueID, BData data) {
			if (!data.id().contains(uniqueID)) {
				this.uniqueID = uniqueID;
				data.id().add(uniqueID);
			} else System.out.printf("Error!\nИдентификатор '%s' уже занят!\n", uniqueID);
	}
	
	public CommonUniqueIDENTIFIER(BData data) {
		Random rnd = new Random();
		int rndId = rnd.nextInt(1000000);
		while(true) {
			if(!data.id().contains(rndId)){
				data.id().add(rndId);
				break;
			}
			rndId = rnd.nextInt(1000000);
		}
		this.uniqueID = rndId;
	}
	
	public int getUniqueID() {
		return uniqueID;
	}
}
