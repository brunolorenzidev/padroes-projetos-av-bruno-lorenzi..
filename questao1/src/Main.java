public class Main {

    public static void main(String[] args) {
        MesaContratacao rodoviaria = new MesaRodoviaria();
        rodoviaria.contratar("Madeireira Pinheiral", 48500.00);

        MesaContratacao aerea = new MesaAerea();
        aerea.contratar("Biovet Vacinas", 126300.00);

        MesaContratacao maritima = new MesaMaritima();
        maritima.contratar("Erva-Mate Campos Gerais", 312750.00);
    }
}
