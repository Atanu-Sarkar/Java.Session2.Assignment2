package com.acadgild.session.two;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 1 and 100");
        
        for(int i=1; i < 100; i++){
               
        boolean isPrime = true;
       
        //check prime number
        for(int j=2; j < i ; j++){
           if(i % j == 0){
                    isPrime = false;
                    break;
            }
        }
        // print the number
        if(isPrime)
           System.out.print(i + " ");
        }


	}

}
