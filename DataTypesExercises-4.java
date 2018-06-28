import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input the number of minutes: ");
    int minutes = input.nextInt();
    int year = 0, day = 0;
    year = minutes / (60 * 24 * 365);
    day = (minutes - (year * 60 * 24 * 365)) / (60 * 24);
    System.out.println(minutes + " minutes is approximately " + 
		(year > 0 ?  year + " years and " : "") + day + " days");
  }
}