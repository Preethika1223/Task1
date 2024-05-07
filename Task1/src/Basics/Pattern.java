package Basics;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num=n;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
			}
			for(int k=i+1;k<n;k++) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
