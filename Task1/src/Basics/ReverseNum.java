package Basics;
import java.util.*;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }
        System.out.println(rev);
        obj.close();
	}

}
