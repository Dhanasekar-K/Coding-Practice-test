package dhanasekark;

class Employee
{
	private String firstName;
	private String lastName;
	
	public Employee()//Constructor
	{
	}

	public String getFirstName() //Setters and Getters
	{
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	}
		

public class TestQn3 {

	public static void main(String[] args) {
		
		Employee e=new Employee();//object creation
		e.setFirstName("Randy");
		e.setLastName("orton");
       
		System.out.print(e.getFirstName()+" ");
		System.out.println(e.getLastName());
		
			}

}
