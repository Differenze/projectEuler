package problem_010;

import java.util.ArrayList;

public class PrimeSum {

	public static void main(String[] args) {
		new PrimeSum();
	}
	
	ArrayList<Integer> primes;
	
	public PrimeSum(){
		primes = new ArrayList<>();
		primes.add(2);
		
		long sum = 2;
		for(int i=3; i<2000000; i+=2){
			if(isPrime(i)){
				primes.add(i);
				sum += i;
//				System.out.println(i);
//				System.out.println(sum);
			}
		}
		System.out.println(sum);
		System.out.println(primes.get(10000));
		
		
	}

	private boolean isPrime(int num) {
		for(Integer div : primes){
			if(div>Math.sqrt(num)){
				return true;
			}
			if(num%div == 0){
				return false;
			}
		}
		return true;
	}

}
