public class VowelPuzzleChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abisude";
		int count=0;
		int a=s.length()-1;
		char ch1=s.charAt(0);
		char ch2=s.charAt(a);
		if((ch1=='a'|| ch1=='e'|| ch1=='i'|| ch1=='o'|| ch1=='u') && (ch2=='a'|| ch2=='e'|| ch2=='i'|| ch2=='o'|| ch2=='u')) {
			 for(int i=1;i<=s.length()-2;i++) {
				 if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u') {
					 count++;
				 }
			 }
		}
		if(count==2) {
			System.out.println("valid");
		}
	}

}

