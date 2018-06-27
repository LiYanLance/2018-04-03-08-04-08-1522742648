import java.util.Scanner;

public class Numbers-11{
	public static void main(String[] args) {
		System.out.print("Input a number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 0, temp = n;
		for(int i = String.valueOf(n).length(); i > 0; i--){
			num += Math.pow(n%10, i);
			n /= 10;
		}
		System.out.println(num == temp ? "Disarium Number." : "Not a Disarium Number.");
	}
}     