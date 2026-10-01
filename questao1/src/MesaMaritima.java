public class MesaMaritima extends MesaContratacao {

    @Override
    protected ModalFrete criarModal() {
        return new ModalMaritimo();
    }
}
