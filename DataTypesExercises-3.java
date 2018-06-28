import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an integer between 0 and 1000: ");
    int number = input.nextInt();
    int temp = number;
    int count = 0;
    while(temp > 0){
      count += temp % 10;
      temp /= 10;
    }
    System.out.println("The sum of all digits in " + number + " is " + count);
  }
}