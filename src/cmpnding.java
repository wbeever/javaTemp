
public class cmpnding {
	
	//A=P(1+R)^n == amount, principal, rate, n=years

	public static void main(String[] args) {
		double amount;
		double principal = 10000;
		double rate = .01;
		
		for (int day=1;day<=20;day++) {
			amount=principal*Math.pow(1 + rate, day);
			System.out.println(day + " " + amount);
		}
	}

}
