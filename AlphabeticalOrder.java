package lab3;

import java.util.Scanner;
public class AlphabeticalOrder {
	
		public void getSorted(String[] str) {
			int up=0;
			int n=str.length;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(str[i].compareTo(str[j])>0)
					{
						String temp=str[i];
						str[i]=str[j];
						str[j]=temp;
						
					}
				}
			
				
			}
			if(n%2==0) {
				up=n/2;
			}
			else {
				up=(n/2)+1;
			}
			for(int i=0;i<up;i++)
			{
				str[i]=str[i].toUpperCase();
			}
			System.out.println("\n");
			for(int i=0;i<n;i++) {
				System.out.println(str[i]+"\t");
			}
		}
	
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		AlphabeticalOrder ao=new AlphabeticalOrder();
		System.out.println("Enter number of elments in array:");
		int n=sc.nextInt();
		System.out.println("Enter Character");
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		ao.getSorted(str);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
			
		}
}