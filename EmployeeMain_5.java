package activities_Ltts;
import java.util.Scanner;
class EmployeeDetails{
	private String name;
	private  String address;
	private   String mobile;
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void dispalyDetails() {
		
		System.out.println("Name: " + name);
		System.out.println( "Address: " + address);
		System.out.println("Mobile: " + mobile);
	}  
}
public class EmployeeMain_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDetails myObj = new EmployeeDetails();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter mobile: ");
		String mobile = sc.next();
		myObj.setName(name);
		myObj.setAddress(address);
		myObj.setMobile(mobile);
		System.out.println("Employee Details");
		myObj.dispalyDetails();
		System.out.println("Menu\n1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
		int option = sc.nextInt();
		switch(option){
		case 1:
			System.out.println("Current name is: "+myObj.getName()+"\nEnter the name:");
			name  = sc.next();
			myObj.setName(name);
			break;
		case 2:
			System.out.println("Current address is: "+myObj.getAddress()+"\nEnter the address:");
			address = sc.next();
			myObj.setAddress(address);
			break;
		case 3:
			System.out.println("Current mobile is: "+myObj.getMobile()+"\nEnter the mobile:");
			mobile = sc.next();
			myObj.setMobile(mobile);
			break;
		case 4:
			System.out.println("The details are:\n");
			myObj.dispalyDetails();
			break;
			
		}
		sc.close();

	}

}
