package ex27;
import java.util.Scanner;
public class ex27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float alt, peso, alt_cont=0, peso_cont=0, alto=Integer.MIN_VALUE, menor=Integer.MAX_VALUE;
        float magro=Integer.MAX_VALUE, gordo=Integer.MIN_VALUE;
        int cont = 0;
        String nome, alto_nome="" , menor_nome="", magro_nome="", gordo_nome="";

        do{
            System.out.print("Digite o seu nome: ");
            nome = sc.next();
            if (nome.length() < 3){
                break;
            }
            System.out.print("Digite a sua altura: ");
            alt = sc.nextFloat();
            alt_cont += alt;
            if (alt > alto){
                alto = alt;
                alto_nome = nome;
            }
            if (alt < menor){
                menor = alt;
                menor_nome = nome;
            }
            System.out.print("Digite o seu peso: ");
            peso = sc.nextFloat();
            peso_cont += peso;
            if (peso > gordo){
                gordo = peso;
                gordo_nome = nome;
            }
            if (peso < magro){
                magro = peso;
                magro_nome = nome;
            }
            cont++;
        }while(nome.length() > 2);
        System.out.printf("%s é o mais alto, com %.2fm de altura\n", alto_nome, alto);
        System.out.printf("%s é o menor, com %.2fm de altura\n", menor_nome, menor);
        System.out.printf("%s é o mais gordo, com %.2f quilos\n",gordo_nome, gordo);
        System.out.printf("%s é o mais magro, com %.2f quilos\n", magro_nome, magro);
        System.out.printf("A média da altura é %.2f\n", (alt_cont/cont));
        System.out.printf("A média do peso é %.2f", (peso_cont/cont));
        sc.close();
    }
}
    

