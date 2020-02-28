package com.epam3.epam3;
import java.util.Scanner;

public class calculate {
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the first operand:");
	        float first = in.nextFloat();
	        System.out.println("Enter the Second operand:");
	        float second = in.nextFloat();
	        System.out.println("Enter the operation you wish to do:");
	        String operand = in.next();       
	        if(operand.equals("+")){
	            add ad = new add(first, second);
	            System.out.println(ad.addtwonumbers(first, second));
	        }
	        else if(operand.equals("-")){
	            sub su = new sub(first, second);
	            System.out.println(su.subtwonumbers(first,second));
	        }
	        else if(operand.equals("*")){
	            mul mu = new mul(first, second);
	            System.out.println(mu.multwonumbers(first, second));
	        }
	        else if(operand.equals("/")){
	            div di = new div(first, second);
	            System.out.println(di.dividetwonumbers(first, second));
	        }
	        else{
	            System.out.println("No such option is available in our calculator");
	        }
	        
	    }
	}
