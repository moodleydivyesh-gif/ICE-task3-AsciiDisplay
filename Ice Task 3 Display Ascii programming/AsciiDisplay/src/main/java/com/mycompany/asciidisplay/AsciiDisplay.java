/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asciidisplay;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class AsciiDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Accept a String 
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        
        //  loop the characters 
        for(int i = 0;i<input.length(); i++){
            char ch = input.charAt(i);
            //Print the characters and the Ascii value 
            System.out.println(ch + "->" + (int) ch);
        }
        scanner.close();
    }
}
