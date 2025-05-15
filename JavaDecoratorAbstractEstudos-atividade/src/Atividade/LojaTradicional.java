package Atividade;

//Configure essa classe corretamente para que o arquivo main funcione.
public class LojaTradicional implements LojaFactory{
    @Override
    public Mesa criarMesa(){ return  new MesaTradicional(); }

    @Override
    public Cadeira criarCadeira(){ return new CadeiraTradicional(); }

}
