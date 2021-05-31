package activities_Ltts;
import java.util.Scanner;
abstract class HotelRoom{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	abstract void calculateTariff(int ratePerSqFeet);
	public int getRatePerSqFeet(){
		return 0;
	}	
}

class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;
	DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		this.ratePerSqFeet = 10;
	}
	public int getRatePerSqFeet(){
		if (hasWifi){
			ratePerSqFeet += 2;
		}
		return ratePerSqFeet;
	}
	public void calculateTariff(int ratePerSqFeet) {
		// TODO Auto-generated method stub
		int cost = (numberOfSqFeet * ratePerSqFeet);
		System.out.println(cost);
		
	}
}

class DeluxAcRoom extends DeluxeRoom{
	DeluxAcRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		super.ratePerSqFeet = 12;
	}
	
	public void calculateTariff(int ratePerSqFeet){
		int cost = ratePerSqFeet * numberOfSqFeet;
		System.out.println(cost);
	}
}

class SuiteAcRoom extends HotelRoom{
	private int ratePerSqFeet;
	SuiteAcRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet(){
		if (hasWifi)
				ratePerSqFeet += 2;
		return ratePerSqFeet;
	}
	
	public void calculateTariff(int ratePerSqFeet){
		int cost = (ratePerSqFeet * numberOfSqFeet);
		System.out.println(cost);
	}
}
public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice, rate;
		String tvchoice, wifichoice;
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV, hasWifi;
		System.out.println("Enter your choice:\n1. Deluxe Room:\n2. Deluxe AC Room:\n3. Suite AC Room: ");
		choice = sc.nextInt();
		System.out.println("Hotel Name: ");
		hotelName = sc.next();
		System.out.println("Room Square Feet Area: ");
		numberOfSqFeet = sc.nextInt();
		System.out.println("Room Has TV (Yes/No): ");
		tvchoice = sc.next();
		if (tvchoice.equals("Yes")){
			hasTV = true;
		} else {
			hasTV = false;
		}
		System.out.println("Room has Wifi (Yes/NO): ");
		wifichoice = sc.next();
		if(wifichoice.equals("Yes")){
			hasWifi = true;
		} else {
			hasWifi = false;
		}
		switch(choice){
		case 1:
			DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is: ");
			rate = dr.getRatePerSqFeet();
			dr.calculateTariff(rate);
			break;
		case 2:
			DeluxAcRoom dar = new DeluxAcRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is: ");
			rate = dar.getRatePerSqFeet();
			dar.calculateTariff(rate);
			break;
		case 3:
			SuiteAcRoom sar = new SuiteAcRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is: ");
			rate = sar.getRatePerSqFeet();
			sar.calculateTariff(rate);
			break;
		default:
			break;
		}
		sc.close();
	}

}
