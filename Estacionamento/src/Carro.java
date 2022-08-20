public class Carro {

    //String == Classe
    //double, float, int, long, short == Primitivo

    //atributos
    String placa;
    String marca;
    String modelo;
    String cor;
    double valor;

    //Métodos
    void acelerar(){
        //lógica aqui - para acelerar

    }

    void estacionar(){

    }

    void mostrarDados(){
        System.out.println("Dados do Carro");
        System.out.println("Placa : " + placa);
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Cor : " + cor);
        System.out.println("Valor R$ : " + valor);
        System.out.println("-----------------------");
    }

}
