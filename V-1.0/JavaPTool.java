
import java.lang.reflect.*;
import java.lang.*;
public class JavaPTool extends javax.swing.JFrame {

    public JavaPTool() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        declearmethods = new javax.swing.JButton();
        interfaces = new javax.swing.JButton();
        constructor = new javax.swing.JButton();
        methods = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter the class with full path - [ java.util.Scanner ]");

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        declearmethods.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        declearmethods.setText("Declear Methods");
        declearmethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declearmethodsActionPerformed(evt);
            }
        });

        interfaces.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        interfaces.setText("Interfaces");
        interfaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interfacesActionPerformed(evt);
            }
        });

        constructor.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        constructor.setText("Constructor");
        constructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constructorActionPerformed(evt);
            }
        });

        methods.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        methods.setText("Methods");
        methods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(declearmethods)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(methods)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(constructor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interfaces))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addComponent(jTextField))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(methods)
                    .addComponent(constructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(declearmethods)
                    .addComponent(interfaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }

    private void declearmethodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declearmethodsActionPerformed
        jTextArea.setText("");
        String cName = jTextField.getText();
        try {
            Class c = Class.forName(cName);
            Method[] m = c.getDeclaredMethods();
            for(int i=0; i<m.length; i++){
                jTextArea.append(m[i]+"\n");
            }
        } catch(Exception e){
            jTextArea.setText("Class name is not found");
        }
    }

    private void interfacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interfacesActionPerformed
        jTextArea.setText("");
        String cName = jTextField.getText();
        try {
            Class c = Class.forName(cName);
            Class[] m = c.getInterfaces();
            for(int i=0; i<m.length; i++){
                jTextArea.append(m[i]+"\n");
            }
        } catch(Exception e){
            jTextArea.setText("Class name is not found");
        }
    }//GEN-LAST:event_interfacesActionPerformed

    private void constructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constructorActionPerformed
        jTextArea.setText("");
        String cName = jTextField.getText();
        try {
            Class c = Class.forName(cName);
            Constructor[] m = c.getConstructors();
            for(int i=0; i<m.length; i++){
                jTextArea.append(m[i]+"\n");
            }
        } catch(Exception e){
            jTextArea.setText("Class name is not found");
        }
    }//GEN-LAST:event_constructorActionPerformed

    private void methodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodsActionPerformed
        jTextArea.setText("");
        String cName = jTextField.getText();
        try {
            Class c = Class.forName(cName);
            Method[] m = c.getMethods();
            for(int i=0; i<m.length; i++){
                jTextArea.append(m[i]+"\n");
            }
        } catch(Exception e){
            jTextArea.setText("Class name is not found");
        }
    }//GEN-LAST:event_methodsActionPerformed

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
            java.util.logging.Logger.getLogger(JavaPTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaPTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaPTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaPTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaPTool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton constructor;
    private javax.swing.JButton declearmethods;
    private javax.swing.JButton interfaces;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField;
    private javax.swing.JButton methods;
    // End of variables declaration//GEN-END:variables
}
