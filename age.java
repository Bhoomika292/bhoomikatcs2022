package firstpgm;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan =new Scanner (System.in);
       int age = scan.nextInt();
       if( age < 16) {
    	   System.out.println("sorry you are old enough to drive");
    	   
       }
       else {
    	   System.out.println("happy driving");
       }
	}

}
