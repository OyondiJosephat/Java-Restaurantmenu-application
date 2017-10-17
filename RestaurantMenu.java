/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmenu;
import java.util.*;
public class RestaurantMenu {
     static  Scanner sc= new Scanner(System.in);
public static   void menu(){
 
    int choice;
    double cost;
    double total=0;
    int quantity; 
    int paid;
    double bal = 0;
    String opt;
    String another;
    System.out.println("************************* MENU ***********************");
    System.out.println("1 milk: cost $3.5 ");
    System.out.println("2 chocolate: cost $2.3");
    System.out.println("3 bread: cost $2.5");
    System.out.println("4 cocacola 500ml: cost $5.0");
    System.out.println("5 fish: cost $10.0");
    System.out.println("6 picana: cost $13.25");
    System.out.println("7 orange juice 1000ml: cost $8.0");
    System.out.println("8 crisps: cost $4.5");
    System.out.println("9 Chapati: cost $ 6.0");
    System.out.println("10 Samosa: cost $4.5");
    System.out.println("******************************************************");
    restart: for(int i=0; i<20; i++){
    do{
        
        System.out.println("Select your meal using the numbers: ");
        choice=sc.nextInt();
    }while(choice !=1 && choice !=2 && choice !=3 && choice !=4 
            && choice !=5 && choice !=6 && choice !=7 && choice 
            !=8 && choice !=9 && choice !=10);
      
      
      if(choice == 1){
              System.out.println("You selected milk continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 3.5*quantity;
                total += cost;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 2){
              System.out.println("You selected Chocolate continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 2.3*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
              
      }else if(choice == 3){
              System.out.println("You selected bread continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 2.5*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
              
      }else if(choice == 4){
              System.out.println("You selected Cocacola continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 5.0*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 5){
              System.out.println("You selected Fish continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 10.0*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 6){
              System.out.println("You selected Picana continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 13.25*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 7){
              System.out.println("You selected Orange Juice continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 8.0*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 8){
              System.out.println("You selected Crisps continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 4.0*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 9){
              System.out.println("You selected Chapati continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 6.0*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                        
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else if(choice == 10){
              System.out.println("You selected Samosa continue? y / n");
              opt = sc.next();
              if(Objects.equals(opt, "y")){
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter Amount to pay: ");
                paid = sc.nextInt();
                cost= 4.5*quantity;
                if(cost > paid){
                    System.out.println("Sorry you have insufficient funds. Total cost is $ " + cost);
                    System.exit(1);
                }else{
                    bal = (double)(paid - cost);
                    System.out.println("Total cost is: "+ cost + "\nYour bal is : " + String.format( "%.2f", bal ));
                    System.out.println("Do you want to purchase another good? y / n");
                    another = sc.next();
                    if(Objects.equals(another, "y")){
                        continue restart;
                    }else{
                      System.out.println("Thanks working with us! welcome again!");
                      System.exit(0);
                    }
                }
              
              }else{
                  System.out.println("Transaction cancelled. Thanks!");
                  System.exit(0);
              }
      }else{
            System.out.println("Hey, enter number fitting from the menu list. Try again");
            System.exit(0);
              
      }
      
    }
      
    
}
    public static void main(String[] args) {
        RestaurantMenu obj = new RestaurantMenu();
        obj.menu();
    }
    
}
