/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package femar.veículos;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felip
 */
public class Tela_Lista_Moto extends javax.swing.JFrame {

    ArrayList<Moto> motos = new ArrayList<>();

    /**
     * Creates new form Tela_Lista_Moto
     */
    public Tela_Lista_Moto() {
        initComponents();
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMoto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbAtualizar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEspecificações = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        tabelaMoto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabelaMoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Modelo"
            }
        ));
        jScrollPane1.setViewportView(tabelaMoto);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("                     FEMAR Veículos");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Lista de motos:");

        jbAtualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEspecificações.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbEspecificações.setText("Especificações");
        jbEspecificações.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEspecificaçõesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEspecificações))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbEspecificações))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        String caminho = "C:\\Users\\vinic\\OneDrive\\Documentos\\NetBeansProjects\\FeMar_Veiculos\\FeMar Veículos\\src\\femar\\veículos\\Dados_Moto.txt";
        Gerenciador_Arquivos gerenciador = new Gerenciador_Arquivos(caminho);
        File arquivo = new File(caminho);

        if (arquivo.length() > 0) {

            if (tabelaMoto.getSelectedRow() != -1) {
                DefaultTableModel mode = (DefaultTableModel) tabelaMoto.getModel();
 
                    motos.remove(tabelaMoto.getSelectedRow());
                    mode.removeRow(tabelaMoto.getSelectedRow());
                    tabelaMoto.setModel(mode);
                    JOptionPane.showMessageDialog(null, "Moto excluída da lista");
                

            } else {
                JOptionPane.showMessageDialog(null, "É preciso selecionar um item", "ERROR_EXCLUIR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nada para excluir", "ERROR_EXCLUIR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed

        String caminho = "C:\\Users\\vinic\\OneDrive\\Documentos\\NetBeansProjects\\FeMar_Veiculos\\FeMar Veículos\\src\\femar\\veículos\\Dados_Moto.txt";
        Gerenciador_Arquivos gerenciador = new Gerenciador_Arquivos(caminho);
        File arquivo = new File(caminho);

        if (arquivo.length() > 0) {

            try {
                motos = (ArrayList<Moto>) gerenciador.ler();
            } catch (IOException ex) {
                Logger.getLogger(Tela_Lista_Moto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela_Lista_Moto.class.getName()).log(Level.SEVERE, null, ex);
            }

            DefaultTableModel mode = (DefaultTableModel) tabelaMoto.getModel();
            mode.setNumRows(0);

            for (int i = 0; i < motos.size(); i++) {
                mode.addRow(
                        new Object[]{
                            motos.get(i).getCodigo(),
                            motos.get(i).getModelo(),}
                );
            }

            JOptionPane.showMessageDialog(null, "Lista atualizada!", "ATUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            tabelaMoto.setModel(mode);
            

        } else {
            JOptionPane.showMessageDialog(null, "Nada para carregar", "ERROR_ATUALIZAR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        String caminho = "C:\\Users\\vinic\\OneDrive\\Documentos\\NetBeansProjects\\FeMar_Veiculos\\FeMar Veículos\\src\\femar\\veículos\\Dados_Moto.txt";
        Gerenciador_Arquivos gerenciador = new Gerenciador_Arquivos(caminho);
        DefaultTableModel mode = (DefaultTableModel) tabelaMoto.getModel();
        File arquivo = new File(caminho);

        if (arquivo.length() > 0) {

            boolean bol = false;

            if (mode.getRowCount() == 0) {
                bol = true;
            } else {
            for (int i = 0; i < mode.getRowCount(); i++) {    

                String cod = mode.getValueAt(i, 0).toString();
                String modelo = mode.getValueAt(i, 1).toString();

                if (("".equals(cod)) || ("".equals(modelo))) {
                    bol = false;
                } else {
                    bol = true;
                    motos.get(i).setCodigo(cod);
                    motos.get(i).setModelo(modelo);
                }

            }
            }

            if (bol == true) {
                JOptionPane.showMessageDialog(null, "Lista salva!", "SALVAR", JOptionPane.INFORMATION_MESSAGE);

                try {
                    gerenciador.escrever(motos);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_Lista_Moto.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERROR_SALVAR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nada para salvar", "ERROR_SALVAR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEspecificaçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEspecificaçõesActionPerformed

        if (tabelaMoto.getSelectedRow() != -1) {

            DefaultTableModel mode = (DefaultTableModel) tabelaMoto.getModel();
            String cod = (String) mode.getValueAt(tabelaMoto.getSelectedRow(), 0);
            String caminho = "C:\\Users\\vinic\\OneDrive\\Documentos\\NetBeansProjects\\FeMar_Veiculos\\FeMar Veículos\\src\\femar\\veículos\\Dados_Moto.txt";
            Gerenciador_Arquivos gerenciador = new Gerenciador_Arquivos(caminho);
            File arquivo = new File(caminho);

            if (arquivo.length() > 0) {

                try {
                    motos = (ArrayList<Moto>) gerenciador.ler();
                } catch (IOException ex) {
                    Logger.getLogger(Tela_Lista_Moto.class
                            .getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Tela_Lista_Moto.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                for (int i = 0; i < motos.size(); i++) {

                    if ((cod.equals(motos.get(i).getCodigo()) && (!"".equals(motos.get(i).getModelo())))) {
                        String marca = motos.get(i).getMarca();
                        String modelo = motos.get(i).getModelo();
                        int ano = motos.get(i).getAno();
                        String cor = motos.get(i).getCor();
                        JOptionPane.showMessageDialog(null, marca + ", " + modelo + "\nCódigo: " + cod + "\nCor: " + cor + "\nAno: " + ano, "ESPECIFICAÇÕES", JOptionPane.PLAIN_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Nada para especificar", "ERROR_ESPECIFICAÇÕES", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_jbEspecificaçõesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Moto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Moto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Moto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Lista_Moto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Lista_Moto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbEspecificações;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable tabelaMoto;
    // End of variables declaration//GEN-END:variables
}
