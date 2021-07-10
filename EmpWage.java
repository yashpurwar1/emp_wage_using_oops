package empWage;

public class EmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 80;
	
	public static int computeWage() {
		int empHrs=0, totalHrs=0, totalDays=0;
		while(totalHrs<= MAX_HRS_IN_MONTH &&
				totalDays<= NUM_OF_WORKING_DAYS) {
			totalDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalHrs += empHrs;
		}
		int totalWage = totalHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " +totalWage);
		return totalWage;
	}
	
	public static void main (String[] args ) {
		computeWage();
	}
}
