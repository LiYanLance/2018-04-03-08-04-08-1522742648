import java.util.Scanner;

public class Numbers-15{
	public static void main(String[] args) {
		System.out.print("Input a number:");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		if(!n.startsWith("0") && n.contains("0")){
			System.out.println("Duck number");
		}else{
			System.out.println("Not a Duck number");
		}
	}
}     