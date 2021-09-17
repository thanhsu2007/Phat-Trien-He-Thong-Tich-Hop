package bt1;

import java.util.Scanner;

public class b5 {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			System.out.println("nhập n: ");
			int n= sc.nextInt();
			double[] a= new double[n];
			double sum = 0;
			for(int i=0;i<n;i++)
			{
				System.out.println("số"+(i+1)+":");
				a[i]=sc.nextDouble();
			}
			sc.close();
			for(int i=0;i<n;i++)
			{
				if (a[i]>0)
				{
					sum= sum +a[i];
				}
			}
			System.out.printf("tổng số dương là: %.1f",sum);		
	}		
}
