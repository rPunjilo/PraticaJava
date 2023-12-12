package Aula3;

public class Carro
 {
    //Atributos:
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;
    
    //Métodos ou funções:
    void exibirAutonomia(){
        System.out.printf("A autonomia do carro é: %s KM\n", (capCombustivel * consCombustivel));
    }
}
