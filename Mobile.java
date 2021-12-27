package week1.day1;

public class Mobile {
	
	String mobileModel = "Nokia";
	
	public void makeCall() {
		System.out.println("calls connected");
		System.out.println(mobileModel);
		int mobileWeight = 1000;
		boolean isFullCharge = false;
		double mobileCost = 100000;
		
System.out.println(mobileWeight);
System.out.println(isFullCharge);
System.out.println(mobileCost);

}
	
	public void sendMsg() {
System.out.println("msg sent");
	}
	
	public static void main(String[] args) {

		Mobile callsFirst = new Mobile();
		Mobile callsSecond = new Mobile();
		
		callsFirst.makeCall();
		callsSecond.sendMsg();
		
		
		}
	
	}
