import java.util.ArrayList;
import java.util.List;


public class Caixa implements  PedidoComposto{

    private String descricao;
    private List<PedidoComposto> conteudo = new ArrayList<>();

    public Caixa(String descricao){
        this.descricao = descricao;
    }

    public void adicionar(PedidoComposto composto){
        conteudo.add(composto);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (PedidoComposto c: conteudo){
            total += c.getPreco();
        }
        System.out.println(descricao + " - Total: R$" + total);
        return total;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "+ Caixa: " + descricao);
        for (PedidoComposto c : conteudo){
            c.exibir(prefixo);
        }

    }
}
