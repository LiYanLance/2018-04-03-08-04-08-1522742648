import java.util.Scanner;

public class Numbers-13{
	public static void main(String[] args) {
		System.out.print("Input a number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = (int)Math.sqrt(n);
		while(num * (num + 1) <= n){
			if(num * (num + 1) == n){
				System.out.println("Pronic Number.");
				return;
			}
		}
		System.out.println("Not a Pronic Number.");
	}
}     