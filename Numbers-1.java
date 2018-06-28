import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an integer number: ");
    int n = input.nextInt();
	while(n > 1){
	  if(n % 2 ==0 || n % 3 == 0 || n % 5 == 0){
		if(n % 2 == 0){
		  n /= 2;
		}else if(n % 3 == 0){
		  n /= 3;
		}else{
		  n /= 5;	
		}
	  }else{
		System.out.println("It is not an ugly number.");
		return;
	  }
	}
	System.out.println("It is an ugly number.");
  }
}