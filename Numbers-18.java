import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = scanner.nextInt();
		int temp = (int)Math.pow(n, 1/3);
		for(int i = temp; i < n; i++){
			if(i * i * i == n){
				System.out.println("Number is a cube.");
				break;
			}
			if(i * i * i > n){
				System.out.println("Number is not a cube.");
				break;
			}
		}	
	}
}     