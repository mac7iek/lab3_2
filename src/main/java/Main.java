import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj znak, którym chcesz stworzyć trójkąt: ");
    char symbol = scanner.next().charAt(0);

    System.out.println("podaj jego wysokość: ");
    int height = scanner.nextInt();
    for(int i = 1; i <= height; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(symbol + " ");
      }
       System.out.println();
    }
  }
}
