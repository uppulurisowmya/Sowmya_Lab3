package assignment1.pojo;

public class HrDepartment extends SuperDepartment{
	
	
	
	public HrDepartment() {
		System.out.println("\nWelcome to "+departmentName());
		System.out.println(""+doActivity());
		System.out.println(""+getTodaysWork());
		System.out.println(""+getWorkDeadline());
		System.out.println(""+isTodayAHoliday());
	}

	String departmentName() {
		return "Hr Department" ;
	}
	
	String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance" ;
	}
	
	String getWorkDeadline() {
		return "Complete by EOD" ;
	}
	
	String doActivity() {
		return "team Lunch" ;
	}

}
