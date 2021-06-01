package activities_Ltts;
import java.util.Scanner;
abstract class Match{
	private int currentScore;
	private float currentOver;
	private int target;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(float reqRunrate, int balls);
}

class ODIMatch extends Match{
	private int overs = 50;
	private int noofballs;
	private float reqRunRate;
	public int calculateBalls(){
		noofballs = (int)(overs - getCurrentOver());
		return noofballs*6;
	}
	public float calculateRunRate(){
		reqRunRate = (getCurrentScore() / getCurrentOver());
		return reqRunRate;
		
	}
	
	public void display(float reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + reqRunRate);
	}
}

class TestMatch extends Match{
	private int overs = 90;
	private int noofballs;
	private float reqRunRate;
	public int calculateBalls(){
		noofballs = (int)(overs - getCurrentOver());
		return noofballs*6;
	}
	public float calculateRunRate(){
		reqRunRate = (getCurrentScore() / getCurrentOver());
		return reqRunRate;
		
	}
	
	public void display(float reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + reqRunRate);
	}
}
class T20Match extends Match{
	private int overs = 20;
	private int noofballs;
	private float reqRunRate;
	public int calculateBalls(){
		noofballs = (int)(overs - getCurrentOver());
		return noofballs*6;
	}
	public float calculateRunRate(){
		reqRunRate = (getCurrentScore() / getCurrentOver());
		return reqRunRate;
		
	}
	
	public void display(float reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + reqRunRate);
	}
}


public class MatchMain {

	public static void main(String[] args) {
		System.out.println("Enter the match format\n1.ODI\n2.T20\n3.Test");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int currentScore, targetScore, balls;
		float currentOver, runRate;
		
		System.out.println("Enter the Current score");
		currentScore = sc.nextInt();
		System.out.println("Enter the current Over");
		currentOver = sc.nextInt();
		System.out.println("Enter the Target Score");
		targetScore = sc.nextInt();
		switch(choice){
			case 1:
				ODIMatch om = new ODIMatch();
				om.setCurrentOver(currentOver);
				om.setCurrentScore(currentScore);
				om.setTarget(targetScore);
				balls = om.calculateBalls();
				runRate = om.calculateRunRate();
				System.out.println("Requirements: ");
				om.display(runRate, balls);
				break;
			case 2:
				T20Match t20 = new T20Match();
				t20.setCurrentOver(currentOver);
				t20.setCurrentScore(currentScore);
				t20.setTarget(targetScore);
				balls = t20.calculateBalls();
				runRate = t20.calculateRunRate();
				System.out.println("Requirements: ");
				t20.display(runRate, balls);
				break;
			case 3:
				TestMatch tm = new TestMatch();
				tm.setCurrentOver(currentOver);
				tm.setCurrentScore(currentScore);
				tm.setTarget(targetScore);
				balls = tm.calculateBalls();
				runRate = tm.calculateRunRate();
				System.out.println("Requirements: ");
				tm.display(runRate, balls);
				break;
			default:		
				break;
		}
		sc.close();

	}

}
