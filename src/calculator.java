import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner calcy = new Scanner(System.in);
		double fnum, gnum, answer;
		System.out.println("Enter first numkber: ");
		fnum = calcy.nextDouble(); //'next' moves to next type 'double'
		System.out.println("Enter second numkber: ");
		gnum = calcy.nextDouble();
		answer = fnum + gnum;
		System.out.println(answer);
		calcy.close();
		
		/*More math
		 * Math.ceil() rounds up
		 * Math.max(8,9) returns largest number
		 * Math.min(8,9) returns 8
		 * Math.pow(5,3) 5 to the 3rd power
		 * Math.sqrt(9) square root
		 */
	}

}
