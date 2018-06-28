import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
        int num = scanner.nextInt();
		for(int i = 2; Math.pow(2, i) <= num + 1; i = nextPrime(i)){
			if(Math.pow(2, i) - 1 == num){
				System.out.println(num + " is a Mersenne number.");
				return;
			}
		}
		System.out.println(num + " is not a Mersenne number.");
	}
	
	public static int nextPrime(int m){
		while(true){
			m++;
			int i = 2; 
			while(i < m){
				if(m % i == 0){
					break;
				}
				i++;
			}
			if(i == m){
				return m;
			}
		}
	}
}     