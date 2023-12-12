package ex11;
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alcool = 1.90, gasolina = 2.50, valor = 0;
        int litro;
        String opcao;
        char r;

        while (true){
            System.out.println("Seja bem-vindo!");
            System.out.print("Você ira abastescer alcool ou gasolina? ");
            opcao = sc.next();
            if (opcao.equals("alcool")){
                System.out.print("Quantos litros de alcool você irá abastecer? ");
                litro = sc.nextInt();
                if (litro <= 20){
                    valor = alcool * litro - (alcool * 0.03);
                }
                if (litro > 20){
                    valor = alcool * litro - (alcool * 0.05);
                }
                System.out.printf("O total a ser pago é de R$ %.2f%n", valor);
            }
            if (opcao.equals("gasolina")){
                System.out.print("Quantos litros de gasolina você irá abastecer? ");
                litro = sc.nextInt();
                if (litro <= 20){
                    valor = gasolina - (gasolina * 0.04);
                }
                if (litro > 20){
                    valor = gasolina - (gasolina * 0.06);
                }
                System.out.printf("O total a ser pago é de R$ %.2f%n", valor);
            }

            System.out.print("Deseja continuar? [S/N] ");
            r = sc.next().charAt(0);
            if (r == 'N' | r == 'n'){
                break;
            }
        }
        sc.close();
    }
}
