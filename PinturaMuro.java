
import java.util.Scanner;

public class PinturaMuro {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      float wallCostPerM2 = scan.nextFloat();
      float wallHeight = 3.0f;
      float wallWidth = 12.0f;
      float wallArea = wallHeight * wallWidth;
      float totalCost = wallArea * wallCostPerM2 + 100.0f;
      System.out.printf("%.1f\n", totalCost);
    }
  }
}
