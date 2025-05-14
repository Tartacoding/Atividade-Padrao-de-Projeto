//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new BebidaQuente.Cafe();
        cafe.prepararBebida();

        System.out.println();

        BebidaQuente cha = new BebidaQuente.Cha();
        cha.prepararBebida();

        System.out.println();

        BebidaQuente chocolateQuente = new BebidaQuente.ChocolateQuente();
        chocolateQuente.prepararBebida();
    }
}
