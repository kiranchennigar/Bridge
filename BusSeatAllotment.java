public class BusSeatAllotment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] arr=new boolean[41];
		int [] arr1= {3,5,12,5,11};
		for(int i:arr1) {
			if(i<1 || i>40) {
				System.out.println("seat "+i + " invalid seat number");
			}
			else if(arr[i]){
				System.out.println("seat "+ i + " Already Booked");
			}
			else {
				arr[i]=true;
				System.out.println("seat "+i+"booked");
			}
		}
	}

}

