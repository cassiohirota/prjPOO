package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class GuiEmitirPedido extends javax.swing.JFrame {

    int i, posicaoPesCli, posicaoPesVend, posicaoPed, posicaoProd, numItem = 0, cont = 0;
    boolean listaVazia, elemEncontradoPed, elemEncontradoCli, elemEncontradoVend, elemEncontradoProd;
    double totalPedTaxa, valorTotal = 0;

    public Double calcValorTotal(double valor) {
        double calcValor = 0;
        calcValor = valor + (valor * ((((Vendedor) pes.get(posicaoPesVend)).getTaxaComissao()) / 100));
        return calcValor;
    }

    public GuiEmitirPedido(ArrayList<Pedido> cadPed, ArrayList<Produto> cadProd, ArrayList<Pessoa> cadCliVend) {
        initComponents();
        ped = cadPed;
        pes = cadCliVend;
        prod = cadProd;
        modTblItens = (DefaultTableModel) tblPedido.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumPedido = new javax.swing.JTextField();
        btnConsultarPedido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxFormaPagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnConsultarCliente = new javax.swing.JButton();
        lblCli = new javax.swing.JLabel();
        txtCpfCli = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnConsultarVendedor = new javax.swing.JButton();
        lblVend = new javax.swing.JLabel();
        txtCpfVend = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        btnConsultarProduto = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQtdeVendida = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblQtdeItensPedido = new javax.swing.JLabel();
        lblValorTotalPedido = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel2.setText("Número do Pedido:");

        btnConsultarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Data do Pedido:");

        txtDataPedido.setEditable(false);
        try {
            txtDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPedidoActionPerformed(evt);
            }
        });
        txtDataPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataPedidoKeyPressed(evt);
            }
        });

        jLabel1.setText("Forma de Pagamento:");

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A vista", "A prazo" }));
        cbxFormaPagamento.setEnabled(false);
        cbxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFormaPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnConsultarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConsultarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cliente"));

        jLabel4.setText("CPF Cliente:");

        btnConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarCliente.setEnabled(false);
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        lblCli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblCli.setEnabled(false);

        txtCpfCli.setEditable(false);
        try {
            txtCpfCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCli.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtCpfCli)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblCli, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Vendedor"));

        jLabel5.setText("CPF Vendedor:");

        btnConsultarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarVendedor.setEnabled(false);
        btnConsultarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendedorActionPerformed(evt);
            }
        });

        lblVend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblVend.setEnabled(false);

        txtCpfVend.setEditable(false);
        try {
            txtCpfVend.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfVend.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpfVend)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblVend, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpfVend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVend, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens do Pedido"));

        jLabel6.setText("Código do Produto:");

        txtCodProd.setEditable(false);

        btnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultarProduto.setEnabled(false);
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        lblDesc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblDesc.setEnabled(false);

        jLabel7.setText("Qtde Vendida:");

        txtQtdeVendida.setEditable(false);

        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAddItem.setText("Adicionar Item");
        btnAddItem.setEnabled(false);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemoveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnRemoveItem.setText("Remover Item");
        btnRemoveItem.setEnabled(false);
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Prec. Unit.", "Qtde Vend.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPedido);

        jLabel8.setText("Valor Total do Pedido");

        jLabel9.setText("Quantidade de Itens Pedido");

        lblQtdeItensPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblQtdeItensPedido.setEnabled(false);

        lblValorTotalPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblValorTotalPedido.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddItem)
                                .addGap(19, 19, 19)
                                .addComponent(btnRemoveItem)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProd)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblQtdeItensPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtdeItensPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPedidoActionPerformed

    }//GEN-LAST:event_txtDataPedidoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        if (cbxFormaPagamento.getSelectedIndex() == 0) {
            pedido.setFormaPagto(true); // A vista
        } else {
            pedido.setFormaPagto(false);//A prazo
        }

        ped.add(pedido);

        txtNumPedido.setEditable(true);
        JOptionPane.showMessageDialog(null, "Pedido adicionado!");

        txtNumPedido.setText("");
        txtDataPedido.setText("");
        cbxFormaPagamento.setSelectedIndex(0);
        txtCpfCli.setText("");
        lblCli.setText("");
        txtCpfVend.setText("");
        lblVend.setText("");
        txtCodProd.setText("");
        lblDesc.setText("");
        txtQtdeVendida.setText("");
        lblValorTotalPedido.setText("");
        lblQtdeItensPedido.setText("");

        cbxFormaPagamento.setEnabled(false);
        txtCpfCli.setEditable(false);
        txtCodProd.setEditable(false);
        txtQtdeVendida.setEditable(false);

        btnConsultarPedido.setEnabled(true);
        btnConsultarCliente.setEnabled(false);
        btnConsultarProduto.setEnabled(false);
        btnAddItem.setEnabled(false);
        btnRemoveItem.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnIncluir.setEnabled(false);

        modTblItens.setRowCount(0);

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (cbxFormaPagamento.getSelectedIndex() == 0) {
            pedido.setFormaPagto(true); // A vista
        } else {
            pedido.setFormaPagto(false);//A prazo
        }

        ped.set(posicaoPed, pedido);

        txtNumPedido.setEditable(true);
        JOptionPane.showMessageDialog(null, "Pedido Alterado!");

        txtNumPedido.setText("");
        txtDataPedido.setText("");
        cbxFormaPagamento.setSelectedIndex(0);
        txtCpfCli.setText("");
        lblCli.setText("");
        txtCpfVend.setText("");
        lblVend.setText("");
        txtCodProd.setText("");
        lblDesc.setText("");
        txtQtdeVendida.setText("");
        lblValorTotalPedido.setText("");
        lblQtdeItensPedido.setText("");

        cbxFormaPagamento.setEnabled(false);
        txtCpfCli.setEditable(false);
        txtCodProd.setEditable(false);
        txtQtdeVendida.setEditable(false);

        btnConsultarPedido.setEnabled(true);
        btnConsultarCliente.setEnabled(false);
        btnConsultarProduto.setEnabled(false);
        btnAddItem.setEnabled(false);
        btnRemoveItem.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnIncluir.setEnabled(false);

        modTblItens.setRowCount(0);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ped.remove(posicaoPed);
        JOptionPane.showMessageDialog(null, "Pedido Excluido!");

        txtNumPedido.setText("");
        txtDataPedido.setText("");
        cbxFormaPagamento.setSelectedIndex(0);
        txtCpfCli.setText("");
        lblCli.setText("");
        txtCpfVend.setText("");
        lblVend.setText("");
        txtCodProd.setText("");
        lblDesc.setText("");
        txtQtdeVendida.setText("");
        lblValorTotalPedido.setText("");
        lblQtdeItensPedido.setText("");

        txtNumPedido.setEditable(true);
        cbxFormaPagamento.setEnabled(false);
        txtCpfCli.setEditable(false);
        txtCodProd.setEditable(false);
        txtQtdeVendida.setEditable(false);

        btnConsultarPedido.setEnabled(true);
        btnConsultarCliente.setEnabled(false);
        btnConsultarProduto.setEnabled(false);
        btnAddItem.setEnabled(false);
        btnRemoveItem.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnIncluir.setEnabled(false);

        modTblItens.setRowCount(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed

        double subTotal = Double.parseDouble(txtQtdeVendida.getText()) * prod.get(posicaoProd).getPreco();
        double limiteCli = (((Cliente) pes.get(posicaoPesCli)).getLimiteDisp());
        boolean teste = true;

        String linha[] = {
            txtCodProd.getText(),
            lblDesc.getText(),
            String.valueOf(format.format(prod.get(posicaoProd).getPreco())),
            txtQtdeVendida.getText(),
            String.valueOf(subTotal)
        };

        if (Double.parseDouble(txtQtdeVendida.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Quantidade Vendida não pode ser zero!", "Atenção", JOptionPane.ERROR_MESSAGE);
            txtCodProd.setText("");
            txtQtdeVendida.setText("");
            teste = false;
        } else if (Double.parseDouble(txtQtdeVendida.getText()) >= prod.get(posicaoProd).getQtdeEstoque()) {
            JOptionPane.showMessageDialog(null, "Estoque Insuficiente!", "Atenção", JOptionPane.ERROR_MESSAGE);
            txtCodProd.setText("");
            txtQtdeVendida.setText("");
            teste = false;
        } else {

            if (limiteCli < subTotal) {
                JOptionPane.showMessageDialog(null, "Limite de Crédito Insuficiente!", "Atenção", JOptionPane.ERROR_MESSAGE);
                txtCodProd.setText("");
                txtQtdeVendida.setText("");
                teste = false;
            } else if (teste == true) {

                itemPedido = new ItemPedido(cont, Double.parseDouble(txtQtdeVendida.getText()), prod.get(posicaoProd));
                cont++;
                pedido.addItemPedido(itemPedido);

                modTblItens.addRow(linha);
                numItem += Integer.parseInt(txtQtdeVendida.getText());
                lblQtdeItensPedido.setText(String.valueOf(numItem));

                valorTotal += subTotal;
                totalPedTaxa = calcValorTotal(valorTotal);

                lblValorTotalPedido.setText(String.valueOf(totalPedTaxa));
                txtQtdeVendida.setText("");
            }
        }

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        double valorTotalDecre;
        String qtdeVendida = String.valueOf(modTblItens.getValueAt(tblPedido.getSelectedRow(), 3));
        String subTotalDecrementado = (String) modTblItens.getValueAt(tblPedido.getSelectedRow(), 4);

        valorTotal = valorTotal - Double.parseDouble(subTotalDecrementado);

        valorTotalDecre = calcValorTotal(valorTotal);

        if (tblPedido.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A linha não foi selecionada",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            itemPed.remove(tblPedido.getSelectedRow());
            
            modTblItens.removeRow(tblPedido.getSelectedRow());

            numItem -= Integer.parseInt(qtdeVendida);
            lblQtdeItensPedido.setText(String.valueOf(numItem));

            lblValorTotalPedido.setText(String.valueOf(valorTotalDecre));
        }
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void btnConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidoActionPerformed
        listaVazia = ped.isEmpty();
        if (listaVazia == true) {

            JOptionPane.showMessageDialog(null, "Lista vazia!");
            txtNumPedido.setEditable(false);
            txtDataPedido.setEditable(true);
            cbxFormaPagamento.setEnabled(true);
        }

        for (i = 0; i < ped.size(); i++) {

            if (txtNumPedido.getText().equals(ped.get(i).getNumero())) {

                txtDataPedido.setText(String.valueOf(ped.get(i).getDataEmissao()));
                if (ped.get(i).isFormaPagto() == true) {
                    cbxFormaPagamento.setSelectedItem("A vista");
                } else {
                    cbxFormaPagamento.setSelectedItem("A prazo");
                }
                txtCpfCli.setText(String.valueOf(ped.get(i).getCliente().getCpf()));
                lblCli.setText(String.valueOf(ped.get(i).getCliente().getNome()));
                txtCpfVend.setText(String.valueOf(ped.get(i).getVendedor().getCpf()));
                lblVend.setText(String.valueOf(ped.get(i).getVendedor().getNome()));
                txtCodProd.setText(String.valueOf(prod.get(posicaoProd).getCodigo()));
                lblDesc.setText(String.valueOf(prod.get(posicaoProd).getDescricao()));
                posicaoPed = i;

                lblQtdeItensPedido.setText(String.valueOf(numItem));
                lblValorTotalPedido.setText(String.valueOf(totalPedTaxa));
                for (int i = 0; i < ped.get(posicaoPed).getItemPed().size(); i++) {
                    String linha[] = {ped.get(posicaoPed).getItemPed().get(i).getProduto().getCodigo(),
                        ped.get(posicaoPed).getItemPed().get(i).getProduto().getDescricao(),
                        ped.get(posicaoPed).getItemPed().get(i).getProduto().getPreco() + "",
                        ped.get(posicaoPed).getItemPed().get(i).getQtdeVendida() + "",
                        (ped.get(posicaoPed).getItemPed().get(i).getQtdeVendida() * ped.get(posicaoPed).getItemPed().get(i).getProduto().getPreco()) + ""};

                    modTblItens.addRow(linha);
                }
                txtCodProd.setEditable(true);
                txtNumPedido.setEditable(false);
                txtCpfCli.setEditable(false);

                btnRemoveItem.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnConsultarPedido.setEnabled(false);
                btnConsultarCliente.setEnabled(false);
                elemEncontradoPed = true;
                break;
            }
        }

        if (elemEncontradoPed == false && listaVazia == false) {
            JOptionPane.showMessageDialog(null, "Pedido não registrado!", "Atenção", JOptionPane.ERROR_MESSAGE);

            txtNumPedido.setEditable(false);
            txtDataPedido.setEditable(true);
            cbxFormaPagamento.setEnabled(true);

            btnConsultarPedido.setEnabled(false);
            btnConsultarCliente.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarPedidoActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed

        listaVazia = pes.isEmpty();
        if (listaVazia == true) {

            JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado", "Atenção", JOptionPane.ERROR_MESSAGE);
            txtCpfCli.setText("");
        }
        for (i = 0; i < pes.size(); i++) {

            if (txtCpfCli.getText().equals(pes.get(i).getCpf()) && pes.get(i) instanceof Cliente) {
                lblCli.setText(pes.get(i).getNome());
                elemEncontradoCli = true;
                posicaoPesCli = i;

                //Instanciação do objeto pedido conforme mencionado pelo professor.
                pedido = new Pedido(txtNumPedido.getText(), txtDataPedido.getText());

                //associando cliente com pedido conforme mencionado pelo professor.
                ((Cliente) pes.get(posicaoPesCli)).addPedido(pedido);

                txtCpfCli.setEditable(false);
                txtDataPedido.setEditable(false);
                txtCpfVend.setEditable(true);
                btnConsultarVendedor.setEnabled(true);

                btnConsultarCliente.setEnabled(false);
                break;
            }
        }
        if (elemEncontradoCli == false && listaVazia == false) {
            JOptionPane.showMessageDialog(null, "Cliente não existe!", "Atenção", JOptionPane.ERROR_MESSAGE);
            lblCli.setText("");
        }
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnConsultarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendedorActionPerformed

        listaVazia = pes.isEmpty();
        if (listaVazia == true) {

            JOptionPane.showMessageDialog(null, "Nenhum Vendedor cadastrado", "Atenção", JOptionPane.ERROR_MESSAGE);
            txtCpfVend.setText("");
        }
        for (i = 0; i < pes.size(); i++) {

            if (txtCpfVend.getText().equals(pes.get(i).getCpf()) && pes.get(i) instanceof Vendedor) {
                lblVend.setText(pes.get(i).getNome());
                elemEncontradoVend = true;
                posicaoPesVend = i;

                ((Vendedor) pes.get(posicaoPesVend)).addPedido(pedido);

                txtCpfVend.setEditable(false);
                txtCodProd.setEditable(true);

                btnConsultarVendedor.setEnabled(false);
                btnConsultarProduto.setEnabled(true);
                break;
            }
        }
        if (elemEncontradoVend == false && listaVazia == false) {
            JOptionPane.showMessageDialog(null, "Vendedor não existe!", "Atenção", JOptionPane.ERROR_MESSAGE);
            lblVend.setText("");
        }
    }//GEN-LAST:event_btnConsultarVendedorActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed

        listaVazia = pes.isEmpty();
        if (listaVazia == true) {

            JOptionPane.showMessageDialog(null, "Nenhum Produto cadastrado", "Atenção", JOptionPane.ERROR_MESSAGE);
            txtCodProd.setText("");
        }
        for (i = 0; i < prod.size(); i++) {

            if (txtCodProd.getText().equals(prod.get(i).getCodigo())) {
                lblDesc.setText(prod.get(i).getDescricao());
                posicaoProd = i;
                elemEncontradoProd = true;               
                
                txtQtdeVendida.setEditable(true);
                
                btnIncluir.setEnabled(true);
                btnAddItem.setEnabled(true);
                btnRemoveItem.setEnabled(true);
                break;
            }
        }
        if (elemEncontradoProd == false && listaVazia == false) {
            JOptionPane.showMessageDialog(null, "Produto não existe!", "Atenção", JOptionPane.ERROR_MESSAGE);
            txtCodProd.setText("");
        }
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void cbxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFormaPagamentoActionPerformed

    private void txtDataPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataPedidoKeyPressed

        txtDataPedido.getDocument().addDocumentListener(new DocumentListener() {

            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            public void changed() {
                
                if (txtDataPedido.getText().equals("")) {
                    txtCpfCli.setEditable(false);
                    btnConsultarCliente.setEnabled(false);
                } else {
                    txtCpfCli.setEditable(true);
                    btnConsultarCliente.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_txtDataPedidoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarPedido;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnConsultarVendedor;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCli;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblQtdeItensPedido;
    private javax.swing.JLabel lblValorTotalPedido;
    private javax.swing.JLabel lblVend;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JFormattedTextField txtCpfCli;
    private javax.swing.JFormattedTextField txtCpfVend;
    private javax.swing.JFormattedTextField txtDataPedido;
    private javax.swing.JTextField txtNumPedido;
    private javax.swing.JTextField txtQtdeVendida;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pedido> ped;
    private ArrayList<Pessoa> pes;
    private ArrayList<Produto> prod;
    private ArrayList<ItemPedido> itemPed;
    private DefaultTableModel modTblItens;
    private DecimalFormat format = new DecimalFormat("#0.00");
    private Cliente cli;
    private Pedido pedido;
    private Vendedor vend;
    private Produto produto;
    private ItemPedido itemPedido;
}
