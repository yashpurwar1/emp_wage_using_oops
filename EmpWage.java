package empWage;

public class EmpWage {
	static int wagePerHour = 20;
	static int partTimeHour = 4;
	static int fullDayHour = 8;

	public static void main(String[] args) {
		int dailyWage, partTimeWage;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is present");
			dailyWage = wagePerHour * fullDayHour;
			System.out.println("DAily wage= " + dailyWage);
			break;
		case 2:
			System.out.println("Employee parttime present");
			partTimeWage = partTimeHour * wagePerHour;
			System.out.println("Parttime wage = " + partTimeWage);
			break;
		}
	}
}