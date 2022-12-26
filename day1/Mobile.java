package week1.day1;

public class Mobile {
public void makeCall() {
		System.out.println("Hello this is Abitha ");
		String mobileModel = "Vivo";
		float mobileWeight = 5.25f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		}
public void sendMsg() {
	System.out.println("How are you?");
	boolean FullCharged = true;
	int mobileCost = 18000;
	System.out.println(FullCharged);
	System.out.println(mobileCost);
}
public static void main(String[] args) {
	Mobile M1 = new Mobile();
	M1.makeCall();
	M1.sendMsg();
	System.out.println("This is My Mobile");
}
}


