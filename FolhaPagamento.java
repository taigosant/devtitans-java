import java.util.Scanner;

public class FolhaPagamento {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String input = scan.nextLine();
      String[] parts = input.split(" ");
      double hourlyWage = Double.parseDouble(parts[0]);
      int hoursWorked = Integer.parseInt(parts[1]);
      double totalSalary = hourlyWage * hoursWorked;
      double previdenceTax = totalSalary * 0.08;
      double incomeTax = totalSalary * 0.11;
      double totalDeductions = previdenceTax + incomeTax;
      double netSalary = totalSalary - totalDeductions;

      System.out.printf("Salario bruto: R$%.2f\n", totalSalary);
      System.out.printf("IR: R$%.2f\n", incomeTax);
      System.out.printf("INSS: R$%.2f\n", previdenceTax);
      System.out.printf("Total de descontos: R$%.2f\n", totalDeductions);
      System.out.printf("Salario liquido: R$%.2f\n", netSalary);
    }
  }
}
