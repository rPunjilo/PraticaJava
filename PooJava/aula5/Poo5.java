package aula5;
import java.util.Scanner;
//métodos com retorno e parametro
//Quando um método precisa de um atributo que não está na classe, esse atributo precisa ir no parametro
public class Poo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        
        carro aula5 = new carro();
        System.out.printf("Qual a marca do carro? ");
        aula5.marca = sc.next();
        System.out.printf("Qual o modelo do carro? ");
        aula5.modelo = sc.next();
        System.out.printf("Qual o número de passageiros que ele comporta? ");
        aula5.numPassageiros = sc.nextInt();
        System.out.printf("Qual a capacidade de combustível que ele comporta? ");
        aula5.capCombustivel = sc.nextInt();
        System.out.printf("Quantos litros ele faz por KM? ");
        aula5.consCombustivel = sc.nextInt();

        System.out.printf("\n%s\n", aula5.marca);
        aula5.exibirAutonomia();
        System.out.println("\nAgora testaremos com um método com retorno!\n");
        double autonomia = aula5.obterAutonomia();  
        System.out.printf("(Teste usando a variável) A autonomia do carro é: %.2f\n", autonomia);
        System.out.printf("(Teste chamando a função) A autonomia do carro é de %.2f\n", aula5.obterAutonomia());
        //Método com parametro:
        System.out.printf("\nTestando métodos com parâmetro\n");
        double qtdComb10 = aula5.calcularComb(10);
        double qtdComb15 = aula5.calcularComb(15);

        System.out.printf("\nQtdComustível10 = %.2f\n", qtdComb10);
        System.out.printf("QtdCombustível15 = %.2f\n", qtdComb15);
        sc.close();
    }
}
