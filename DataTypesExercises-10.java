import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input six non-negative digits: "); 
	String val = scanner.nextLine();
	System.out.print(val.charAt(0) - '0');
	for(int i = 1; i < val.length(); i++){
	  System.out.print(" " + (val.charAt(i) - '0'));
	}
  }
}