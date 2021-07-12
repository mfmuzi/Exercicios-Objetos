public class Exercicio1 {

    //Crie uma classe. Nessa classe deverá ter a quantidade de pessoas que estão dentro do carro.
    //Também deve teve ter uma forma de adicionar ou remover pessoas de dentro do carro.

    public static void main (String [] args){
        int numeroPessoasEntraram = 5;
        int numeroPessoasSairam = 1;
        int numeroPessoasTotal = (numeroPessoasEntraram - numeroPessoasSairam);
        System.out.println("Quantas pessoas entraram no carro? " + numeroPessoasEntraram);
        System.out.println( "Quantas pessoas sairam do carro? " + numeroPessoasSairam);
        System.out.println("Quantas pessoas estão no carro? " +numeroPessoasTotal);
    }
}
