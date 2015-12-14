package problem_014;

public class Collaz {

	public static void main(String[] args) {
		new Collaz();
	}
	
	int currentMax = 0;
	
	public Collaz(){
		for(int i=1; i<1000000; i++){
			int current = length(i);
			if(current>currentMax){
				System.out.println(i);
				currentMax = current;
			}
		}
		System.out.println(currentMax);
			
	}
	
	private int nextNumber(int n){
		if(n%2==0){
			return n/2;
		}
		else{
			return 3*n+1;
		}
	}
	
	private int length(int number){
		int sum = 1;
		while(number != 1){
			sum += 1;
			number = nextNumber(number);
		}
		return sum;
	}

}
