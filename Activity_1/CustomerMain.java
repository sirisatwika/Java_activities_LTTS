package activities_Ltts;
import java.util.Scanner;
class Customer {
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
public class CustomerMain {
	public static void main(String[] args) {
		Customer myObj = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String Str = sc.nextLine();
		String array1[]= Str.split(",");
		myObj.setName(array1[0]);
		myObj.setAddress(array1[1]);
		myObj.setMobile(array1[2]);
		myObj.displayMessage();
		sc.close();
	}
}
