public class KitConformidadeBrasil implements KitConformidadePais {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaServicoEletronica();
    }

    @Override
    public Cobranca criarCobranca() {
        return new CobrancaPix();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLgpd();
    }
}
