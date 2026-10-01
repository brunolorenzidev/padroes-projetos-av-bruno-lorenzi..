public class Assinatura {

    private final String cliente;
    private final KitConformidadePais kit;

    public Assinatura(String cliente, KitConformidadePais kit) {
        this.cliente = cliente;
        this.kit = kit;
    }

    public void ativar() {
        DocumentoFiscal documento = kit.criarDocumentoFiscal();
        Cobranca cobranca = kit.criarCobranca();
        TermoPrivacidade termo = kit.criarTermoPrivacidade();

        System.out.println("Assinatura ativada - " + cliente);
        System.out.println(documento.getDescricao());
        System.out.println(cobranca.getDescricao());
        System.out.println(termo.getDescricao());
        System.out.println();
    }
}
