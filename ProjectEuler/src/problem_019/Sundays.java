package problem_019;

public class Sundays {

	public static void main(String[] args) {
		new Sundays();
	}
	
	public Sundays(){
		long sum = 0;
		for(int i = 1901; i<2001; i++){
			sum += daysThisYear(i);
		}
		System.out.println((sum-6)/(double)7);
	}
	
	private int daysThisYear(int year){
		int base=30*4+31*7;
		int february = 28;
		if(year%100!=0 && year%4==0){
			february = 29;
		}
		else if(year%400 == 0){
			february = 29;
		}
		return base+february;
	}
	
}
