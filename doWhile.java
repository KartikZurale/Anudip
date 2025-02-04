import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);

		        
		        char ans;
		        int Choice1 = 1, Choice2 = 2, Choice3 = 3, Choice4 = 4, Choice5 = 5;

		        int totalBill = 0; 

		        do {
		        	System.out.println("1. Starters...\n2. Main Menu...\n3. Drinks...\n4. Desserts...\n5.For Bill");
		            int user = sc.nextInt();
		            if (user == Choice1) {
		                System.out.println("1. Item1.............100\n2. Item2.............120\n3. Item3.............130\n4. Item4.............140");
		                int choice = sc.nextInt();
		                switch (choice) {
		                    case 1:
		                        System.out.println("Item1 added to your order.............100");
		                        totalBill += 100; // Adding price to total bill
		                        break;
		                    case 2:
		                        System.out.println("Item2 added to your order.............120");
		                        totalBill += 120;
		                        break;
		                    case 3:
		                        System.out.println("Item3 added to your order.............130");
		                        totalBill += 130;
		                        break;
		                    case 4:
		                        System.out.println("Item4 added to your order.............140");
		                        totalBill += 140;
		                        break;
		                    default:
		                        System.out.println("Invalid Input");
		                        break;
		                }
		            }
		            if (user == Choice2) {
		                System.out.println("1. Mutter Paneer............180\n2. Paneer Tikka............170\n3. Chicken Thali.............200\n4. Veg Thali................140");
		                int choice = sc.nextInt();
		                switch (choice) {
		                    case 1:
		                        System.out.println("Mutter Paneer added to your order............180");
		                        totalBill += 180;
		                        break;
		                    case 2:
		                        System.out.println("Paneer Tikka added to your order............170");
		                        totalBill += 170;
		                        break;
		                    case 3:
		                        System.out.println("Chicken Thali added to your order.............200");
		                        totalBill += 200;
		                        break;
		                    case 4:
		                        System.out.println("Veg Thali added to your order................140");
		                        totalBill += 140;
		                        break;
		                    default:
		                        System.out.println("Invalid Input");
		                        break;
		                }
		            }
		            if (user == Choice3) {
		                System.out.println("1. Coke.............50\n2. Lemonade.............40\n3. Coffee.............60");
		                int choice = sc.nextInt();
		                switch (choice) {
		                    case 1:
		                        System.out.println("Coke added to your order.............50");
		                        totalBill += 50;
		                        break;
		                    case 2:
		                        System.out.println("Lemonade added to your order.............40");
		                        totalBill += 40;
		                        break;
		                    case 3:
		                        System.out.println("Coffee added to your order.............60");
		                        totalBill += 60;
		                        break;
		                    default:
		                        System.out.println("Invalid Input");
		                        break;
		                }
		            }
		            if (user == Choice4) {
		                System.out.println("1. Ice Cream.............80\n2. Gulab Jamun.............60\n3. Brownie.............100");
		                int choice = sc.nextInt();
		                switch (choice) {
		                    case 1:
		                        System.out.println("Ice Cream added to your order.............80");
		                        totalBill += 80;
		                        break;
		                    case 2:
		                        System.out.println("Gulab Jamun added to your order.............60");
		                        totalBill += 60;
		                        break;
		                    case 3:
		                        System.out.println("Brownie added to your order.............100");
		                        totalBill += 100;
		                        break;
		                    default:
		                        System.out.println("Invalid Input");
		                        break;
		                }
		            }
		            if (user == Choice5) {
		                System.out.println("Generating Bill...");
		                System.out.println("Total Bill Amount: " + totalBill);
		                break; 
		            }
		            System.out.println("Do you want to add any other item: Y/N");
		            ans = sc.next().charAt(0);
		            if(ans == 'Y' || ans == 'y') {
		             System.out.println();
		            }else {
		            	System.out.println("Invalid Input");
		            	System.out.println("total bill is:" + totalBill +"\nThank You For Visiting Our Restaurant" +"\n Visit Again....");
		            }
		        } while (ans == 'Y' || ans == 'y'|| ans=='N' || ans=='n' );

		        sc.close();
		    }
		

	}


