import java.util.Scanner;

public class Personaltitles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		char gender =sc.next().charAt(0);
		if(gender == 'm' ) {
			if(age>=16) {
				System.out.println("Mr.");
			}else {
				System.out.println("Master");
			}
		}
		else if(gender == 'f') {
			if(age>=16) {
				System.out.println("Ms.");
			}else {
				System.out.println("Miss");
			}
		}
         sc.close();
	}
}
