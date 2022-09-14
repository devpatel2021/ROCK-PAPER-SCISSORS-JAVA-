 import java.util.*;

  class Main{
     public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     Random x = new Random();
     
    
     int PAPER = 1;
     int ROCK = 2;
     int SCISSORS = 3;
     int UChoice, CompChoice;
     do{
         System.out.println("Welcome to the Rock Paper Scissor game:\n 1:Paper\n 2: Rock\n 3: Scissors\n 4: Quit:");
         UChoice = in.nextInt();
         CompChoice = x.nextInt(3) + 1;
      
        if(UChoice == PAPER){
             if(CompChoice == PAPER){
                System.out.println("Paper versus Paper: Tie Game");
             }
             else if(CompChoice == ROCK){
                System.out.println("Paper versus Rock: You Lose");  
             }
              else if(CompChoice == SCISSORS){
            System.out.println("Paper versus Scissors: You Won");  
             }
        }
        if(UChoice == ROCK){
             if(CompChoice == PAPER){
               System.out.println("Rock versus Paper: You Lose");
             }
             else if(CompChoice == ROCK){
               System.out.println("ROCK versus Rock: Tie Game");  
             }
             else if(CompChoice == SCISSORS){
              System.out.println("Rock versus Scissors: You Won");  
             } 
        }
        if(UChoice == SCISSORS){
             if(CompChoice == PAPER){
              System.out.println("SCISSORS versus Paper: You Lose");
              }
             else if(CompChoice == ROCK){
              System.out.println("SCISSORS versus Rock: Tie Game");  
              }
             else if(CompChoice == SCISSORS){
              System.out.println("SCISSORS versus Scissors: You Won");  
              }  
        }
        }while(UChoice != 4);
     System.out.println("Thank You for Playing have a nice day");
     
    
    }   

     }
    