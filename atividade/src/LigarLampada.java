public class LigarLampada implements Comando {
    private Lampada lampada;

    public LigarLampada(Lampada lampada){
        this.lampada = lampada;
    }

    public void executar(){
        lampada.ligar();
    }
}
