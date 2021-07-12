package Exercicio2;

public class Exercicio2 {

    //Crie a classe Carro com os atributos: Marca (String), Modelo (String), Ano (integer) e Variante (String).
    //Essa classe deve garantir que Modelo, Marca e Ano sempre sejam passados na hora de instanciar um objeto.

    public static void main(String[] args){

        Carro marca = new Carro("Ford","Fiesta","2020");

        Carro variante = new Carro();
        variante.setVariante(" ");

        System.out.println("Marca do carro é: " + marca.getMarca());
        System.out.println("O modelo do carro é: " + marca.getModelo());
        System.out.println("O ano do carro é: " + marca.getAno());
        System.out.println("A variante do carro é: " + variante.getVariante());
    }

}
