import java.util.Scanner;

// Reads 3 float values representing the sides of a triangle and determines the type of triangle they form.
// The types are:
// - Equilateral: All three sides are equal.
// - Isosceles: Exactly two sides are equal.
// - Scalene: All three sides are different.
// Input: Three float values separated by spaces.
// Output: A single line indicating the type of triangle: "Equilateral", "Isosceles", or "Scalene". Output "Invalid" if the sides do not form a valid triangle.
// Example Input: 3.0 3.0 3.0
// Example Output: Equilateral
// Example Input: 3.0 4.0 3.0
// Example Output: Isosceles
public class TipoTriangulo {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String input = scan.nextLine();
      String[] parts = input.split(" ");
      float sideA = Float.parseFloat(parts[0]);
      float sideB = Float.parseFloat(parts[1]);
      float sideC = Float.parseFloat(parts[2]);
      if (sideA <= 0 || sideB <= 0 || sideC <= 0 ||
          sideA + sideB <= sideC ||
          sideA + sideC <= sideB ||
          sideB + sideC <= sideA) {
        System.out.println("invalido");
      } else if (sideA == sideB && sideB == sideC) {
        System.out.println("equilatero");
      } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
        System.out.println("isosceles");
      } else {
        System.out.println("escaleno");
      }
    }
  }
}
