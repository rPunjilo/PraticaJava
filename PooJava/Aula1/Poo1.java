package Aula1;
public class Poo1 {
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.marca = "Fiat";
        uno.modelo = "Uno";
        uno.numPassageiros = 5;
        uno.capCombustivel = 100;
        uno.consCombustivel = 0.2;

        System.out.println(uno.modelo);
        System.out.println(uno.marca);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 6;
        fusca.capCombustivel = 80;
        fusca.consCombustivel = 0.6;

        System.out.printf("\n%s\n", fusca.modelo);
        System.out.printf("%s\n", fusca.marca);
    }
}
