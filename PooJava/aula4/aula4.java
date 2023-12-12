package aula4;
import java.util.Scanner;
//métodos com retorno
public class aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        
        carro aula4 = new carro();
        System.out.printf("Qual a marca do carro? ");
        aula4.marca = sc.next();
        System.out.printf("Qual o modelo do carro? ");
        aula4.modelo = sc.next();
        System.out.printf("Qual o número de passageiros que ele comporta? ");
        aula4.numPassageiros = sc.nextInt();
        System.out.printf("Qual a capacidade de combustível que ele comporta? ");
        aula4.capCombustivel = sc.nextInt();
        System.out.printf("Quantos litros ele faz por KM? ");
        aula4.consCombustivel = sc.nextInt();

        System.out.printf("\n%s\n", aula4.marca);
        aula4.exibirAutonomia();
        
        System.out.println("\nAgora testaremos com um método com retorno!");
        double autonomia = aula4.obterAutonomia();  
        System.out.printf("(\nTeste usando a variável) A autonomia do carro é: %.2f\n", autonomia);
        System.out.printf("(\nTeste chamando a função) A autonomia do carro é de %.2f\n", aula4.obterAutonomia());
        sc.close();
    }
}
