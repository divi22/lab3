package lab3;

import java.util.Arrays;
import java.util.Scanner;


public class Reverse {
	public void getSorted(int[] num, int n2) {
		int n=n2;
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
			}
		}
		
	}
		for(int i=0;i<n;i++) {
			System.out.println(num[i]+"\t");
		}
	}
	
	public void getReverse(int[] num,int n) {
		String reverse="";
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			int temp=num[i];
			String s=Integer.toString(temp);
			str[i]=s;
		}
		for(int j=0;j<n;j++) {
			String temp=str[j];
			for(int i=temp.length()-1;i>0;i--) {
				reverse=reverse+temp.charAt(i);
			}
			str[j]=reverse;
			reverse="";
		}
		for(int i=0;i<n;i++) {
			System.out.println(str[i]+"\t");
		}
	}
	

	public static void main(String[] args) {
		try{
			Reverse r=new Reverse();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array:");
			int n=sc.nextInt();
			int[] num=new int[n];
			System.out.println("Enter element of array:");
			for(int i=0;i<n;i++) {
				num[i]=sc.nextInt();
			}
			r.getReverse(num, n);
			r.getSorted(num, n);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
