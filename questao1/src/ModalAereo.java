import java.util.List;

public class ModalAereo implements ModalFrete {

    @Override
    public String getNome() {
        return "Aéreo";
    }

    @Override
    public double calcularFrete(double valorCarga) {
        return valorCarga * 0.06;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("AWB (Air Waybill)");
    }
}
