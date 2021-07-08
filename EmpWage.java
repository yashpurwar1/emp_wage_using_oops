package empWage;

public class EmpWage {
	static final int wagePerHour=20;
	static final int fullDayHour=8;
	public static void main(String[] args) {
		int dailyWage;
		int empCheck=(int) Math.floor(Math.random()*10)%2;
		if (empCheck==0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
			dailyWage=wagePerHour*fullDayHour;
			System.out.println("Daily wage= "+dailyWage);
		}
	}
}