package com.interf.defandstatmethods;

import java.util.Random;

import de.vandermeer.skb.interfaces.transformers.arrays2d.Array2D_To_String;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;


public class ImplementingClass implements B {
	
	private static final Random RAND = new Random();

	@Override
	public String bMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static boolean isPN(int number) {
		//ArrayList<Integer> prncurr = new ArrayList<Integer>();
		//boolean flag = false;
		//int count = 0;
		/**
		 * @category Corner case
		 * @{value number = 0} and @{value number = 1} are not <b>PN</b>
		 * IF @{value number == 0} OR @{value number == 1}
		 */
		if (number == 0 || number == 1) {
			return false;
		} //else {
		/**
		 * Check from 2 to number - 1
		 */
		for (int i = 2; i < number; i++) {
			/**
			 * Condition for the <b>PN</b>
			 */
			if (number % i == 0) {
				return false;
			}	
		}
		return true;	
	}
	
	public static boolean isPN1(int n) {
		//ArrayList<Integer> prncurr = new ArrayList<Integer>();
		int count = 0;

	    // negative numbers, 0 and 1 are not prime
	    if (n < 2) {
	    	//System.out.println ("The given is number " + n + " is not prime");
	    	//System.exit (0);
	    	return false;
	     }
	    // checking the number of divisors b/w [1, n]
	    for (int i = 1; i <= n; i++) {
		if (n % i == 0)
		  count += 1;
	    }

	    // if count of divisors greater than 2 then its not prime 
	    if (count > 2)
	    	return false;
	      	//System.out.println ("The given is number " + n + " is not prime");

	    else
	    	return true;
	      //System.out.println ("The given is number " + n + " is prime");
	  }

	
	public static ArrayList<Integer> writeDownPNs(int num) {
		ArrayList<Integer> prncurr = new ArrayList<Integer>();
		ArrayList<Integer> prncurr01 = new ArrayList<Integer>();
		if (isPN(num))
			prncurr.add(num);
		if (isPN1(num))
			prncurr01.add(num);
		return prncurr;
	}
		
	public static void main(String[] args) {
		ArrayList<Integer> prncurr = new ArrayList<Integer>();
		ArrayList<Integer> prncurr01 = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++) {
			out.println("number-01 = " + i + ", isPN-01 = " + isPN(i));
			out.println("number-02 = " + i + ", isPN-02 = " + isPN1(i));
			if (isPN(i))
				prncurr.add(i);
			if (isPN1(i))
				prncurr01.add(i);
		}
		int[] pn = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		ArrayList<Integer> prndef = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
		out.println("PNs DEFAULT:::::::::: " + prndef);
		out.println("PNs CURRENT-01::::::: " + prncurr);
		out.println("PNs CURRENT-02::::::: " + prncurr01);
	
	}

	

	

}
