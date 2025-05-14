abstract class BebidaQuente {
    public final void prepararBebida(){
        ferverAgua();
        preparar();
        servirNaXicara();
    }

    public void ferverAgua(){
        System.out.println("Fervendo a água");
    }

    public void servirNaXicara(){
        System.out.println("Servindo na xícara");
    }

    public abstract void preparar();

    static class Cafe extends BebidaQuente{
        public void preparar(){
            System.out.println("Adicionando o pó de café e coando");
        }
    }

    static class Cha extends BebidaQuente{
        public void preparar(){
            System.out.println("Colocando o saquinho de chá");
        }

    }

    static class ChocolateQuente extends BebidaQuente{
        public void preparar(){
            System.out.println("Fervendo o leite e colocando o achocolatado");
        }

    }
}
