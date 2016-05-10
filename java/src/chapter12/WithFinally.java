package chapter12;

public class WithFinally {
	static Switch sw = new Switch();
	public static void main(String[] args) {
		try {
			sw.on();
			OnOffSwitch.f();
		} catch (OnOffException1 e) {
			// TODO: handle exception
			System.out.println("OnOffException1");
		}catch (OnOffException2 e) {
			// TODO: handle exception
			System.out.println("OnOffException2");
		}finally{
			sw.off();
		}
	}
	
}
