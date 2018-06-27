import java.util.Scanner;

public class Numbers-24{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		String nStr = scanner.nextLine();
		int left = 0, right = nStr.length() - 1;
		while(left <= right){
			if(nStr.charAt(left) != nStr.charAt(right)){
				System.out.print("It is not a Palindrome number.");
				return;
			}
			left++;
			right--;
		}
		System.out.print("It is a Palindrome number.");
	}
}     