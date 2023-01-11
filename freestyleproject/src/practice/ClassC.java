package practice;

public class ClassC {

	public static void main(String[] args) {
		System.out.println("inside main");
        remo();
	}
	public static void demo() {
		System.out.println("inside demo");
	}
	public static void hi() {
		System.out.println("inside hi");
		demo();
	}
	public static void remo() {
		System.out.println("inside remo");
		hi();
	}
	
	

}
