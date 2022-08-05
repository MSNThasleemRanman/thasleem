
//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
//Test Data Input an integer between 0 and 1000: 565 
//Expected Output : The sum of all digits in 565 is 16 
//‌
package com.besant.assinment1;
public class AddAllTheDigits {

	public static void main(String[] args) {
	
        
        int num = 565;

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        
        int fourthDigit = remainingNumber % 10;
        
        int sum = firstDigit+ SecondDigit+ thirdDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);


	}
}	
//result:
//	Input an integer between 0 and 1000:
//		The sum of all digits in 565 is 16	
	



