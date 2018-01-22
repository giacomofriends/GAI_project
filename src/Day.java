import java.util.HashMap;
import java.util.Random;

public class Day {
	HashMap<Integer, HourSlot> hourSlot = new HashMap<>();
	
	public Day() {
		super();
		hourSlot = new HashMap<>();
		
		Random rand = new Random();
		for(int i=0; i<24; i++) {
			Double preferenceLevel = rand.nextDouble();
			
			Double probNotAvailable = 0.25;
			Double availableValue = rand.nextDouble();
			Boolean isAvailable = (availableValue<probNotAvailable?false:true);
			hourSlot.put(i, new HourSlot(i, i+1, preferenceLevel, isAvailable));
		}
	}

	
	
	public HashMap<Integer, HourSlot> getHourSlot() {
		return hourSlot;
	}

	public void setHourSlot(HashMap<Integer, HourSlot> hourSlot) {
		this.hourSlot = hourSlot;
	}
	
	
}
