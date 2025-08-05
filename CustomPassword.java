public class CustomPassword {
	public static boolean isvowel(char ch) {
		ch=Character.toLowerCase(ch);
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}
	public static boolean isevendigit(char ch) {
		return ch=='2' || ch=='4' || ch=='6'|| ch=='8' || ch=='0';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java1234";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(isvowel(ch)) {
				res=res+"@";
			}
			else if(Character.isDigit(ch) && isevendigit(ch)) {
				res=res+"*";
			}
			else {
				res=res+Character.toUpperCase(ch);
			}
		}
		System.out.println(res);

	}

}
