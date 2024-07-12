package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Add add = new Add();
    	Sub sub = new Sub();
    	Mul mul = new Mul();
    	Div div = new Div();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">>");
    		String str = sc.nextLine();
    		
    	}
    	
    	sc.close();
    	
    	

    }
}
