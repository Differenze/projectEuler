package problem_014;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollazBetter {

	public static void main(String[] args) {
		new CollazBetter();
	}
	
	HashMap<BigInteger, Integer> foundNumbers = new HashMap<BigInteger, Integer>(1000000);
	int currentMax = 0;
	ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
	
	public CollazBetter(){
		
		BigInteger n;
		BigInteger longestChain = new BigInteger("0");
		for(int i=1; i<1000000; i++){
			n = new BigInteger("" + i);
			int current = length(n);
			if(current>currentMax){
				currentMax = current;
				longestChain = n;
			}
//			System.out.println(n + ":" + current);
		}
		System.out.println("and the winner is:" + longestChain + " with a length of " + currentMax);
	}
	
	private BigInteger nextNumber(BigInteger number){
		if(number.mod(new BigInteger("2")).equals(new BigInteger("0"))){
			return number.divide(new BigInteger("2"));
		}
		else{
			return number.multiply(new BigInteger("3")).add(new BigInteger("1"));
		}
	}
	
	
	private int length(BigInteger number){
//		System.out.println(number);
		if(number.equals(new BigInteger("1"))){
			return 1;
		}
		if(foundNumbers.containsKey(number)){
			return foundNumbers.get(number);
		}
		int length = length(nextNumber(number))+1; 
		foundNumbers.put(number, length);
		return length;
	}

}
