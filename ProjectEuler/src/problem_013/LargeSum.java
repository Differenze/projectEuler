package problem_013;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {
	
	
	public static void main(String[] args){
		try {
			new LargeSum();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public LargeSum() throws FileNotFoundException{
		Scanner scan = new Scanner(new BufferedReader(new FileReader("src/problem_13/data.txt")));
		BigInteger sum = new BigInteger("0");
//		scan.useDelimiter("\n");
		while (scan.hasNext()) {
			String str = scan.next();
			BigInteger num = new BigInteger(str);
//			System.out.println(num);
			sum = sum.add(num);
		}
		System.out.println(sum.toString().substring(0, 10));
	}
	
}
