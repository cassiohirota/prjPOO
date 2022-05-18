
import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;


/**
 *
 * @author 0030482021033
 */
public class Aplic {

    public static void main(String[] args) {
        Cliente cli = new Cliente("212343324", "Joao", 2000);
        Vendedor vend = new Vendedor("432355464", "Jose", 3000);
        Produto prod = new Produto("1", "Mouse");
        ItemPedido itemPedido = new ItemPedido(123, 10, prod);
        Pedido pedido = new Pedido("100", "12/11/2021");
        
        System.out.println("CPF: " + cli.getCpf() + "\nNome: " + cli.getNome() + "\nLimite Disp: " + cli.getLimiteDisp() + "\nLimite de Credito: " + cli.getLimiteCred());
        System.out.println("\nCPF: " + vend.getCpf() + "\nNome: " + vend.getNome() + "\nSalario Base: " + vend.getSalarioBase());
    
    }
    
}
