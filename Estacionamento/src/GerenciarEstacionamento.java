public class GerenciarEstacionamento {

    //método main- inicializar o programa

    // psvm - abrir o código abaixo
    public static void main(String[] args) {

        //Cadastrar o carro do Maromo

        Carro carro = new Carro();

        carro.placa = "FFF-OOOO";
        carro.modelo = "C3";
        carro.marca = "Citroen";
        carro.valor = 30000.0;
        carro.cor = "Branco";

        carro.mostrarDados();

    }
}
