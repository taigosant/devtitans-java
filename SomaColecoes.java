import java.util.Scanner;

// Reads a line of integers separated by spaces, 
// sums them up, and prints the total sum.
// Every -1 in the input indicates the end of a collection,
// and the sum should be printed before starting a new collection.
// The program ends when receives an empty collection (i.e., two consecutive -1s).
// Input: A line of integers separated by spaces, ending with -1 for each collection.
// Output: The sum of each collection printed on a new line.
// Example Input: 1 2 3 -1 4 5 -1 -1
// Example Output:
// 6
// 9

public class SomaColecoes {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String input = scan.nextLine();
      String[] parts = input.split(" ");
      int sum = 0;
      boolean hasNumbers = false;
      for (String part : parts) {
        int number = Integer.parseInt(part);
        if (number == -1) {
          if (hasNumbers) {
            System.out.println(sum);
            sum = 0;
            hasNumbers = false;
          } else {
            break; // End of input
          }
        } else {
          sum += number;
          hasNumbers = true;
        }
      }
    }
  }
}
