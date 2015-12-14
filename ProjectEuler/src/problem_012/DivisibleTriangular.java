package problem_012;

public class DivisibleTriangular {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		new DivisibleTriangular();
		long stopTime = System.currentTimeMillis();
		System.out.println("Runtime: " + (stopTime-startTime));
	}
	
	public DivisibleTriangular() {
		int current = 0;
		int nextInt = 1;
		int divisors = 0;
		while(divisors<500){
			current += nextInt;
			nextInt += 1;
			divisors = getDivisors(current);
		}
		System.out.println(current + " : " + divisors);
	}

	private int getDivisors(int number) {
		int amount = 0;
		int max = number;
		for(int i=1; i<max; i++){
			if(number%i == 0){
				max = number/i;
//				System.out.println(number + " : " + i + " : " + number/i);
				amount+=2;
			}
		}
		return amount;
	}
}
