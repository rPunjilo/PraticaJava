import java.util.Scanner;
public class ex23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, idade, soma = 0;

        System.out.print("Haverá quantas pessoas? ");
        n = sc.nextInt();
        for (i=1; i<=n; i++){
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            soma += idade;
        }
       
        System.out.printf("A média de idades da turma é %d\n", (soma/n));
        if ((soma/n) > 0 && (soma/n) <= 25){
            System.out.println("A turma é jovem");
        }
        if ((soma/n) >= 26 && (soma/n) <= 60){
        System.out.println("A turma é adulta");
        }
        if ((soma/n) >= 60){
            System.out.println("A turma é idosa");
        }
        sc.close();
    }
}
