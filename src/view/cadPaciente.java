/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerPaciente;
import funcoes.Validador;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class cadPaciente extends javax.swing.JFrame {

    /**
     * Creates new form cadPaciente
     */
    public cadPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbnacimento = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textEndereco = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        lbAltura = new javax.swing.JLabel();
        lbPeso = new javax.swing.JLabel();
        lbDoencas = new javax.swing.JLabel();
        lbAlergias = new javax.swing.JLabel();
        lbMedicamentos = new javax.swing.JLabel();
        textMedicamentos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDoencas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAlergias = new javax.swing.JTextArea();
        lbSexo = new javax.swing.JLabel();
        textSexo = new javax.swing.JComboBox<String>();
        textNascimento = new javax.swing.JFormattedTextField();
        textCPF = new javax.swing.JFormattedTextField();
        textTelefone = new javax.swing.JFormattedTextField();
        textPeso = new javax.swing.JFormattedTextField();
        textAltura = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        titulo.setText("Cadastro paciente:");

        lbNome.setText("Nome:");

        lbnacimento.setText("Nasimento:");

        lbCpf.setText("CPF:");

        lbEndereco.setText("Endereco:");

        lbTelefone.setText("Telefone:");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        textEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEnderecoActionPerformed(evt);
            }
        });

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btVoltar.setText("<-- back");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lbAltura.setText("Altura:");

        lbPeso.setText("Peso:");

        lbDoencas.setText("Doenças:");

        lbAlergias.setText("Alergias:");

        lbMedicamentos.setText("Medicamentos:");

        textMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedicamentosActionPerformed(evt);
            }
        });

        textDoencas.setColumns(20);
        textDoencas.setRows(5);
        jScrollPane1.setViewportView(textDoencas);

        textAlergias.setColumns(20);
        textAlergias.setRows(5);
        jScrollPane2.setViewportView(textAlergias);

        lbSexo.setText("Sexo:");

        textSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "M", "F" }));
        textSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSexoActionPerformed(evt);
            }
        });

        try {
            textNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });

        try {
            textPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesoActionPerformed(evt);
            }
        });

        try {
            textAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbMedicamentos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(titulo)
                                                .addGap(121, 121, 121))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lbNome)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textNome))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lbDoencas)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lbAlergias)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGap(3, 3, 3)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbEndereco)
                                                                        .addComponent(lbCpf)))
                                                                .addComponent(lbTelefone)
                                                                .addComponent(lbSexo))
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(textSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGap(6, 6, 6)
                                                                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lbnacimento)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(textNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lbAltura)
                                                                .addComponent(lbPeso))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGap(0, 0, Short.MAX_VALUE))))))
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btOk)
                                .addGap(71, 71, 71))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnacimento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(textSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAltura)
                    .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPeso)
                    .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDoencas)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAlergias)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMedicamentos)
                    .addComponent(textMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btOk))
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedicamentosActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        //botão cancelar
        this.textNome.setText("");
        this.textNascimento.setText("");
        this.textCPF.setText("");
        this.textEndereco.setText("");
        this.textPeso.setText("");
        this.textAltura.setText("");
        this.textDoencas.setText("");
        this.textMedicamentos.setText("");
        this.textAlergias.setText("");
        this.textTelefone.setText("");
        this.textSexo.setSelectedIndex(0);
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void textEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEnderecoActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // botão back
        this.dispose();
        new ViewPaciente().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        // botão ok
        //captura dos valpores
        Validador v         = new Validador ();      
        String nome       = textNome.getText();
        String nascimento = textNascimento.getText();
        String endereco   = textEndereco.getText();
        String telefone   = textTelefone.getText();
        String cpf        = textCPF.getText();
        String alergia    = textAlergias.getText();
        String doenca     = textDoencas.getText();
        String medicamento = textMedicamentos.getText();
        String al          = textAltura.getText();
        String pe          = textPeso.getText();
        String sexo        = (String) textSexo.getSelectedItem();
        telefone = telefone.replace("(", "");      
        telefone = telefone.replace(")", "");      
        telefone = telefone.replace("-", "");
        telefone = telefone.replace(" ", "");
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        nascimento = nascimento.replace("/", "");
        
        //teste dos valores 
        if (nome.isEmpty())
            JOptionPane.showMessageDialog(null, "Erro!! Campo nome esta vazio","Consultório",0);  
        else if(!v.validadorDataNascimento(nascimento))
            JOptionPane.showMessageDialog(null, "Erro no campo nascimento\ndigite a data no formato dd/mm/aaaa\n digite apenas numeros","Consultório",0); 
        else if(!v.validadorCPF(cpf))
            JOptionPane.showMessageDialog(null, "Erro no campo CPF\ndigite apenas os números","Consultório",0);
        else if(endereco.isEmpty())
            JOptionPane.showMessageDialog(null, "Erro!! Campo endereco esta vazio","Consultório",0);  
        else if(!v.validadorTelefone(telefone))
            JOptionPane.showMessageDialog(null, "Erro no campo telefone\ndigite apenas os números, com o DDD sem o zero","Consultório",0);
        else if(sexo == "Selecione")
            JOptionPane.showMessageDialog(null, "Erro!! Selecione um sexo","Consultório",0);
        else if(!v.validadorPeso(pe))
            JOptionPane.showMessageDialog(null, "Erro no campo peso","Consultório",0);
        else if(!v.validadorAltura(al))
            JOptionPane.showMessageDialog(null, "Erro no campo altura","Consultório",0);
        else{
            if(pe.contains(","))
                pe = pe.replace(',', '.');
            if(al.contains(","))
                al = al.replace(',', '.');
            float peso = Float.parseFloat(pe);
            float altura = Float.parseFloat(al);
            ControllerPaciente c = new ControllerPaciente();
            c.create(nome, nascimento, cpf, endereco, telefone, sexo, altura, peso, alergia, doenca, medicamento);
            int resp = JOptionPane.showConfirmDialog(null, "Deseja cadastar outro paciente?", "Consultório", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                this.textNome.setText("");
                this.textNascimento.setText("");
                this.textCPF.setText("");
                this.textEndereco.setText("");
                this.textPeso.setText("");
                this.textAltura.setText("");
                this.textDoencas.setText("");
                this.textMedicamentos.setText("");
                this.textAlergias.setText("");
                this.textTelefone.setText("");
                this.textSexo.setSelectedIndex(0);
             } else if (resp == JOptionPane.NO_OPTION) {
                this.dispose();
                new escolhaAtendente().setVisible(true);
             }
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void textSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSexoActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlturaActionPerformed

    private void textPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPesoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAlergias;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDoencas;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbMedicamentos;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbnacimento;
    private javax.swing.JTextArea textAlergias;
    private javax.swing.JFormattedTextField textAltura;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextArea textDoencas;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textMedicamentos;
    private javax.swing.JFormattedTextField textNascimento;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textPeso;
    private javax.swing.JComboBox<String> textSexo;
    private javax.swing.JFormattedTextField textTelefone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
