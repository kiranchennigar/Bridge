public class TeamAssignment {
	public static void balancedteams(int [] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]+ar[j]==sum/2) {
					System.out.println(ar[i]+","+ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40};
		balancedteams(arr);

	}

}
