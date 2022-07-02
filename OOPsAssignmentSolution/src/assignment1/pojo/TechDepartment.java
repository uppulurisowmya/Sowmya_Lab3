package assignment1.pojo;

public class TechDepartment extends SuperDepartment{
	
	public TechDepartment() {
		System.out.println("\nWelcome to "+departmentName());
		System.out.println(""+getTodaysWork());
		System.out.println(""+getWorkDeadline());
		System.out.println(""+getTechStackInformation());
		System.out.println(""+isTodayAHoliday());
	}
	
	String departmentName() {
		return "Tech Department" ;
	}
	
	String getTodaysWork() {
		return "Complete coding of module 1" ;
	}
	
	String getWorkDeadline() {
		return "Complete by EOD" ;
	}
	
	String getTechStackInformation() {
		return "core Java" ;
	}

}
