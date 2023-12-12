package ex28;
import java.util.Scanner;
public class ex28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont=1;
        float valorProduto, total=0, pagamento, troco;

        do{
            System.out.printf("Qual o valor do Produto %d? ", cont);
            valorProduto = sc.nextFloat();
            cont++;
            total += valorProduto;
        }while(valorProduto == 0);
        
        do{
            System.out.printf("O valor total foi de %.2f reais\n", total);
            System.out.print("Qual o valor que o cliente pagou? ");
            pagamento = sc.nextFloat();
            if(pagamento < total){
                System.out.printf("O valor pago pelo cliente eh menor do que o total das compras!!!!");
            }
        }while(pagamento < total);    
        troco = pagamento - total;
        System.out.printf("O valor do troco foi de: %.2f reais\n", troco);

        sc.close();
    }
}
