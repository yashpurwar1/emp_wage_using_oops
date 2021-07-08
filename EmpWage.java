package empWage;

public class EmpWage {
	static int wagePerHour = 20;
	static int partTimeHour = 4;
	static int fullDayHour = 8;
	static int maxDays = 20;
	static int maxHours = 100;

	public static void main(String[] args) {
		int dayWage = 0;
		int days, hour=0;
		int totalWage=0;
		for (days=1; days<=maxDays; days++) {
			if (hour>=maxHours) {
				break;
			}
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case 0:
				System.out.println("Employee is absent");
				dayWage=0;
				hour=hour+0;
				break;
			case 1:
				System.out.println("Employee is present");
				dayWage=wagePerHour*fullDayHour;
				System.out.println("DAily wage= "+dayWage);
				hour=hour+8;
				break;
			case 2:
				System.out.println("Employee parttime present");
				dayWage=partTimeHour*wagePerHour;
				System.out.println("Parttime wage = "+dayWage);
				hour=hour+4;
				break;
			}
			System.out.println(hour);
			totalWage=totalWage+dayWage;
		}
		System.out.println("Wage for the month is "+ totalWage);
	}
}
