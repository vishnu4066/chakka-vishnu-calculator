package calculator.simple;

import java.util.*;
public class App 
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		System.out.println("Simple-Calculator\nOption 1 for Addition\nOption 2 for SUBSTRACTION\nOption 3 for MULTIPLICATION\nOption 4 for DIVISION\nOption 0 for EXIT THE CALCULATOR");
    		System.out.print("Enter the opion:-");
    		int option=sc.nextInt();
    		double x,y;
    		switch(option){
    			case 0:
    				return ;
            	case 1:
                	System.out.println("Enter Two numbers:");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    Addition a=new Addition(x,y);
                    a.add();
                    break;
            	case 2:
                    System.out.println("Enter Two numbers:");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    Substraction s=new Substraction(x,y);
                    s.sub();
                    break;
            	case 3:
            		System.out.println("Enter Two numbers:");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    Multiplication m = new Multiplication(x,y);
                    m.multi();
                    break;
            	case 4:
            		System.out.println("Enter Two numbers:");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    Division d=new Division(x,y);
                    d.div();
                    break;
            	default :
                    System.out.println("Enter valid option");
    		}
    	}
    }
}
