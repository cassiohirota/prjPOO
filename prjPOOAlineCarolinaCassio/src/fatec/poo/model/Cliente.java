package fatec.poo.model;

/**
 *
 * @author 0030482021033
 */
public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;

    public Cliente(String cpf, String nome, double limiteDisp) {
        super(cpf, nome);
        this.limiteDisp = limiteDisp;
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
