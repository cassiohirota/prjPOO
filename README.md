# prjPOO


## Fazer
-
-
-
-
-

# Arrumar


## Utilidades
https://www.javatpoint.com/how-to-remove-duplicates-from-arraylist-in-java
https://github.com/Vitormdias/prjPOO/blob/master/prjPOODeboraVitorLuiz/src/fatec/poo/view/GuiAlocarFiscal.java (Verificar a maneira que foi utilizada para pesquisar as linhas da tabela em btnPesquisarActionPerformed)
https://github.com/WLLR9505/prjPOO/blob/master/prjPOOPedroVitorWeuller/src/fatec/poo/view/frmEmitirPedido.java(Verificar a maneira que foi utilzada para pesquisar as linhas da tabela em btnConPedActionPerformed)

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
