import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		System.out.print("Input a number:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 0;
		do{
			num = 0;
			while(n > 0){
				num += (int)Math.pow((n % 10), 2);
				n /= 10;
			}
			n = num;

		}while(num >= 10);
		if(num == 1){
			System.out.print("Happy Number");
		}else{
			System.out.print("Unhappy Number");
		}
	}
}     