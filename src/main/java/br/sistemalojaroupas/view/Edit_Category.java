/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view;

import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.dao.CategoryDao;
import br.sistemalojaroupas.model.entities.Category;
import br.sistemalojaroupas.view.util.NodesController;
import javax.swing.JOptionPane;

/**
 *
 * @author lukas
 */
public class Edit_Category extends javax.swing.JDialog {
    
    private java.awt.Dialog parent;
    private Category category;
    /**
     * Creates new form New_Category
     */
    public Edit_Category(java.awt.Dialog parent, boolean modal, Category category) {
        super(parent, modal);
        this.parent = parent;
        this.category = category;
        initComponents();
        this.setBackground(new java.awt.Color(0,0,0,0));
        jPanel1.setBackground(new java.awt.Color(0,0,0,0));
        
        txtCategory.setText(category.getCategory());
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
        jLabel2 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btn_close = new javax.swing.JLabel();
        btn_save = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Editar categoria:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 110, 30));

        txtCategory.setBackground(new java.awt.Color(108, 81, 233));
        txtCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCategory.setForeground(new java.awt.Color(0, 0, 51));
        txtCategory.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCategory.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txtCategory.setOpaque(false);
        jPanel1.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 35, 100, 30));

        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_X_Preto.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 7, 20, 20));

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png"))); // NOI18N
        btn_save.setToolTipText("");
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_saveMouseExited(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoTelaRoxa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        if (parent instanceof Register_And_Edit_Products) {
                NodesController.updateComboBox(CategoryDao.findAll(),
                        ((Register_And_Edit_Products)parent).getCbCategory());
            }
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseEntered
        // Trocar pelo ícone mais escuro
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar.png")));
    }//GEN-LAST:event_btn_saveMouseEntered

    private void btn_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseExited
        // Voltar ao ícone original
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png")));
    }//GEN-LAST:event_btn_saveMouseExited

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        
        if (!txtCategory.getText().equals("")){
            try {
                category.setCategory(txtCategory.getText().toUpperCase());
                CategoryDao.update(category);
                
                JOptionPane.showMessageDialog(null, "Categoria editada com sucesso!",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                if (parent instanceof Register_And_Edit_Products) {
                    NodesController.updateComboBox(CategoryDao.findAll(),
                            ((Register_And_Edit_Products)parent).getCbCategory());
                }
                this.dispose();
                
            } catch (DBException e) {
                JOptionPane.showMessageDialog(null, "Essa categoria já está cadastrada.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Você deve preencher o campo para salvar.", "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCategory;
    // End of variables declaration//GEN-END:variables
}
