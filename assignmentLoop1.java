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
public class assignmentLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop = 0;
        String choice;
        int grade;
        boolean response;
        int total = 0,average;
        
        do{
            System.out.print("Do you want to enter grade? [1-yes:2-no]");
            choice = input.next();
            if(choice.equals("yes")){
                response = true;
                loop++;
                System.out.println("Enter a grade: ");
                grade = input.nextInt();
                total += grade;
            
            }
            else{
                response = false;
                 average = total / loop;
                System.out.println("Average: "+average);
               
                
            }
                        
        }while(response);
            
    }   
}
