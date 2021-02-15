import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class J4_CyclicShifts {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//  System.out.println("Input:");
			String text = input.nextLine();
			String cyclic = input.nextLine();
			int max = cyclic.length(); // number of shifts
			
			if (text.contains(cyclic)) {
				System.out.println("yes");
				System.exit(0);
			}
			
			// build arrayList
			ArrayList<Character> cyclicArray = new ArrayList<Character>();
			for (int i = 0; i < max; i++) {
				cyclicArray.add(cyclic.charAt(i));
			}
			
			// shifting cyclic
			for (int i = 0; i < cyclicArray.size(); i++) {
				// delete first item, and add it to the end of the list
				char first = cyclicArray.get(0);
				cyclicArray.remove(0);
				cyclicArray.add(first);
				
				// copy char arrayList to a Strings
				String newCyclic = "";
				for (int j = 0; j < cyclicArray.size(); j++) {
					newCyclic += String.valueOf(cyclicArray.get(j));
				} // for
				
			//	System.out.println(newCyclic);
				
				if (text.contains(newCyclic)) {
					System.out.println("yes");
					System.exit(0);
				}
			} // for
			
			System.out.println("no");

	} // main

} // J4
