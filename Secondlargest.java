import java.util.*;
 
class Secondlargest {
	public static void main(String args[])
	{
		 Scanner X=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=X.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){
            arr[i]=X.nextInt();

        }
  System.out.println("entered array is");
        for(int i: arr){ 

          
            System.out.println(i);

        }
		int secondl=a(arr);
		System.out.println("Second largest element in the array : "+ secondl);
	}
 
	public static int a(int array[])
	{
		int largest = Integer.MIN_VALUE;
		int secondl = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
 
			if (array[i] > largest) {
				secondl = largest;
				largest = array[i];
			} else if (array[i] > secondl)
				secondl = array[i];
		}
		return secondl;
	}
}