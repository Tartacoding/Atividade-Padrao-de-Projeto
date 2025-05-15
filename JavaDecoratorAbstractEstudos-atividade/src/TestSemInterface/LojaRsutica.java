package TestSemInterface;

public class LojaRsutica implements LojaFactory{
    @Override
    public Mesa criarMesa() {
        return new MesaRustica();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaRustico();
    }
}
