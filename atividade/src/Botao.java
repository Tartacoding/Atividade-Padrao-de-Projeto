public class Botao { //Classe que cria o botão
    private Comando comando;

    public Botao(Comando comando){
        this.comando = comando;
    }

    public void pressionar(){
        comando.executar();
    }
}
