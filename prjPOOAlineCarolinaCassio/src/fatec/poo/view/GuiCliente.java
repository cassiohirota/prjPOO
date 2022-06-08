package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */
public class GuiCliente extends javax.swing.JFrame {

    int i, posicao;
    boolean listaVazia, elemEncontrado = false;


    public GuiCliente(ArrayList<Pessoa> p) {
        initComponents();
        pes = p;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxUf = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDdd = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLimiteCred = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblLimiteDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);

        jLabel1.setText("CPF");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Nome");

        txtNome.setEditable(false);

        jLabel3.setText("Endereço");

        txtEndereco.setEditable(false);

        txtCidade.setEditable(false);

        jLabel4.setText("Cidade");

        jLabel5.setText("UF");

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel6.setText("Telefone");

        txtDdd.setEditable(false);

        txtTelefone.setEditable(false);

        jLabel7.setText("CEP");

        txtCep.setEditable(false);

        jLabel8.setText("Limite de Crédito");

        txtLimiteCred.setEditable(false);

        jLabel9.setText("Limite Disponível");
        jLabel9.setMaximumSize(new java.awt.Dimension(97, 16));
        jLabel9.setMinimumSize(new java.awt.Dimension(97, 16));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

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

        lblLimiteDisp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLimiteDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)
                                .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome)
                            .addComponent(txtEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLimiteDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        listaVazia = pes.isEmpty();
        if (listaVazia == true) {

            JOptionPane.showMessageDialog(null, "Lista vazia!");
            txtNome.setEditable(true);
            txtEndereco.setEditable(true);
            txtCidade.setEditable(true);
            txtDdd.setEditable(true);
            txtTelefone.setEditable(true);
            cbxUf.setEditable(true);
            txtCep.setEditable(true);
            txtLimiteCred.setEditable(true);

            btnIncluir.setEnabled(true);
            btnConsultar.setEnabled(false);
        }

        for (i = 0; i < pes.size(); i++) {

            if (txtCpf.getText().equals(pes.get(i).getCpf()) && pes.get(i) instanceof Cliente) {

                txtNome.setText(String.valueOf(pes.get(i).getNome()));
                txtEndereco.setText(String.valueOf(pes.get(i).getEndereco()));
                txtCidade.setText(String.valueOf(pes.get(i).getCidade()));
                txtDdd.setText(String.valueOf(pes.get(i).getDdd()));
                txtTelefone.setText(String.valueOf(pes.get(i).getTelefone()));
                cbxUf.setSelectedItem(pes.get(i).getUf());
                txtCep.setText(pes.get(i).getCep());
                txtLimiteCred.setText(String.valueOf(((Cliente)pes.get(i)).getLimiteCred()));
                lblLimiteDisp.setText(String.valueOf(((Cliente)pes.get(i)).getLimiteDisp()));
                posicao = i;

                txtCpf.setEditable(false);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnConsultar.setEnabled(false);
                elemEncontrado = true;
                break;
            } else {

                txtNome.setEditable(true);
                txtEndereco.setEditable(true);
                txtCidade.setEditable(true);
                txtDdd.setEditable(true);
                txtTelefone.setEditable(true);
                cbxUf.setEditable(true);
                txtCep.setEditable(true);
                txtLimiteCred.setEditable(true);

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
            }

        }
        if (elemEncontrado == false && listaVazia == false) {
            JOptionPane.showMessageDialog(null, "Cliente não registrado!");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Cliente cli = new Cliente(txtCpf.getText(), txtNome.getText(), Double.parseDouble(txtLimiteCred.getText()));
        cli.setEndereco(txtEndereco.getText());
        cli.setCidade(txtCidade.getText());
        cli.setDdd(txtDdd.getText());
        cli.setTelefone(txtTelefone.getText());
        cli.setUf(String.valueOf(cbxUf.getSelectedItem()));
        cli.setCep(txtCep.getText());
        cli.setLimiteCred(Double.parseDouble(txtLimiteCred.getText()));
        pes.add(cli);
        
        txtCpf.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtDdd.setText("");
        txtTelefone.setText("");
        cbxUf.setSelectedIndex(0);
        txtCep.setText("");
        txtLimiteCred.setText("");
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        JOptionPane.showMessageDialog(null, "Cliente registrado com sucesso!");
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Cliente cli = new Cliente(txtCpf.getText(), txtNome.getText(), Double.parseDouble(txtLimiteCred.getText()));
        cli.setEndereco(txtEndereco.getText());
        cli.setCidade(txtCidade.getText());
        cli.setDdd(txtDdd.getText());
        cli.setTelefone(txtTelefone.getText());
        cli.setUf(String.valueOf(cbxUf.getSelectedItem()));
        cli.setCep(txtCep.getText());
        cli.setLimiteCred(Double.parseDouble(txtLimiteCred.getText()));
        pes.set(posicao, cli);
        
        txtCpf.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtDdd.setText("");
        txtTelefone.setText("");
        cbxUf.setSelectedIndex(0);
        txtCep.setText("");
        txtLimiteCred.setText("");
        
        txtCpf.setEditable(true);

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Dados do cliente alterado com sucesso!");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        pes.remove(posicao);
        txtCpf.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtDdd.setText("");
        txtTelefone.setText("");
        cbxUf.setSelectedIndex(0);
        txtCep.setText("");
        txtLimiteCred.setText("");
        
        txtCpf.setEditable(true);

        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLimiteDisp;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimiteCred;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> pes;
}
