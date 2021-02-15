import java.util.Scanner;
public class J2_Epidemiology {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//	System.out.println("P, N, R: ");
			
		int P = input.nextInt();
		int N = input.nextInt();
		int R = input.nextInt();
		
		int totalAffected = 0;
		int day = 0;
		int affected = 0;
		
		while (true) {
			affected = (int) (N * Math.pow(R, day));
		//	System.out.println("Number affected on day " + day + ": " + affected);
			totalAffected += affected;
		
			if (totalAffected > P) {
				System.out.println(day);
				break;
			} else {
				day++;
			}
		} // while

	} // main

} // J2
