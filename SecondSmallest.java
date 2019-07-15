package lab3;

import java.util.*;

public class SecondSmallest {
	//method to get second smallest number from array
	public static int getSecondSmallest(int[] a) {
	  Arrays.sort(a);
		return a[1];
		}
	//main method
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter elements of array:");
	for(int i=0;i<n;i++) {
		String num=sc.next();
	try {
		int n1=Integer.parseInt(num);
		a[i]=n1;
	}
	catch(NumberFormatException ex) {
		System.out.println("Invalid number");
	}
		
	}
	SecondSmallest ss=new SecondSmallest();
	System.out.println("Second smallest element is:"+ss.getSecondSmallest(a));
	}
catch(Exception e) {
	e.printStackTrace();
}
}
}
