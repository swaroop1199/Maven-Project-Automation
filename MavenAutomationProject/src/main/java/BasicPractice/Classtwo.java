package BasicPractice;

public class Classtwo {
	
	
	public Classtwo(){
		System.out.println("This is Class two Constructor");
	}
	

	public void display(){
		System.out.println("This is display method");
	}
	
	void display2(){
		System.out.println("This is display method 2");
	}
	
	
	
	public static void main(String[] args) {
	
		Classone t = new Classone();
		Classtwo t1 = new Classtwo();
		//t.addmethod();
		t.submethod();
		
		
		StringBuffer s = new StringBuffer("My name is Swaroop");
		s.reverse();
		System.out.println(s);
		
	}
	
}
