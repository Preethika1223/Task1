package Basics;
import java.util.*;
public class FindAmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		if(amt<500) {
			System.out.println(amt);
		}
		else if(amt>=500 && amt<=1000) {
			double d=amt*0.9;
			System.out.println(d);
		}
		else {
			double d=amt*0.8;
			System.out.println(d);
		}
		sc.close();
	}

}
