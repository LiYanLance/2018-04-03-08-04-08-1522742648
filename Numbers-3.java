import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the starting number of the range: ");
	int start = scanner.nextInt(); 
    System.out.print("Input the ending number of the range: ");
	int end = scanner.nextInt(); 
	int result = start + (int)(Math.random() * ((end - start) + 1));
	System.out.println(result);
  }
}