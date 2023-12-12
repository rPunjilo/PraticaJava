package ex15;
import java.util.Scanner;
public class ex15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total1, total2, cidade_1, cidade_2, anos = 0;
        char resposta;
        
        do{
            System.out.print("Digite o total de habitantes da cidade 1: ");
            total1 = sc.nextInt();
            System.out.print("Digite o total de habitantes da cidade 2: ");
            total2 = sc.nextInt();
            if (total1 >= total2){
                System.out.println("O total da cidade 2 deve ser maior do que a cidade 1");
                break;
            }
            do{
                cidade_1 = total1 += (total1 * 0.03);
                cidade_2 = total2 += (total2 * 0.015);
                anos++;
                System.out.println("Cidade 1: " + cidade_1);
                System.out.println("Cidade 2: " + cidade_2);
            }while (cidade_1 < cidade_2);
            
            System.out.printf("Em %d anos, a cidade 1 terá mais habitantes do que a cidade 2%n", anos);
            System.out.print("Deseja continuar? ");
            resposta = sc.next().toUpperCase().charAt(0);
        }while (resposta == 'S');
        sc.close();
    }
}