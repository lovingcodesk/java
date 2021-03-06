package chapter9.interfaces.nesting;

class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		public void f(){}
	}
	public class BImp2 implements B{
		public void f(){}
	}
	public interface C{
		void f();
	}
	class CImp implements C{
		public void f(){}
	}
	private class CImp2 implements C{
		public void f(){}
	}
	private interface D{
		void f();
	}
	private class DImp implements D{
		public void f(){}
	}
	private class DImp2 implements D{
		public void f(){}
	}
	public D getD(){
		return new DImp2();
	}
	private D dRef;
	public void receiveD(D d){
		dRef = d;
		dRef.f();
	}
}
interface E{
	interface G{
		void f();
	}
	interface H{
		void f();
	}
	void g();
//	private interface I{}
}

public class NestingInterfaces {
	public class BImp implements A.B{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class CImp implements A.C{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class EImp implements E{
		public void g(){}
	}
	class EGImp implements E.G{
		public void f(){}
	}
	class EImp2 implements E{
		public void g(){}
		class EG implements E.G{
			public void f(){}
		}
	}
	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());
//		chapter9.interfaces.nesting.A.D d = a.getD();
//		A.DImp2 di2 = a.getD();
//		a.getD().f();
	}

}
