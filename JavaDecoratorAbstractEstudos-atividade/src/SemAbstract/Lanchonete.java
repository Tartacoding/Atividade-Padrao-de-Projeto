package SemAbstract;

public class Lanchonete {
    public static void main(String[] args) {
        Hamburguer hamburguer = new Hamburguer();
        Pudim pudim = new Pudim();
        hamburguer.preparar();
        pudim.preparar();


        HamburguerGourmet hamburguerGourmet = new HamburguerGourmet();
        PudimGourmet pudimGourmet = new PudimGourmet();
        pudimGourmet.preparar();
        hamburguerGourmet.preparar();

    }
}
