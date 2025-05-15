package ComDecorator;

abstract class LancheDecorator implements Lanche {
    protected Lanche lanche;


    public LancheDecorator(Lanche lanche) {
        this.lanche = lanche;
    }
    public double getValor() {
        return lanche.getValor();
    }
}
