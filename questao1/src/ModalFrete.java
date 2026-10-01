import java.util.List;

public interface ModalFrete {

    String getNome();

    double calcularFrete(double valorCarga);

    List<String> getDocumentos();
}
