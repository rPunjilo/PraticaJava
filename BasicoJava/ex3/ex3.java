package ex3;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int i, code, number;
            double value, total, sum;
            sum = 0;
            total = 0;

            for (i = 0; i < 2; i++){
                System.out.print("Digite o código da peça: ");
                code = sc.nextInt();
                System.out.print("Digite a quantidade de peças: ");
                number = sc.nextInt();
                System.out.print("Digite o valor da peça: ");
                value = sc.nextDouble();
                sum = number * value;
                total += sum;
            }
        System.out.printf("Salário: R$ %.2f%n", total);
        sc.close();
    }
}
