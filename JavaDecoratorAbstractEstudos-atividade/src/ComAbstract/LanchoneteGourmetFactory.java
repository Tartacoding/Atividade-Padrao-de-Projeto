package ComAbstract;

public class LanchoneteGourmetFactory implements LanchoneteFactory{
    @Override
    public Salgado criarSalgado() {
        return new HamburguerGourmet();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new PudimGourmet();
    }
}
