import java.util.HashSet;
import java.util.Random;

public class CommonUniqueIDENTIFIER extends BData{
	private int uniqueID;
	
	public CommonUniqueIDENTIFIER(int uniqueID) {
		if(!this.id().contains(uniqueID)) {
			this.uniqueID = uniqueID;
			HashSet<Integer> idTemp = this.id();
			idTemp.add(uniqueID);
			this.setId(idTemp);
		} else System.out.println("Error!\nИдентификатор уже занят!\n");
	}
	
	public CommonUniqueIDENTIFIER() {
		Random rnd = new Random();
		int rndId = rnd.nextInt(1000000);
		while(true) {
			if (!this.id().contains(rndId)) {
				HashSet<Integer> idTemp = this.id();
				idTemp.add(uniqueID);
				this.setId(idTemp);
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
