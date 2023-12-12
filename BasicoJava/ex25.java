import java.util.Scanner;
public class ex25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float preco, dinheiro, total = 0;
        int i=1;

        do{
            System.out.printf("Produto %d: R$ ", i);
            preco = sc.nextFloat();
            total += preco;
            i++;
        }while(preco != 0);
        System.out.printf("\nTotal: R$ %.2f\n", total);
        System.out.printf("Dinheiro: R$ ");
        dinheiro = sc.nextFloat();
        if (dinheiro < total){
            do{
                System.out.println("Valor da compra é maior do que o recebido, digite novamente");
                System.out.printf("Dinheiro: R$ ");
                dinheiro = sc.nextFloat();
            }while(dinheiro < total);
        }
        System.out.printf("Troco: %.2f\n", (dinheiro - total));
        sc.close();
    }
}
