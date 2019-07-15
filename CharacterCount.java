package lab3;

import java.util.Scanner;

public class CharacterCount {
	
	public int getOccurrence() {
		int count=0,temp=0,i=0,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter how many character you want to enter");
			int num=sc.nextInt();
			char[] c=new char[num];
			for(i=0;i<num;i++) {
				System.out.println("Enter"+(i+1)+"character:");
				c[i]=sc.next().toLowerCase().charAt(0);
			}
			for(i=0;i<c.length;i++) {
				count=0;temp=0;
				for(j=0;j<c.length;j++) {
					if(c[i]==c[j])
					{
						count+=1;
					}
				}
				for(k=i;k>=0;k--) {
					if(c[i]==c[k]) {
						temp+=1;
					}
				}
				if(temp<=1) {
					System.out.println("Count for " +c[i]+" are: "+count);
				}
			}
		}
			catch(Exception e) {
				System.out.println("Enter only positive numbers");
			}
			return count;
		}
		
	public static void main(String[] args) {
		CharacterCount cc=new CharacterCount();
		int res=cc.getOccurrence();
		
		
		
	}
	}
		
		
		
			
			
		
		
