public class KitConformidadeMexico implements KitConformidadePais {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new Cfdi();
    }

    @Override
    public Cobranca criarCobranca() {
        return new CobrancaSpei();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLfpdppp();
    }
}
