import java.util.List;

public class ModalMaritimo implements ModalFrete {

    @Override
    public String getNome() {
        return "Marítimo";
    }

    @Override
    public double calcularFrete(double valorCarga) {
        return valorCarga * 0.01;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("BL (Bill of Lading)", "Fatura comercial");
    }
}
