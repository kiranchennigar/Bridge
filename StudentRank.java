public class StudentRank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {50,80,60};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		for(int k=0;k<=arr.length-1;k++) {
			System.out.println(arr[k]);
		}

	}

}
