public class AirportBoadring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {101,103,102,104};
		int [] res=new int[arr.length];
		for(int k=0;k<=arr.length-1;k++) {
			res[k]=arr[k];
		}
		//int [] res=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}

	}
		int count=0;
		for(int m=0;m<=arr.length-1;m++) {
		if(arr[m]==res[m]) {
			count++;
		}
		}
		System.out.println(count-1);

}

}