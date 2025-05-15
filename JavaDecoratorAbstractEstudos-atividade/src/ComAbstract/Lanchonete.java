package ComAbstract;

public class Lanchonete {
    public static void main(String[] args) {
        LanchoneteFactory factory = new LanchoneteGourmetFactory();

        Salgado salgado = factory.criarSalgado();
        Sobremesa sobremesa = factory.criarSobremesa();
        salgado.preparar();
        sobremesa.preparar();
    }
}
