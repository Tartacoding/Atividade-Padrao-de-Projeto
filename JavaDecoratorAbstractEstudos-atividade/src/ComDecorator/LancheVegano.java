package ComDecorator;

public class LancheVegano extends LancheDecorator {

    public LancheVegano(Lanche lanche) {
        super(lanche);
    }
    public double getValor() {
        return super.getValor() + 7.95;
    }
}
