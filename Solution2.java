public class Solution2 {
	public int sumDigits(String s) {
		/*
		 * For each character in the string, 
			* check if it is a digit
				* if so, convert it into an integer
				*add the integer value to sum
		*/
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isDigit(c)) {
				String sb = new String();
				sb = s.substring(i,i+1);
				sum = sum + Integer.parseInt(sb);
				
			}
		}
			return sum;
		}
		public static void main(String[] args) {
			Solution2 s1=new Solution2();
			String s=new String("a1b2hgae5");
			System.out.println(s1.sumDigits(s));
		}
}