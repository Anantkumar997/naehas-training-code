
public class MethodOverLoading {
	
	public static void print(String name) {
		System.out.println(name);
	}

	public static void print(String name, int num) {
		System.out.println(name + " " + num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Anant");
		print("Anant", 123);

	}

}
