package chapter10;

class Parcel4{
	private class PContents implements Contents{
		private int i = 11;
		public int value(){
			System.out.println("111");
			return i;
		}
	}
	protected class PDestination implements Destination{
		private String label;
		private PDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel(){
			System.out.println(label);
			return label;
		}
	}
	public Destination destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}
}

public class TestParcel {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		c.value();
		Destination d = p.destination("Tasmania");
		d.readLabel();
//		Parcel4.PDestination pc = p.new PContents();
	}

}
