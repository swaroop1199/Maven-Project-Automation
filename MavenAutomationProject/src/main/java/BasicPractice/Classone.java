package BasicPractice;

public class Classone {


	public static void main(String[] args) {
		
		Classtwo t1 = new Classtwo();
		Classone t = new Classone();
		
		t1.display();
		t.addmethod();
		t.mulmethod();

	}
	
	
	
	 private void addmethod() {
		int a = 50;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void submethod() {
		int a = 100;
		int b = 80;
		int c = a - b;
		System.out.println(c);
	}
	
	
	protected void mulmethod() {
		int a = 10;
		int b = 2;
		int c = a * b;
		System.out.println(c);
	}
	

}
