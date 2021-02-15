import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class J5_EscapeRoom {
	
	// throw an IOException here so there is no need to handle errors later
	public static void main(String[] args) throws IOException {
		// READ INPUT
		BufferedReader input = new BufferedReader(new FileReader("j5.sample.in"));
		BufferedReader output = new BufferedReader(new FileReader("j5.sample.out"));
		System.out.println("Wanted answer: " + output.readLine());
		
		int M = Integer.parseInt(input.readLine());

		
		int N = Integer.parseInt(input.readLine());

		
		int [][] table = new int [M+1][N+1];
		
		// pass inputs into a table
		for (int i = 1; i < table.length; i++) {
			String row = input.readLine();
			String [] splitedRow = row.split(" ");
			
			for (int j = 1; j < table[i].length; j++) {
				table[i][j] = Integer.parseInt(splitedRow[j-1]);
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
 		}

		
		int currentValue = table[1][1];
		
		System.out.println("Start: " + currentValue);
		System.out.println("Target: " + table[M][N]);
		
		ArrayList<String> allPairsStart = new ArrayList<String>();
		allPairsStart = findFactorPair(table[1][1]);
		
		for (int j = 0; j < allPairsStart.size(); j++) {
			
			System.out.println();
			
			int a = Character.getNumericValue(allPairsStart.get(j).charAt(0));
			int b = Character.getNumericValue(allPairsStart.get(j).charAt(2));
			
			int value;
			
			try {	
				value = table[a][b];	
			} catch (Exception e) {
				continue;
			} 
			
			if (value == 0) {
				continue;
			}
			
			System.out.println("Finding value: " +  value);
			
			ArrayList<String> allPairs = new ArrayList<String>();
			allPairs = findFactorPair(value);
			
			System.out.println("number of pairs: " + allPairs.size());
			
			for (int i = 0; i < allPairs.size(); i++) {
			
				int x = Character.getNumericValue(allPairs.get(i).charAt(0));
				int y = Character.getNumericValue(allPairs.get(i).charAt(2));
				
				if (x < 0 || y < 0) {
					continue;
				}
				
				System.out.println("trying pair: " + x + "," + y);
				
				if ((x == M && y == N)) {
					System.out.println("yes");
					System.exit(0);
				}
				
				try {
					currentValue = table[x][y];
					System.out.println("current Value: " + currentValue);
					allPairs = findFactorPair(currentValue);				
				} catch (Exception e) {
					continue;
				}
				
				if (currentValue == 0) {
					continue;
				} 
		
			} // for allPairs		
		} // for allPairsStart
		
		System.out.println("no");
		System.exit(0);
		
		
	} // main
	
// Purpose: finding factors and its pair 
	public static ArrayList <String> findFactorPair (int num) {
		num = Math.abs(num);
		ArrayList<String> allPairs = new ArrayList<String>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				allPairs.add(i + "*" + (num/i));
			}
		}
		
		return allPairs;
		
	} // findFactorPair
	
	

} // J5
