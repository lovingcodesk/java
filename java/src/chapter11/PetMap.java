package chapter11;
import static net.mindview.util.Print.*;

import java.util.HashMap;
import java.util.Map;
class Pet{
	private String name;
	Pet(String name){
		this.name = name;
	}
	public String toString(){
		return this.name;
	}
}
public class PetMap {

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Pet("Molly"));
		petMap.put("My Dog", new Pet("Ginger"));
		petMap.put("My Hamster",new Pet("Bosco"));
		print(petMap);
		Pet dog = petMap.get("My Dog");
		print(petMap.containsKey("My Dog"));
		print(petMap.containsValue(dog));
	}

}
