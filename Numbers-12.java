import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		System.out.print("Input a number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 0, temp = n;
		for(int i = String.valueOf(n).length(); i > 0; i--){
			num += temp%10;
			temp /= 10;
		}
		System.out.println(n + " is " + (n%num == 0 ? "" : "not ") + "a Harshad Number.");
	}
}     