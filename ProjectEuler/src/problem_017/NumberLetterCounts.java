package problem_017;

public class NumberLetterCounts {
	public static void main(String[] args) {
		new NumberLetterCounts();
	}
	
	String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
	
	public NumberLetterCounts(){
//		int i = 1234;
//		System.out.println(i/1000%10 + ":" + i/100%10 + ":" +i%100);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 1001; i++) {
			System.out.println(i + ":" + toLetters(i));
			sb.append(toLetters(i));
		}
		String str = sb.toString();
		str = str.replace(" ", "");
		System.out.println(str.length());
		
	}
	
	public String toLetters(int number){
		int thousands = number/1000%10;
		int hundreds = number/100%10;
		int tens = number%100;
		String thousand = thousands(thousands);
		String hundred = hundreds(hundreds);
		String ten = tens(tens);
//		if(thousand != "" && hundred != ""){
//			thousand+= " and ";
//		}
		if(hundred != "" && ten != ""){
			hundred+= " and ";
		}
		return thousand + " " + hundred + ten;
	}
	
	private String thousands(int thousands) {
		if(thousands == 0){
			return "";
		}
		return ones[thousands] + "thousand";
	}

	private String hundreds(int hundreds) {
		if(hundreds == 0){
			return "";
		}
		return ones[hundreds] + "hundred";
	}

	public String tens(int number){
		if(number < 20){
			return ones[number];
		}
		int first = number/10%10;
		int last = number%10;
		return tens[first] + " " + ones[last];
		
	}
	
}
