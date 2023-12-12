import java.util.Scanner;
public class ex24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        float preco;

        System.out.print("Qual preço da unidade do pão? ");
        preco = sc.nextFloat();

        System.out.println("Tabela de preços: ");
        for (i=1; i<=50; i++){
            System.out.printf("%d - R$ %.2f\n", i, (preco*i));
        }
        sc.close();
    }
}
