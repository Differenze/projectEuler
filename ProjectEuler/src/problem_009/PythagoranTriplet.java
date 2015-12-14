package problem_009;

public class PythagoranTriplet {
	
	public static void main(String[] args) throws InterruptedException{
		for(int a = 1; a<1000; a++){
			for(int b=a+1; b<1000-a; b++){
				int c = 1000-a-b;
//				System.out.println("trying:" + a + ", " + b + ", " + c);
				if(isTripplet(a, b, c)){
					System.out.println(a + "<" + b + "<" + c + "   " +  a*a + "+" + b*b + "=" + c*c + "a+b+c=" + (a+b+c));
					if(a+b+c == 1000){
						System.out.println("a*b*c=" + (a*b*c));
						break;
					}
				}
			}
		}
	}

	private static boolean isTripplet(int a, int b, int c) {
		if(a<b && b<c){
			if((a*a+b*b) == (c*c)){
				return true;
			}
		}
		return false;
	}
	
}
