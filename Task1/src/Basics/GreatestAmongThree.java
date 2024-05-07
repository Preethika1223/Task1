package Basics;

import java.util.Scanner;

public class GreatestAmongThree {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2=obj.nextInt();
        int n3=obj.nextInt();
        if (n1>=n2 && n1>=n3) {
        	System.out.println(n1+" is greatest");	
        }
        else if(n2>=n3) {
        	System.out.println(n2+" is greatest");
        }
        else
        	System.out.println(n3+" is greatest");
        obj.close();
	}

}
