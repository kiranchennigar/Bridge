public class ExamHallSeatValidator {
	public static int check(int arr) {
		int res=arr%10;
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] arr= {21,34,44,52};
		for(int i=0;i<arr.length-1;i++) {
			int res=check(arr[i]);
			int res1=check(arr[i+1]);
			if(res==res1) {
				System.out.println("invalid - "+arr[i] +" and "+arr[i+1]+" have the same last digit");
			}
		}
	}

}