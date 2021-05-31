package activities_Ltts;
import java.util.Scanner;
class Employee {
	  private String name;
	  private  String address;
	  private   String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
	public  void displayMessage() {
		 System.out.println("Name: "+getName());
		 System.out.println("Address: "+getAddress());
		 System.out.println("Mobile: "+getMobile());
		
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		Employee myObj = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println( "Enter the name:" );
		String theName = sc.nextLine();
		myObj.setName( theName );

		System.out.println( "Enter Address:" );
		String theAddress = sc.nextLine();
		myObj.setAddress( theAddress );
		
		System.out.println( "Enter Mobile:" );
		String theMobile = sc.nextLine();
		myObj.setMobile( theMobile );
		
		System.out.println("Employee Details");
		myObj.displayMessage();
	    sc.close();
	}

}
