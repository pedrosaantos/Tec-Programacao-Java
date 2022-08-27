public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Caio");
        apolice.setIdade(33);
        apolice.setValorPremio(1500.00f);

        apolice.imprimir();
    }
}