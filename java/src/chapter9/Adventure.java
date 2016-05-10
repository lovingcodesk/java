package chapter9;

interface CanFight{
	void fight();
}

interface CanSwim{
	void Swim();
}

interface CanFly{
	void fly();
}

class ActionCharacter{
	public void fight(){
		
	}
}

class Hero extends ActionCharacter 
	implements CanFight,CanSwim,CanFly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Swim() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Adventure  {
	public static void t(CanFight x){
		x.fight();
	}
	public static void u(CanSwim x){
		x.Swim();
	}
	public static void v(CanFly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}

}
