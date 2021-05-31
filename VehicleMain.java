package activities_Ltts;
import java.util.Scanner;
class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc){
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	void make(){
		System.out.println(make);
	}
	void displayBasicInfo(){
		System.out.println("Vehicle Number: "+ vehicleNumber);
		System.out.println("Fuel Capacity: "+ fuelCapacity);
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("CC: " + cc);
		
	}
	void setMake(String make){
		this.make = make;
	}
	String getMake(){
		return make;
	}
	void setVehicleNumber(String vehicleNumber){
		this.vehicleNumber = vehicleNumber;
	}
	String getVehicleNumber(){
		return vehicleNumber;
	}
	void setFuelType(String fuelType){
		this.fuelType = fuelType;
	}
	String getFuelType(){
		return fuelType;
	}
	void setFuelCapacity(int fuelCapacity){
		this.fuelCapacity = fuelCapacity;
	}
	int getFuelCapacity(){
		return fuelCapacity;
	}
	void setCc(int cc){
		this.cc = cc;
	}
	int getCc(){
		return cc;
	}
	
	void displayDetailedInfo(){
		
	}
}

class TwoWheeler extends Vehicle{
	private boolean KickStartAvailable;
	TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStart){
		super(make, vehicleNumber,fuelType,fuelCapacity,cc);
		this.KickStartAvailable = kickStart;
	}
	public void displayDetailedInfo(){
		if (KickStartAvailable == true)
			System.out.println("Kick Start Available: YES");
		else
			System.out.println("Kick Start Available: NO");
	}
	
	public void setKickStartAvailable(boolean kickStart){
		this.KickStartAvailable = kickStart;
	}
	public boolean getKickStartAvailable(){
		return KickStartAvailable;
	}
}

class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors){
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailedInfo(){
		System.out.println("Audio System: " + audioSystem);
		System.out.println("Number of Doors: " + numberOfDoors);
	}
	
	public void setAudioSystem(String audioSystem){
		this.audioSystem = audioSystem;
	}
	public String getAudioSystem(){
		return audioSystem;
	}
	public void setNumberOfDoors(int numberOfDoors){
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfDoors(){
		return numberOfDoors;
	}
}

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice, fuelChoice;
		String vehMake, vehNumber, fuelType, audioSystem, kick;
		int cc, fuelCapacity, numberOfDoors;
		boolean kickStart;
		System.out.println("1. Two Wheeler");
		System.out.println("2. Four Wheeler");
		System.out.println("Enter Vehicle Type: ");
		choice = sc.nextInt();
		System.out.println("Vehicle Make: ");
		vehMake = sc.next();
		System.out.println("Vehicle Number: ");
		vehNumber = sc.next();
		System.out.println("Fuel Type: ");
		System.out.println("1. Petrol");
		System.out.println("2. Diesel");
		fuelChoice = sc.nextInt();
		if (fuelChoice == 1){
			fuelType = "Petrol";
		} else {
			fuelType = "Diesel";
		}
		System.out.println("Fuel Capacity: ");
		fuelCapacity = sc.nextInt();
		System.out.println("Engine CC: ");
		cc = sc.nextInt();
		switch (choice){
		
		case 1:
			System.out.println("Kick Start available (Yes/No): ");
			kick = sc.next();
			if (kick.equals("Yes")){
				kickStart = true;
			}else {
				kickStart = false;
			}
			TwoWheeler tw = new TwoWheeler(vehMake, vehNumber, fuelType, fuelCapacity, cc, kickStart);
			System.out.println("*"+tw.getMake()+"*");
			System.out.println("--- Basic information ---");
			tw.displayBasicInfo();
			System.out.println("--- Detail Information ---");
			tw.displayDetailedInfo();
			break;
		case 2:
			System.out.println("Audio System: ");
			audioSystem = sc.next();
			System.out.println("Number of Doors: ");
			numberOfDoors = sc.nextInt();
			FourWheeler fw = new FourWheeler(vehMake, vehNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			System.out.println("*"+fw.getMake()+"*");
			System.out.println("--- Basic Information ---");
			fw.displayBasicInfo();
			System.out.println("--- Detailed Information ---");
			fw.displayDetailedInfo();
			break;
			
			default:
			break;
		}
		sc.close();
	}

}