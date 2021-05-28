package activities_Ltts;
import java.util.Scanner;
public class InningsMain {

	public static void main(String[] args) {
		
		Innings myObj = new Innings();
		Scanner sc = new Scanner(System.in);

		System.out.println( "Enter the team name:" );
		String theteamname = sc.nextLine();
		myObj.setTeamname( theteamname );

		System.out.println( "Enter session:" );
		String theinningsname= sc.nextLine();
		myObj.setInningsname( theinningsname );
		
		System.out.println( "Enter runs:" );
		int theruns = sc.nextInt();
		myObj.setRuns( theruns );
		
		myObj.displayMessage();
	    sc.close();

	}

}
