abstract class Car1{
	
	abstract void speed();
	
	void color() {
		System.out.println("red");
	}
}

class Test extends Car1{
	@Override
	void speed() {
		
		System.out.println("80km/h");
		
	}
	@Override
	void color() {
		System.out.println("Black");
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.speed();
		t1.color();
	}
	
	
}

