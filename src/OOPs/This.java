package OOPs;

class Employee{
	int id;
	String empName;
	
	void details(int id,String empName){
		this.id = id;
		this.empName = empName;
	}
	
	void show() {
		System.out.println("The employee id is "+ id + " and name is "+ empName);
	}
	
}

public class This {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.details(5, "umesh");
		employee.show();
		

	}

}
