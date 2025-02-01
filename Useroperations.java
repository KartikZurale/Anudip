import java.util.Scanner;

public class Useroperations {

	public static void displayEvenNumbers() {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min number");
		int min = sc.nextInt();
		System.out.println("Enter max number");
		int max = sc.nextInt();
		for(int i= min ;i<=max ;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
		//is prime
		public static void checkPrime() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num == 0|| num==1) {
			System.out.println(num +" Is not a prime number");
		}
		for(int i = 2; i<=num/2 ;i++) {
			if(num % i==0) {
				System.out.println(num +" Is not a prime number");
				break;
			}
			else System.out.println(num +" Is a prime number");
			break;
		}
	
	}
		//Palindrome ;
		public static void isPalindrome() {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter a number");
			 int num = sc.nextInt();
			 int revNum=0;
			 int Original = num;
			 while(num != 0) {
				 int lastdigit = num% 10;
				 revNum = (revNum *10) +lastdigit;
				 num = num/10;
			 }
			if (revNum == Original) {
				System.out.println(Original +" is a Palindrome Number"); 
			 }
			else {
				System.out.println(Original +" is not a Palindrome Number");
			}
			 }
		
		//Armstrong
		public static void isArmstrong() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num = sc.nextInt();
		 
		 int sum =0 ;
		 int Original = num;
		 while(num != 0) {
			 int lastdigit = num% 10;
			 sum = sum + (lastdigit*lastdigit*lastdigit);
			 num = num/10;
		 }
			if (sum == Original) {
				System.out.println(Original +" is a Armstrong Number"); 
			 }
			else {
				System.out.println(Original +" is not a Armstrong Number");
			}
			
		}
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		        while (true) {
		            System.out.println("\nChoose an option:");
		            System.out.println("1. Display even numbers in a range");
		            System.out.println("2. Check if a number is prime");
		            System.out.println("3. Check if a number is a palindrome");
		            System.out.println("4. Check if a number is an Armstrong number");
		            System.out.println("5. Exit");
		            
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            
		            switch (choice) {
		                case 1:
		                    displayEvenNumbers();
		                    break;
		                case 2:
		                    checkPrime();
		                    break;
		                case 3:
		                	isPalindrome();
		                    break;
		                case 4:
		                	isArmstrong();
		                	break;
		                default:
		                	System.out.println("Enter valid Input");
		            }
		}
}
	}
