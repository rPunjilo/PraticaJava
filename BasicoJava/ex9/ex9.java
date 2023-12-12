package ex9;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int i, number;

        for(i = 0; i < 3; i++){
            System.out.print("Digite um número: ");
            number = sc.nextInt();
            lista.add(number);
        }

        lista.sort(Comparator.reverseOrder());
        System.out.println(lista);
        sc.close();
    }
}
