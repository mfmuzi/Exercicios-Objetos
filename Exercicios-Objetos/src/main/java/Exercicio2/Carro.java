package Exercicio2;

public class Carro {

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    private String marca;
    public String getMarca() {
        return marca;
    }
   // public void setMarca(String marca) {this.marca = marca;}

    private String modelo;
    public String getModelo() {return modelo;}
   // public void setModelo(String modelo){this.modelo = modelo;}

    private String ano;
    public String getAno() {return ano;}
   // public void setAno (String ano){this.ano = ano;}

    private String variante;
    public Carro(){}
    public String getVariante() {return variante;}
    public void setVariante (String variante){this.variante = variante;}
}
