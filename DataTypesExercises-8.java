import java.util.Scanner;

public class DataTypesExercises-8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the side length value: ");
    float length = scanner.nextFloat();

    System.out.printf("Square: %8.2f\n", length * length);
    System.out.printf("Cube: %8.2f\n", Math.pow(length, 3));
    System.out.printf("Fourth power: %8.2f\n", Math.pow(length, 4));
  }
}