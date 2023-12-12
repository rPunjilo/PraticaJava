package ex8;
import java.util.Scanner;
import java.util.ArrayList;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        char r;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        while (true){
            System.out.print("Digite um número: ");
            i = sc.nextInt();
            lista.add(i);
            System.out.print("Deseja continuar? [S/N] ");
            r = sc.next().charAt(0);
            if (r == 'N' | r == 'n'){
                break;
            }
        }
        int maior = lista.get(0);
        int menor = lista.get(0);

        for (int l= 0; l < lista.size(); l++){
            if (lista.get(l) > maior){
                maior = lista.get(l);
            }
            else if (lista.get(l) < menor){
                menor = lista.get(l);
            }
        }
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        sc.close();
    }
}
