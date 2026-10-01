public class MesaAerea extends MesaContratacao {

    @Override
    protected ModalFrete criarModal() {
        return new ModalAereo();
    }
}
