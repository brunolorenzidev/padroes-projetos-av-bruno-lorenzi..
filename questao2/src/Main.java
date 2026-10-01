public class Main {

    public static void main(String[] args) {
        Assinatura assinaturaBrasil = new Assinatura("Clínica Sorriso Pleno", new KitConformidadeBrasil());
        assinaturaBrasil.ativar();

        Assinatura assinaturaMexico = new Assinatura("Consultorio Dental Tapatío", new KitConformidadeMexico());
        assinaturaMexico.ativar();
    }
}
