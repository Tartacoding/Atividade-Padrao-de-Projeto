package ComAbstract;

public class LanchoneteNormalFactory implements LanchoneteFactory{
    @Override
    public Salgado criarSalgado() {
        return new Hamburguer();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new Pudim();
    }
}
