import java.util.Scanner;

public class Numbers-14{
	public static void main(String[] args) {
		System.out.print("Input a number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = n % 10;
		if(m == 0 || m == 1 || m == 5 || m == 6){
			System.out.println("Automorphic Number.");
		}else{
			System.out.println("Not a Automorphic Number.");
		}
	}
}     