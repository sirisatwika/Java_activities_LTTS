package activities_Ltts;

public class Innings {
	  private String teamname;
	  private  String inningsname;
	  private   int runs;
	  
	  public  String getTeamname() {
	    return teamname;
	  }
	  public void setTeamname(String newTeamname) {
		  teamname = newTeamname;
	  }
	  
	  public  String getInningsname() {
		    return inningsname;
	  }
	  public  void setInningsname(String newInningsname) {
		  inningsname = newInningsname;
	  }
	  
	  public  int getRuns() {
		  return runs;
	  }
	  public  void setRuns(int newRuns) {
		  runs = newRuns;
	  }
	  
	public  void displayMessage() {
		
		 System.out.println("Name: "+getTeamname());
		 String check = getInningsname();
		 String f = "First";
		 //String s = "Second";
		 int checkrun = getRuns();
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
