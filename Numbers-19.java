import java.util.Scanner;

public class Numbers-19{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = scanner.nextInt();
		String nStr = String.valueOf(num);
		int len = nStr.length(), i = 1;
		while(i < len){
			int newNum = num * i;
			while(newNum > 0){
				if(!nStr.contains(String.valueOf(newNum % 10))){
					System.out.print("It is not a cyclic number.");
					return;
				}
				newNum /= 10;
			}
			i++;
		}
		System.out.print("It is a cyclic number.");
	}
}     