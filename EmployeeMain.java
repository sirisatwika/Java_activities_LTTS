package activities_Ltts;
import java.util.Scanner;
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
