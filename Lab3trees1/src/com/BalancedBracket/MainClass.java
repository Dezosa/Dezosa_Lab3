package com.BalancedBracket;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String inputValue;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter input Value:");
     inputValue=sc.nextLine();
     BalancedClass bc=new BalancedClass();
     if (bc.balancedParenthesis(inputValue))   
         System.out.println("Input string "+inputValue+" is balanced.");   
     else   
         System.out.println("Input string "+inputValue+" is not balanced."); 
     sc.close();
 } 
     
	}


