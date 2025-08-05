import java.util.Scanner;

public class PatternLock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=1234;
		for(int i=0;i<5;i++) {
			System.out.println("enter the number");
			int res=sc.nextInt();
			if(i<5) {
			if(res==num) {
				System.out.println("success");
				break;
			}
			else {
				if(i==4) {
			System.out.println("lock the system");
			}
			}
		}
		}
		
		

	}

}
