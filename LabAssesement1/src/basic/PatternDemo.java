package basic;
/*
  program:2
  @author:Rajshree Gaikwad
  @Date: 13 Oct 2022
 */


import java.util.Scanner;
public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		System.out.println(" priting the pattern");
		 for (int i=1;i<=num;i++)
		 {
			 for (int j=1;j<=i;j++)
			 {
				 System.out.print(j +" ");
	
		}
		
		for (int k=i-1;k>=1;k--)
		{
			System.out.print(k + " ");
			
		}
		System.out.println();
		 }
		 
		 
	}

	}


