public class ComputadorTeste {
    public static void main(String[] args) {

        Computador computador1 = new Computador();
        computador1.setMarca("HP");
        computador1.setModelo("Pavilon");
        computador1.setCor("Prata");
        computador1.setNumeroSerie(123);
        computador1.setPreco(5000);


        computador1.imprimir();

        System.out.println();

        computador1.calcularValor();

        computador1.imprimir();


        Computador computador2 = new Computador();
        computador1.setMarca("IBM");
        computador1.setModelo("New");
        computador1.setCor("Prata");
        computador1.setNumeroSerie(234);
        computador1.setPreco(10000);

        System.out.println();

        computador1.imprimir();

        System.out.println();

        computador1.calcularValor();

        computador1.imprimir();


        int valorDeRetorno = computador2.alterarValor(6000);

        if(valorDeRetorno==1){
            System.out.println("Valor Alterado");
        }else{
            System.out.println("Valor não Alterado");
        }

        computador2.imprimir();

    }
}