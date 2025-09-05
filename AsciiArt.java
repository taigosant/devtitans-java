import java.util.Scanner;

// Complete the code to print an ASCII art based on the number of lines specified in the input.
// The ASCII art should consist of a pattern of characters that forms a simple shape or design.
// For example, if the input is 5, the output could be a inverted pyramid shape made of asterisks.
// Input: An integer representing the number of lines to draw.
// Output: The ASCII art pattern printed to the console.
// Example Input: 5
// Example Output:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class AsciiArt {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      float linesToDraw = scan.nextInt();
      for (int i = 0; i < linesToDraw; i++) {
        for (int j = 0; j < linesToDraw - i; j++) {
          System.out.print("*");
        }
        for (int k = 0; k < i * 2; k++) {
          System.out.print(" ");
        }
        for (int j = 0; j < linesToDraw - i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
