class Car{
	public void speed() {
		System.out.println("Car speed is : 100km/h");
	}
	
	public void color() {
		System.out.println("Car color is : Red");
	}
}
public class MethodOverriding extends Car {
	
	@Override
	public void speed() {
		System.out.println("Maruti car speed is 80km/h");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.speed();
		car.color();
		Car car1 = new MethodOverriding();
		car1.speed();
		car1.color();
		MethodOverriding car2 = new MethodOverriding();
		car2.color();
		car2.speed();
		
		
	}
}
