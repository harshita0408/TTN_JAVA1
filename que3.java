package Java3;

import java.util.*;
public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("******* menu *******");
System.out.println("1.Calculate area of circle");
System.out.println("2.Calculate circumfrenece of circle");
System.out.println("3.Exit");

Scanner scn = new Scanner(System.in);
int n=  scn.nextInt();
switch(n) {
case 1:
	double r=scn.nextDouble();
	double a=3.14*r*r;
	System.out.println("Area of circle="+a);
case 2:
	double x=scn.nextDouble();
	double c=2*3.14*x;
	System.out.println("Circumference of circle="+c);
case 3:
	System.out.println("Exit");
	break;
	
}

	}

}
