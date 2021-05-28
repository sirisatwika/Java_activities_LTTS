package activities_Ltts;

public class Customer {
	  private String name;
	  private  String address;
	  private   String mobile;
	  
	  public  String getName() {
	    return name;
	  }
	  public void setName(String newName) {
		  name = newName;
	  }
	  
	  public  String getAddress() {
		    return address;
	  }
	  public  void setAddress(String newAddress) {
		  address = newAddress;
	  }
	  
	  public  String getMobile() {
		  return mobile;
	  }
	  public  void setMobile(String newMobile) {
		  mobile = newMobile;
	  }
	  
	public  void displayMessage() {
		 System.out.println("Name: "+getName());
		 System.out.println("Address: "+getAddress());
		 System.out.println("Mobile: "+getMobile());
		
	}

}
