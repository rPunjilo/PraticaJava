import java.util.Scanner;
public class ex26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int comeco, fim, numero, i;

        System.out.print("Montar a tabuada de: ");
        numero = sc.nextInt();
        System.out.print("Começar por: ");
        comeco = sc.nextInt();
        System.out.print("Terminar em: ");
        fim = sc.nextInt();
        if (fim <= comeco){
            do{
                System.out.println("O valor final deve ser maior que o inicial!!");
                System.out.print("Terminar em: ");
                fim = sc.nextInt();
            }while(fim <= comeco);
        }

        System.out.printf("Vou montar a tabuada de %d, começando em %d e terminando em %d\n", numero, comeco, fim);
        for(i=comeco; i<=fim; i++){
            System.out.printf("%d x %d = %d\n", numero, i, (numero*i));
        }
        sc.close();
    }
}