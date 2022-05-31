package fatec.poo.model;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;

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

}
