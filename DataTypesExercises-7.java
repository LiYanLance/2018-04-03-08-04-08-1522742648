import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input distance in meters: ");
    float distance = scanner.nextFloat ();
    System.out.print("Input hour: ");
    int hour = scanner.nextInt();
	System.out.print("Input minutes: ");
    int minutes = scanner.nextInt();
	System.out.print("Input seconds: ");
    int seconds = scanner.nextInt();
    
	float speed = distance / ((hour * 60 + minutes) * 60 + seconds);
	System.out.println("Your speed in meters/second is " + speed);
	
	speed = (distance/1000.0f) / (hour + minutes/60.0f + seconds/3600.0f);
	System.out.println("Your speed in km/h is " + speed);
	
	speed = (distance/1609.0f) / (hour + minutes/60.0f + seconds/3600.0f);
	System.out.println("Your speed in miles/h is " + speed);
  }
}