package ex10;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char turno;

        System.out.println("Em qual turno você deseja trabalhar? ");
        turno = sc.next().charAt(0);
        if (turno == 'M'){
            System.out.print("Matutino");
        }
        else if (turno == 'V'){
            System.out.println("vespertino");
        }
        else if (turno == 'N'){
            System.out.print("Noturno");
        }
        else {
            System.out.println("Valor Inválido");
        }
        sc.close();
    }
}
