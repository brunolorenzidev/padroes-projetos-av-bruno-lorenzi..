import java.util.List;

public class ModalRodoviario implements ModalFrete {

    @Override
    public String getNome() {
        return "Rodoviário";
    }

    @Override
    public double calcularFrete(double valorCarga) {
        return valorCarga * 0.02;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("CT-e", "MDF-e");
    }
}
