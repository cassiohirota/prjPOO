package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteDisp = limiteCred;
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public void addPedido(Pedido p) {
        pedidos.add(p);
        p.setCliente(this);
    }
}
