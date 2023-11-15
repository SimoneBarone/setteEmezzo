package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String[]mazzo = {"1b","2b","3b","4b","5b","6b","7b","donnab","cavallob","reb",
			         "1d","2d","3d","4d","5d","6d","7d","donnad","cavallod","red",
	                 "1s","2s","3s","4s","5s","6s","7s","donnab","cavallos","res",
	                 "1c","2c","3c","4c","5c","6c","7c","donnac","cavalloc","rec"};
	float [] valori= {1,2,3,4,5,6,7,0.5f,0.5f,0.5f,
			          1,2,3,4,5,6,7,0.5f,0.5f,0.5f,
			          1,2,3,4,5,6,7,0.5f,0.5f,0.5f,
			          1,2,3,4,5,6,7,0.5f,0.5f,0.5f};
	
	float contatore;
	Random r=new Random();
	int numeroGenerato;
	String risposta;
	System.out.println("Hai iniziato il gioco questa è la tua carta");	
	do {
		numeroGenerato=r.nextInt(40)+1;
		System.out.println(mazzo[numeroGenerato]);
		for (int i=0;i<valori.length;i++) {
			
		}
		System.out.println("Vuoi un'altra carta? si/no");
		risposta=sc.nextLine();
		contatore=valori[i];
		
		
		
	
		
		
	}while(risposta.equals("si"));
	
	
	    
	
	
	
			
			
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
}
