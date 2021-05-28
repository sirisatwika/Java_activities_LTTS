package activities_Ltts;
import java.util.Scanner;
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
