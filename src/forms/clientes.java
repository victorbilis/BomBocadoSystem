/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import add.add_cliente;
import edit.editar_estoque;
import add.add_estoque;
import classes.functions;
import edit.editar_cliente;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Gabriel
 */
public class clientes extends javax.swing.JFrame {

    /**
     * Creates new form clientes
     */
    public clientes() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo para prin.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/barrinhas-divisorias-cute-kawaii-photoscape-shopping-by-thataschultz20110925-scallop_beige.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 870, 40));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 310, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clienteicon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        txt_pesquisar.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        txt_pesquisar.setForeground(new java.awt.Color(204, 204, 204));
        txt_pesquisar.setText("Pesquisar...");
        txt_pesquisar.setToolTipText("");
        txt_pesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(txt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 760, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jLabel5.setToolTipText("Excluir");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit-.png"))); // NOI18N
        jLabel7.setToolTipText("Alterar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jLabel10.setToolTipText("Adicionar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jLabel8.setToolTipText("Voltar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 110, 80));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 588, 60, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 840, 200));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 100)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bg/Fundo bisque.png"))); // NOI18N
        jLabel6.setText("Clientes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pesquisarMouseClicked
        txt_pesquisar.setText("");
        txt_pesquisar.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_pesquisarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        functions func = new functions();
        
        int res = pergunta("Deseja excluir este cliente?","Excluir");
        int linha = jTable1.getSelectedRow();
        if(res == 0)
        {
            try{
                int cod = Integer.parseInt(jTable1.getValueAt(linha,0).toString());
                func.send("DELETE FROM cliente WHERE cod_cli="+cod+";");                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
        }
        atualizar("SELECT * FROM cliente ORDER BY nome_cli ASC;");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon img = new ImageIcon("src//Imagens//delete-selecionado.png");
        jLabel5.setIcon(img);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        ImageIcon img = new ImageIcon("src//Imagens//delete.png");
        jLabel5.setIcon(img);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int linha = jTable1.getSelectedRow();
        
            int selecionado = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());
            editar_cliente frm = new editar_cliente();
            frm.id = selecionado;
            frm.setVisible(true);
            this.dispose();
       
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        ImageIcon img = new ImageIcon("src//Imagens//edit-selecionado.png");
        jLabel7.setIcon(img);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        ImageIcon img = new ImageIcon("src//Imagens//edit-.png");
        jLabel7.setIcon(img);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        add_cliente frm = new add_cliente();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        ImageIcon img = new ImageIcon("src//Imagens//add-selecionado.png");
        jLabel10.setIcon(img);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        ImageIcon img = new ImageIcon("src//Imagens//add.png");
        jLabel10.setIcon(img);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        main frm = new main();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel9.setText("Voltar");
        ImageIcon img = new ImageIcon("src//Imagens//back-selecionado.png");
        jLabel8.setIcon(img);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel9.setText("");
        ImageIcon img = new ImageIcon("src//Imagens//back.png");
        jLabel8.setIcon(img);
    }//GEN-LAST:event_jLabel8MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizar("SELECT * FROM cliente ORDER BY nome_cli ASC;");
    }//GEN-LAST:event_formWindowOpened

    
    public void atualizar(String sql)
    {
        functions func = new functions();
        
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.addColumn("Código");
        tabela.addColumn("Nome");
        tabela.addColumn("Telefone Residencia");
        tabela.addColumn("Telefone Celular");
        
        String res = func.listCliente(sql);
        System.out.println(res);
        int i = 0;
        String partes[] = res.split("&");
        
        int k = partes.length - 1;
        
        while(i < k)
        {
            
            String partes_partes[] = partes[i].split(";");
            
            String dados[] = {partes_partes[0],partes_partes[1],partes_partes[2],partes_partes[3]};
            
            tabela.addRow(dados);
            
            
            i++;
        }
        
        jTable1.setModel(tabela);
    }
    
    public int pergunta(String pergunta, String tit) {
        
        int n = JOptionPane.showConfirmDialog(
    null,
    ""+pergunta,
    ""+tit,
    JOptionPane.YES_NO_OPTION);
        return n;
    }
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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
