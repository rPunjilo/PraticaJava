package ex1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int A, B, soma;

        System.out.print("Digite o primeiro número: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("Soma: " + soma);

        sc.close();

    }
        
}
    

