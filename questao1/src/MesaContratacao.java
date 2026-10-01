public abstract class MesaContratacao {

    // factory method
    protected abstract ModalFrete criarModal();

    public final void contratar(String cliente, double valorCarga) {
        ModalFrete modal = criarModal();
        double valorFrete = modal.calcularFrete(valorCarga);

        System.out.println("Modalidade: " + modal.getNome());
        System.out.println("Cliente: " + cliente);
        System.out.printf("Valor do frete: R$ %.2f%n", valorFrete);
        System.out.println("Documentos: " + String.join(", ", modal.getDocumentos()));
        System.out.println();
    }
}
