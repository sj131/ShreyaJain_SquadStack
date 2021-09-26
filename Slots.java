import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Slots {
	
  // creating a list of slots from 1 to n where 1 is nearest to entry.
	public static List<Integer> slots = new ArrayList<Integer>(); 
	public static int totCapacity; 
	
  // creating getters and setters for variables under Slots object.
	public static List<Integer> getSlots() {
		return slots;
	}
	
	public static void setSlots() {
		for(int i = 1; i <= totCapacity; i++)
			slots.add(i);
	}
	
	public static int getTotCapacity() {
		return totCapacity;
	}
	
	public static void setTotCapacity(int totCapacity) {
		Slots.totCapacity = totCapacity;
	}
	
  // remove an existing slot
	public static List<Integer> removeSlot(List<Integer> l, int i) {
		l.remove(i);
		return l;
	}
	
  // add a new slot
	public static List<Integer> addSlot(List<Integer> l, int v) {    
		l.add(v);
		return l;
	}
	
  // sort the slots so that the next vehicle gets a slot nearest to the entry
	public static List<Integer> sortSlots(List<Integer> l) {    
		Collections.sort(l);
		return l;
	}
	
	
	
}
