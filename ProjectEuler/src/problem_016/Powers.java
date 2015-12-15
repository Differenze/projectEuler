package problem_016;

import java.math.BigInteger;

public class Powers {
	public static void main(String[] args){
		new Powers();
	}
	
	public Powers() {
		BigInteger a = new BigInteger("2").pow(1000);
		String str = a.toString();
		
		int sum = 0;
		for(char c : str.toCharArray()){
			sum += Integer.parseInt("" + c);
		}
		System.out.println(sum);
	}
}
