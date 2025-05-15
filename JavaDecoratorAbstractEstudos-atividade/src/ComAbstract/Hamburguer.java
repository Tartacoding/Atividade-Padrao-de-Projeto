package ComAbstract;

public class Hamburguer implements Salgado {

    @Override
    public void preparar() {
        System.out.println("Preparando o hamburguer");
    }
}
