

abstract class Car{
	
	abstract void speed();
	
	void color() {
		System.out.println("red");
	}
}

class Test extends Car{
	@Override
	void speed() {
		
		System.out.println("80km/h");
		
	}
	@Override
	void color() {
		System.out.println("Black");
	}
	
	public static void main(String[] args) {
		
	}
	
	
}

