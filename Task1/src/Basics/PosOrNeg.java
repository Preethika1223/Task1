package Basics;
import java.util.*;
public class PosOrNeg {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
        obj.close();
	}

}
