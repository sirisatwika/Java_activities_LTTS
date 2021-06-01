package activities_Ltts;
import java.util.Scanner;
class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}


	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}


	public String getInningsname() {
		return inningsname;
	}


	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public  void displayInningsDetails() {
		 System.out.println("Name: "+teamname);
		 String check = inningsname;
		 String f = "First";
		 //String s = "Second";
		 int checkrun = runs;
		 System.out.println("Scored: "+ checkrun);
		 if(check.equals(f)){
			 System.out.print("Need ");
			 System.out.print((checkrun + 1));
			 System.out.println(" to win"); 
		 }else{
			 System.out.println("Match Ended");
		 }		
	}
}
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
		
		myObj.displayInningsDetails();
	    sc.close();

	}

}