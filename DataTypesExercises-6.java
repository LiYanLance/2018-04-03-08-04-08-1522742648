import java.util.Scanner;

public class DataTypesExercises-6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input weight in pounds: ");
    double weight = scanner.nextDouble();
    weight *= 0.45359237;
    System.out.print("Input height in inches: ");
    double height = scanner.nextDouble();
    height *= 0.0254;
    double BMI = weight / (height * height);
    System.out.println("Body Mass Index is " + BMI);
  }
}