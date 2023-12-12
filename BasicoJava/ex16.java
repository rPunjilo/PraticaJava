import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, maior = 0;

        for (i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            if (n > maior){
                maior = n;
            }
        }
        System.out.println("O maior número é " + maior);
        sc.close();
    }
}
