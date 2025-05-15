package Atividade;

//Configure essa classe corretamente para que o arquivo main funcione.
public class LojaModerna implements LojaFactory {
    @Override
    public Mesa criarMesa(){
        return new MesaModerna();
    }

    @Override
    public Cadeira criarCadeira() {return new CadeiraModerna();}
}
