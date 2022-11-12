/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolActivities;

/**
 *
 * @author kalmamigos
 */
import java.util.Scanner;
public class assignmentLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0,average;
        int i = 0;
       do{
           System.out.println("Enter a number: ");
           number =input.nextInt();
           total += number;
           i++;
       
       }while(number <= 100);
        System.out.println("Total: "+total);
        System.out.println("Total number of loops: "+i);
        average = total / i;
        System.out.println("Average: "+average);
    }
        
}
