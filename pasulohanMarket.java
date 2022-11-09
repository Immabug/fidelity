/**
* Name: Ryan Jay R. Pasulohan
* Section: Fidelity
* Year: 4th Year
*/

import java.util.Scanner;
public class pasulohanMarket{
    public static int partial = 0;
    public static int total;
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        
        boolean response;
        String wantOrder;
        String[] foods = new String[100];
        int chicken = 25, hamburger = 30, spag = 20;
        
        String[] drinks = new String[100];
        int coke = 15, royal = 15, juice = 10;
        
        String[] snacks = new String[100];
        int biscuits = 10, crackers = 8, chocolates = 15;
        
        int food=0,drink=0,snack=0;
        String order;
        do{
            
            System.out.print("Do you want to order?: ");
            wantOrder = input.next(); 
            
            
                
            
            if(wantOrder.equalsIgnoreCase("yes")){ //to ask a user for there order
                
                System.out.println("Select option");
                System.out.println("1-Food\t\t2-Drinks\t\t3-Snacks");
                int option = input.nextInt();
                switch(option){
                    case 1: { //foods category
                        food++;
                        System.out.println("CHICKEN(25)\t\tHAMBURGER(30)\t\tSPAGHETTI(20)");         
                        foods[food] = input.next();
                            if(foods[food].equalsIgnoreCase("CHICKEN")){
                                partial += chicken;
                            }
                            else if(foods[food].equalsIgnoreCase("HAMBURGER")){
                                partial += hamburger;
                            }
                            else if(foods[food].equalsIgnoreCase("SPAGHETTI")){
                                partial += spag;
                            }
                            else{
                                System.out.println("invalid input");
                            }
                        System.out.println("----------------------------------");
                        System.out.println("Partial Total Payment: "+partial);
                        System.out.println("----------------------------------");
				break;
                    }
                    case 2: { //drinks category
                        drink++;
                        System.out.println("COKE(15)\t\tROYAL(15)\t\tJUICE(10)");
                        drinks[drink] = input.next();
                        if(drinks[drink].equalsIgnoreCase("COKE")){
                                partial += coke;
                            }
                            else if(drinks[drink].equalsIgnoreCase("ROYAL")){
                                partial += royal;
                            }
                            else if(drinks[drink].equalsIgnoreCase("JUICE")){
                                partial += juice;
                            }
                            else{
                                System.out.println("invalid input");
                            }
                        System.out.println("----------------------------------");
                        System.out.println("Partial Total Payment: "+partial);
                        System.out.println("----------------------------------");
				break;
                    }
                    case 3: { //snacks category
                        snack++;
                        System.out.println("BISCUITS(10)\t\tCRACKERS(8)\t\tCHOCOLATES(15)");
                        snacks[snack] = input.next();
                        if(snacks[snack].equalsIgnoreCase("BISCUITS")){
                                partial += biscuits;
                            }
                            else if(snacks[snack].equalsIgnoreCase("CRACKERS")){
                                partial += crackers;
                            }
                            else if(snacks[snack].equalsIgnoreCase("CHOCOLATES")){
                                partial += chocolates;
                            }
                            else{
                                System.out.println("invalid input");
                            }
                        System.out.println("----------------------------------");
                        System.out.println("Partial Total Payment: "+partial);
                        System.out.println("----------------------------------");
				break;
                    }
                    default: { //if user enters a number not in option
                        System.out.println("invalid input");
				break;
                    }
                }
                
                
                response = true;
            }
            
            else{
                //to display there orders and total payments
                //start
                if(food < 1 ){ // no result to display if no foods ordered
                    
                }
                else{ // output for foods
                    Thread.sleep(1000);
                    System.out.println("-------------------------------------");
                    System.out.println("\nFoods ordered:");
                    for(int i = 1; i <= food; i++)
                    {
                        System.out.println(foods[i]);
                    }System.out.println("Number of foods: "+food);
                }
                if(drink < 1 ){ // no result to display if no drinks ordered
                    
                }
                
                else{// output for drinks
                    Thread.sleep(1000);
                    System.out.println("-------------------------------------");
                System.out.println("\ndrinks ordered: ");
                    for(int i = 1; i <= drink; i++){
                     System.out.println(drinks[i]);
                    }System.out.println("Number of drinks: "+drink);
                }
                if(snack < 1 ){ // no result to display if no snacks ordered
                    
                }
                else{ //output for snacks
                    {
                        Thread.sleep(1000);
                System.out.println("-------------------------------------");
                System.out.println("\nSnacks ordered: ");
                }
                    for(int i = 1; i <= snack; i++){
                        System.out.println(snacks[i]);
                    }System.out.println("Number of snacks: "+snack);
                }//end of results
                
                
                //payment
                Thread.sleep(1000);
                System.out.println("==============================");
                System.out.println("Total amount to pay: "+partial);
                System.out.print("Enter your Cash: ");
                int cash = input.nextInt();
                float change = cash - partial;
                System.out.println("Your change is: "+change);
                response = false;
            }
        }while(response);
        
    }
    
}