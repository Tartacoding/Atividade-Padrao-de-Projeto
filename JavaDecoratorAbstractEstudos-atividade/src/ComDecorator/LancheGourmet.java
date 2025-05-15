package ComDecorator;

public class LancheGourmet extends LancheDecorator {
    public LancheGourmet(Lanche lanche) {
        super(lanche);
    }
    public double getValor() {
        return super.getValor() + 9.95;
    }
}
