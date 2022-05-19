
import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;


/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class Aplic {

    public static void main(String[] args) {
        Cliente cli = new Cliente("212343324", "Joao", 2000);
        cli.setEndereco("Rua MMDC");
        cli.setCidade("Sorocaba");
        cli.setUf("SP");
        cli.setCep("1242424-433");
        cli.setDdd("015");
        cli.setTelefone("1234567899");
        
        Vendedor vend = new Vendedor("432355464", "Jose", 3000);
        vend.setTaxaComissao(10);
        
        Produto prod = new Produto("1", "Arroz");
        prod.setQtdeEstoque(100);
        prod.setUnidadeMedida("kg");
        prod.setPreco(30);
        prod.setEstoqueMinimo(30);
        
        ItemPedido itemPedido = new ItemPedido(123, 10, prod);
        itemPedido.setQtdeVendida(20);
        
        Pedido pedido = new Pedido("100", "12/05/2022");
        pedido.setDataPagto("20/06/2022");
        pedido.setFormaPagto(true);
        pedido.setSituacao(true);
        
        pedido.addPessoa(cli);
        
        itemPedido.addPedido(pedido);

        
        System.out.println("CPF: " + cli.getCpf() + "\nNome: " + cli.getNome() + "\nLimite Disp: " + cli.getLimiteDisp() + "\nLimite de Credito: " + cli.getLimiteCred());
        System.out.println("\nCPF: " + vend.getCpf() + "\nNome: " + vend.getNome() + "\nSalario Base: " + vend.getSalarioBase());
    
    }
    
}
