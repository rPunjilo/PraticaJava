import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sex;
        double height, weight;
        weight = 0;

        System.out.print("Qual o sexo da pessoa? ");
        sex = sc.next().charAt(0);
        System.out.print("Qual a altura da pessoa? ");
        height = sc.nextDouble();

        if (sex == 'M') {
            weight = (72.7 * height) - 58;
        } 
        else if (sex == 'F') {
            weight = (62.1 * height) - 44.7;
        }
        System.out.printf("O peso ideal é %.1f quilos%n", weight);
        sc.close();
    }
}
