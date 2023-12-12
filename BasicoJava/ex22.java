import java.util.Scanner;
public class ex22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i, num, menor= Integer.MAX_VALUE, maior= Integer.MIN_VALUE, soma =0;

        System.out.print("Quantos números você deseja calcular? ");
        n = sc.nextInt();

        for(i=1; i<=n; i++){
            System.out.print("Digite o número: ");
            num = sc.nextInt();
            soma += num;
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }

        }
        System.out.println("A soma dos números é " + soma);
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        sc.close();
    }
    
}
