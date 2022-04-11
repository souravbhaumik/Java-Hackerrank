import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class JavaCurrencyFormatter {        // You need to change this className to "Solution"
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        String nUS = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        String nIN = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        // Note ->   In java 15 you'll get the Indian currency sign. You have to downgrade it to Java 8 to get the output as Hackerrank wants.
        
        String nCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        String nFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        System.out.println("US: " + nUS);
        System.out.println("India: " + nIN);
        System.out.println("China: " + nCHINA);
        System.out.println("France: " + nFRANCE);
    }
}