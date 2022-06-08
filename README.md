# prjPOO


## Fazer
-
-
-
-
-

# Arrumar
(Arrumado)Pessoa:classe não é abstrata

(Arrumado?)Cliente:Não implementou a associação binária com Pedido

(Arrumado?)Vendedor:Não implementou a associação binária com Pedido

(Arrumado)Produto:não deve ser definido o apontamento para ItemPedido

ItemPedido:
(Arrumado)- Não fez a atribuição do conteúdo do parâmetro produto parao atributo produto
- A implementação da multiplicidade 1 (um) da associação binária com Pedido está incorreta
- A implementação do método setProduto fora da especificação da modelagem

Pedido:
-Não implementou aassociação binária com Vendedor
- A implementação da multiplicidade 1..*da associação binária com ItemPedido está incorreta
- A implementação da multiplicidade 1 (um) da associação binária com Cliente está incorreta

## Utilidades
https://www.javatpoint.com/how-to-remove-duplicates-from-arraylist-in-java


Como pegar o valor de outra classe e importar para a Gui Emitir Pedido para a tabela?
Qual informação deve aparecer no label ao lado do textbox do cliente/Vendedor?
Como importar linhas da tabela ao consultar pedido?


---------------------------------------------------------------------
        double decremento;
        String qtdeVendida = String.valueOf(modTblItens.getValueAt(tblPedido.getSelectedRow(), 3));

        if (tblPedido.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A linha não foi selecionada",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            modTblItens.removeRow(tblPedido.getSelectedRow());
            JOptionPane.showMessageDialog(null, qtdeVendida);

            numItem -= Integer.parseInt(qtdeVendida);
            lblQtdeItensPedido.setText(String.valueOf(numItem));
