/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VEW;
import MODEL.ModelUsuario;
import CONTROLLER.ControllerUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sansepiol
 */
public class ViewUsuario extends javax.swing.JFrame {
    
 // Setar os novos ModelUsuarios
    
    ModelUsuario modelUsuario = new ModelUsuario ();
    ControllerUsuario controllerUsuario = new ControllerUsuario();
   
    List <ModelUsuario> listaUsuario = new ArrayList<>();
    
   String cadAlt="cad";
   String pesqUsu="pesq";
    
    
    
    
    
    
    
    
    /**
     * Creates new form ViewUsuario
     */
    public ViewUsuario() {
        // PARA APARECER A View NO CENTRO DA TELA
          
        initComponents();
        carregarUsuarios();
      
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdUsuario = new javax.swing.JTextField();
        jtfNomeUsuario = new javax.swing.JTextField();
        jPSenhaUsuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jbCadastrarUser = new javax.swing.JButton();
        jbAlterarUser = new javax.swing.JButton();
        jb_ExcluirUser = new javax.swing.JButton();
        jbPesquisarUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 78, 78));
        jPanel1.setForeground(new java.awt.Color(136, 136, 136));

        jPanel2.setBackground(new java.awt.Color(226, 226, 226));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("CADASTRO DE USUÁRIOS");

        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/login.png"))); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/lock.png"))); // NOI18N
        jLabel3.setText("Senha:");

        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/autoria.png"))); // NOI18N
        jLabel4.setText("ID");

        jtfIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(13, 13, 13));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/pesquisar-usuario.png"))); // NOI18N
        jLabel5.setText("pesquisar: ");

        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });

        jbCadastrarUser.setText("CADASTRAR");
        jbCadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarUserActionPerformed(evt);
            }
        });

        jbAlterarUser.setText("ALTERAR");
        jbAlterarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarUserActionPerformed(evt);
            }
        });

        jb_ExcluirUser.setText("EXCLUIR");
        jb_ExcluirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ExcluirUserActionPerformed(evt);
            }
        });

        jbPesquisarUser.setText("PESQUISAR");
        jbPesquisarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNomeUsuario)
                    .addComponent(jPSenhaUsuario)
                    .addComponent(jtfPesquisar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbCadastrarUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbPesquisarUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_ExcluirUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAlterarUser)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jtfIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarUser)
                    .addComponent(jbPesquisarUser)
                    .addComponent(jb_ExcluirUser)
                    .addComponent(jbAlterarUser))
                .addGap(21, 21, 21))
        );

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "SENHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdUsuarioActionPerformed

    private void jbCadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarUserActionPerformed
        // setando o ModelUsuario
        
        modelUsuario = new ModelUsuario();
        
        modelUsuario.setNome_usuario(jtfNomeUsuario.getText());
        modelUsuario.setSenha_usuario(String.valueOf(jPSenhaUsuario.getPassword()));
        
        if (cadAlt.equals("cad")) {
            
            
        if (controllerUsuario.SalvarUsuarioController(modelUsuario)){
            
        JOptionPane.showMessageDialog(this,"ALUNO CADASTRADO COM SUCESSO!","!",JOptionPane.INFORMATION_MESSAGE);
           LimparCampos();
           carregarUsuarios();
       }
      
       else {
        JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR O usurio","!",JOptionPane.ERROR_MESSAGE);
       }
            
            
            
        } else{
            modelUsuario.setId_usuario(Integer.parseInt(jtfIdUsuario.getText()));
             if (controllerUsuario.atualizarUsuarioController(modelUsuario)){
                  
                 
               
                 
        JOptionPane.showMessageDialog(this,"USUÁRIO ALTERADO COM SUCESSO!","!",JOptionPane.INFORMATION_MESSAGE);
           
           LimparCampos();
           carregarUsuarios();
       }
      
       else {
        JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR O ALUNO","!",JOptionPane.ERROR_MESSAGE);
       }
        
        }
        
      
        
        
     
        
    }//GEN-LAST:event_jbCadastrarUserActionPerformed

    private void jb_ExcluirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ExcluirUserActionPerformed
        // Setando os objetos para excluir os usuarios objeto linha da coluna
        
        int linha = jTableUsuario.getSelectedRow(); 
        
        if (linha < 0){
        JOptionPane.showMessageDialog(this, "USUÁRIO NÃO SELECIONADO!");
        
        }
        
        else {
          int codigo = (int) jTableUsuario.getValueAt(linha, 0);
          controllerUsuario.excluirUsuarioController(codigo);
          carregarUsuarios();
          LimparCampos();
          JOptionPane.showMessageDialog(this, "USUÁRIO EXCLUIDO COM EXITO!");
        }
        
        
        
        
        
    }//GEN-LAST:event_jb_ExcluirUserActionPerformed

    private void jbPesquisarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarUserActionPerformed
      
      
     
        
        
        
        
    }//GEN-LAST:event_jbPesquisarUserActionPerformed

    private void jbAlterarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarUserActionPerformed
        //modelUsuario  = new ModelUsuario();
        cadAlt = "alt";
     
       
      int linha = jTableUsuario.getSelectedRow(); 
      
        
        if (linha < 0){
        JOptionPane.showMessageDialog(this, "USUÁRIO NÃO SELECIONADO!");
        
        }
        
        else {
           
          int codigo = (int) jTableUsuario.getValueAt(linha, 0);
          controllerUsuario.alterarUsuarioController(codigo);
          jtfIdUsuario.setText(String.valueOf(modelUsuario.getId_usuario()));
          jtfNomeUsuario.setText(modelUsuario.getNome_usuario());
          jPSenhaUsuario.setText(modelUsuario.getSenha_usuario());
          
        }
      
      
      
        
        
        
        
    }//GEN-LAST:event_jbAlterarUserActionPerformed

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        
    }//GEN-LAST:event_jtfPesquisarActionPerformed
       //METODO PRIVADO  PARA LIMPAR O FORMULARIO
       private void LimparCampos (){
        jtfIdUsuario.setText("");
        jtfNomeUsuario.setText("");
        jPSenhaUsuario.setText("");
       cadAlt = "cad";
        
        
        }
       
       private void PesquisarUsuario(){
        
      
        
     }
       
       
       
     
       
       //metodo privado para carregar a lista de usuarios
       
     private void carregarUsuarios(){
           
     listaUsuario = controllerUsuario.getListaUsuariosController();
     DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
     modelo.setNumRows(0);
     
     
         for (int i = 0; i < listaUsuario.size(); i++) {
             modelo.addRow(new Object[]{
             listaUsuario.get(i).getId_usuario(),
             listaUsuario.get(i).getNome_usuario(),
             listaUsuario.get(i).getSenha_usuario() //Modificar depois para não listar a senha!
             
             });
         }
     
     
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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPSenhaUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JButton jbAlterarUser;
    private javax.swing.JButton jbCadastrarUser;
    private javax.swing.JButton jbPesquisarUser;
    private javax.swing.JButton jb_ExcluirUser;
    private javax.swing.JTextField jtfIdUsuario;
    private javax.swing.JTextField jtfNomeUsuario;
    private javax.swing.JTextField jtfPesquisar;
    // End of variables declaration//GEN-END:variables
}
