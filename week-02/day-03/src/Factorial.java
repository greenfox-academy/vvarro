import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    System.out.println("Please give me a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println("The factorial of your number is: " + factorio(number));
  }

  public static int factorio(int number) {
    int multiply = 1;
    for (int i = number; i > 0; i--) {
      multiply = i * multiply;
    }
    return multiply;
  }
}

