import java.util.Scanner;

public class Numbers-16{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int first = scanner.nextInt();
		System.out.print("Input the second number: ");
		int second = scanner.nextInt();
		if(getSumOfDivisors(first) == getSumOfDivisors(second)){
			System.out.println("These numbers are amicable.");
		}else{
			System.out.println("These numbers are not amicable.");
		}
	}
	
	public static int getSumOfDivisors(int n){
		int sum = 0, i = 1;
		while(i <= n){
			if(n % i == 0){
				sum += i;
			}
			i++;
		}
		return sum;
	}
}     