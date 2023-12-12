package ex2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        String name;
        int hour;
        double value, salary;

        System.out.print("Digite o número do funcionário: ");
        name = sc.nextLine();
        System.out.print("Digite o número de horas trabalhadas: ");
        hour = sc.nextInt();
        System.out.print("Digite o valor das horas: ");
        value = sc.nextDouble();

        salary = hour * value;

        System.out.println("Nome: " + name);
        System.out.printf("Salário: R$ %.2f%n", salary);
        sc.close();

    }
}
