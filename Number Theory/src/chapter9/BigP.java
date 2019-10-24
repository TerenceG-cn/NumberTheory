package chapter9;

import java.math.BigInteger;
import java.util.Scanner;
//´óËØÊıÅĞ¶¨ 
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
