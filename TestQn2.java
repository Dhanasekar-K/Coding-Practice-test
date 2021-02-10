package dhanasekark;

class Employee1
{
	 String firstName;
      String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void display()
	{
		System.out.println("Employee name: " + firstName+ " "+ lastName);
	}

}

public class TestQn2 {

	public static void main(String[] args) {
		
		Employee1 a=new Employee1("Danny", "Morrison");
        a.display();
        
	}

}
