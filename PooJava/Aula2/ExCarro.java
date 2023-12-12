package Aula2;
import java.util.Scanner;

public class ExCarro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ExCarro carro = new ExCarro();
        System.out.printf("Qual a marca do carro? ");
        carro.marca = sc.next();
        System.out.printf("Qual o modelo do carro? ");
        carro.modelo = sc.next();
        System.out.printf("Qual o número de passageiros que ele comporta? ");
        carro.numPassageiros = sc.nextInt();
        System.out.printf("Qual a capacidade de combustível que ele comporta? ");
        carro.capCombustivel = sc.nextInt();
        System.out.printf("Quantos litros ele faz por KM? ");
        carro.consCombustivel = sc.nextInt();

        System.out.printf("\n%s\n", carro.marca);

        sc.close();
    }
        
}



