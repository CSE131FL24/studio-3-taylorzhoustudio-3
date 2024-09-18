package studio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		int start = 1; //help to generate the list dont rly need otherwise 
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("what n value do you choose? ");
		
		int nVal = in.nextInt();
		
		int prime = 2;
		
		boolean isPrime;
		
		int multiple; 
		
		//int [] nonPrimeNums = new int[nVal]; 
		 
		
		ArrayList <Integer> list  = new ArrayList <Integer> (nVal); //prime number list
		
		
		ArrayList <Integer> nonPrimeNums  = new ArrayList <Integer> (nVal); //take non prime nums out of og list and stick it into this one
		
		for(int i = 0; i < list.size(); i++) {
			
			list.add(i, start);
			
			System.out.println(list);
			
			start ++;
			
			
		}
		
		
		for(int i = 0; i < list.size(); i++) {
			
			
				for(int m = 2; m < (nVal/prime); m++) {
					
					multiple = prime*m;
					
					nonPrimeNums.add(multiple);
					
					list.remove(multiple); 
					
					/*for(int n = 0; n < nonPrimeNums.length; n++) {
						
						list[n] = multiple;
						
						
					}
					*/
					
				}
				
				
			
			
			
			}
		
		

	}

}
