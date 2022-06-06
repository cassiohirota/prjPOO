package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class ItemPedido {

    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private ArrayList<Pedido> ped = new ArrayList<Pedido>();

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
        ped = new ArrayList<Pedido>();
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public void addPedido(Pedido f) {
        ped.add(f);
        f.setItemPed(this);
    }

    public void listarItemPedido() {
    }
}
