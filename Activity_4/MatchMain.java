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
	abstract void display(double reqRunRate, int balls);
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
		float a = getTarget() - getCurrentScore();
		reqRunRate = (a / noofballs);
		return reqRunRate;
	}
	public void display(double reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + String.format("%.2f",reqRunRate));
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
		float a = getTarget() - getCurrentScore();
		reqRunRate = (a / noofballs);
		return reqRunRate;
	}
	public void display(double reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + String.format("%.2f",reqRunRate));
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
		float a = getTarget() - getCurrentScore();
		reqRunRate = (a / noofballs);
		return reqRunRate;
	}
	public void display(double reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + String.format("%.2f",reqRunRate));
	}
}


public class Match_Activity {
	public static void main(String[] args) {
		System.out.println("Enter the match format\n1.ODI\n2.T20\n3.Test");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int cs, ts, balls;
		float co, rr;
		System.out.println("Enter the Current score");
		cs = sc.nextInt();
		System.out.println("Enter the current Over");
		co = sc.nextInt();
		System.out.println("Enter the Target Score");
		ts = sc.nextInt();
		switch(choice){
			case 1:
				ODIMatch om = new ODIMatch();
				om.setCurrentOver(co);
				om.setCurrentScore(cs);
				om.setTarget(ts);
				balls = om.calculateBalls();
				rr = om.calculateRunRate();
				System.out.println("Requirements: ");
				om.display(rr, balls);
				break;
			case 2:
				T20Match t20 = new T20Match();
				t20.setCurrentOver(co);
				t20.setCurrentScore(cs);
				t20.setTarget(ts);
				balls = t20.calculateBalls();
				rr = t20.calculateRunRate();
				System.out.println("Requirements: ");
				t20.display(rr, balls);
				break;
			case 3:
				TestMatch tm = new TestMatch();
				tm.setCurrentOver(co);
				tm.setCurrentScore(cs);
				tm.setTarget(ts);
				balls = tm.calculateBalls();
				rr = tm.calculateRunRate();
				System.out.println("Requirements: ");
				tm.display(rr, balls);
				break;
			default:		
				break;
		}
		sc.close();
	}
}