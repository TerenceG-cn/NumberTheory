package com.tce.slgl.chapter09;

import java.math.BigInteger;
import java.util.Scanner;
//大素数判定 
public class BigP {
	public static void main(String args[]){  
        
        Scanner cin = new Scanner(System.in);  
        while(cin.hasNext()){  
            BigInteger m = cin.nextBigInteger();  
            if(m.isProbablePrime(1)){  
                System.out.println("Yes");  
            }  
            else{  
                System.out.println("No");  
            }  
        }  
    }  

}
