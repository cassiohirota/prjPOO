package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class Vendedor extends Pessoa {

    private double salarioBase;
    private double taxaComissao;  // Taxa de Comissão é em porcentagem %. 
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public void addPedidos(Pedido p) {
        pedidos.add(p);
        p.setVendedor(this);
    }
}
