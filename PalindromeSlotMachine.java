public class PalindromeSlotMachine {
	public static int check1(int num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=res+rem;
			num=num/10;
		}
		return res;
	}
	public static int check(int num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=363;
		int res=check(num);
		//System.out.println(res);
		if(res==num) {
			int lres=check1(res);
			//System.out.println(lres);
			if(lres%3==0) {
				System.out.println("Jackpot!");
			}
		}

	}

}

