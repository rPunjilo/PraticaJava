import java.util.Scanner;
public class ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, soma = 0, media = 0;

        for (i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            soma += n;
            media = soma / 5;
        }
        System.out.println("O média é " + media);
        sc.close();

    }
    
}
