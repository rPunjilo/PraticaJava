package Aula3;
import java.util.Scanner;

public class Poo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        
        Carro aula3 = new Carro();
        System.out.printf("Qual a marca do carro? ");
        aula3.marca = sc.next();
        System.out.printf("Qual o modelo do carro? ");
        aula3.modelo = sc.next();
        System.out.printf("Qual o número de passageiros que ele comporta? ");
        aula3.numPassageiros = sc.nextInt();
        System.out.printf("Qual a capacidade de combustível que ele comporta? ");
        aula3.capCombustivel = sc.nextInt();
        System.out.printf("Quantos litros ele faz por KM? ");
        aula3.consCombustivel = sc.nextInt();

        System.out.printf("\n%s\n", aula3.marca);
        aula3.exibirAutonomia();

        sc.close();
    }
}
