package TestSemInterface;

public class testando {
    public static void main(String[] args) {
        LojaFactory factory = new LojaRsutica();
        Mesa mesa = factory.criarMesa();
        Sofa sofa = factory.criarSofa();
        sofa.montar();
    }
}
