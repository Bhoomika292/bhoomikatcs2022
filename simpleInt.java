package firstpgm;

import java.util.Scanner;

public class simpleInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          float p,t,r,sinterest;
          Scanner scan =new Scanner(System.in);
          System.out.println("enter the principal :");
          p=scan.nextFloat();
          System.out.println("enter the rate of interest:");
          r=scan.nextFloat();
          System.out.println("enter the time period:");
          t=scan.nextFloat();
          scan.close();
          sinterest =(p*t*r)/100;
          System.out.println("simple interest is:"+sinterest);
          
	}

}
