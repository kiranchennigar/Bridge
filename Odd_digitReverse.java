public class Odd_digitReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		String res="";
		while(num!=0) {
			int rem=num%10;
			if(rem%2!=0) {
				res=res+rem;
			}
			num=num/10;
		}
		System.out.println(res);

	}

}

