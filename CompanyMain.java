package activities_Ltts;
import java.util.Scanner;
class Company{
	private String name;
	private String employees;
	private String teamlead;
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return name;
	}
	public void setEmployees(String newEmployees){
		this.employees = newEmployees;
	}
	public String[] getEmployees(){
		return employees.split(",");
	}
	public void setTeamLead(String newTeamlead){
		this.teamlead = newTeamlead;
	}
	public String getTeamLead(){
		return teamlead;
	}
	public void displayMessage(){
		int flag = 0;
		String[] list = employees.split(",");
		for(int i = 0; i < list.length; i++){
			if (teamlead.equals(list[i])){
				System.out.println("in this");
				flag = 1;
				break;
			}
		}
		if (flag == 1){
			System.out.println("name: "+name);
			System.out.println("Employees: "+employees);
			System.out.println("Lead: "+teamlead);
		} else {
			System.out.println("Invalid Input");
		}
	}
	
}

public class CompanyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name: ");
		String thename = sc.nextLine();
		System.out.println("Enter the employees: ");
		String theemployees = sc.next();
		System.out.println("Enter Team Lead: ");
		String theteamlead = sc.next();
		Company myObj = new Company();
		myObj.setEmployees(theemployees);
		myObj.setName(thename);
		myObj.setTeamLead(theteamlead);
		myObj.displayMessage();
		sc.close();
	}
}