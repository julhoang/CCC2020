import java.util.Arrays;
import java.util.Scanner;
public class J3_Arts {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//System.out.println("Max: ");
		int max = input.nextInt();
		
		int[] allXs = new int [max];
		int[] allYs = new int [max];
		
		input.nextLine(); // consume unwanted /n
		
		// getting all x and y coordinates
		// put into appropriate array
		for (int i = 0; i < max; i++) {
		//	System.out.print("Coordinate: ");
			String point = input.nextLine();
			String temp2Pts []= point.split(",");
			
			allXs[i] = Integer.parseInt(temp2Pts[0]);
			allYs[i] = Integer.parseInt(temp2Pts[1]);
		} // for
		
		// sort arrays ascending
		Arrays.sort(allXs); 
		Arrays.sort(allYs);
		
		// find corner points
		int bottomX = allXs[0] - 1; // minX - 1
		int bottomY = allYs[0] - 1;	// minY - 1
		
		int upperX = allXs[allXs.length - 1] + 1; // maxX + 1
		int upperY = allYs[allYs.length - 1] + 1; // maxY + 1
		
		// print result
		System.out.println(bottomX + "," + bottomY);
		System.out.println(upperX + "," + upperY);

	} // main

} // J3
