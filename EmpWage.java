package empWage;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println(empCheck);
		if (empCheck == 0) {
			System.out.println("Employee is absent");
		} else {
			System.out.println("Employee is present");
		}
	}
}