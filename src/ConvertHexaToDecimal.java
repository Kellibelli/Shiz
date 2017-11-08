import java.util.Scanner;

public class ConvertHexaToDecimal {

	  
    public static void main(String args[]) {
        // Ask user to enter an Hexadecimal number in Console
        System.out.println("Please enter Hexadecimal number : ");
        Scanner scanner = new Scanner(System.in);
      
        String hexadecimal = scanner.next();
      
        //Converting Hexa decimal number to Decimal in Java
        int decimal = Integer.parseInt(hexadecimal, 16);
      
        System.out.println("Converted Decimal number is : " + decimal);
    
        //Converting hexa decimal number to binary in Java       
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );
      
       
    }
}

