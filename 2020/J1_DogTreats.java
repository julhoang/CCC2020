import java.util.Scanner;

public class J1_DogTreats {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
		
			// System.out.println("Insert small, medium, large treat: ");
			
			int small = input.nextInt();
			int med = input.nextInt();
			int big = input.nextInt();
			
			int totalScore = small + med * 2 + big * 3;
			
			if (totalScore >= 10) {
				System.out.println("happy");
			} else {
				System.out.println("sad");
			}

	} // main

} // J1
