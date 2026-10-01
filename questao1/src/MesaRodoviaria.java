public class MesaRodoviaria extends MesaContratacao {

    @Override
    protected ModalFrete criarModal() {
        return new ModalRodoviario();
    }
}
