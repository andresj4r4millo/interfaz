/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class pedidos extends javax.swing.JFrame {
public static final String ubicacion= "jdbc:mysql://localhost/restaurant";
public static final String usuario = "root";
public static final String contraseña = "";
//Establecer comunicacion entre JAVA y MySQL
PreparedStatement ps;
//Resultado de la conexion
ResultSet rs;

public static com.mysql.jdbc.Connection getConection() {
com.mysql.jdbc.Connection con = null; // //se establece la conexion
try {
Class.forName("com.mysql.jdbc.Driver");
con = (com.mysql.jdbc.Connection) DriverManager.getConnection(

ubicacion, usuario, contraseña);

} catch (Exception e) {
System.out.println(e);
}
return con;
}
    /**
     * Creates new form pedidos
     */
    public pedidos() {
        initComponents();
    }
private void limpio(){
        idpedido.setText("");
        cliente.setText("");

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idpedido = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PEDIDO");

        jLabel2.setText("ID PEDIDO");

        jLabel3.setText("CLIENTE");

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        cerrar.setText("cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        limpiar.setText("limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        registrar.setText("registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        consultar.setText("consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        actualizar.setText("actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel4.setText("solo consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(idpedido))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizar)
                    .addComponent(consultar)
                    .addComponent(cerrar)
                    .addComponent(limpiar)
                    .addComponent(registrar)
                    .addComponent(eliminar))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(idpedido))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cerrar)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(registrar)
                        .addGap(18, 18, 18)
                        .addComponent(consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizar)
                        .addGap(16, 16, 16)
                        .addComponent(eliminar)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        com.mysql.jdbc.Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM pedido WHERE id_pedido=?");
            ps.setInt(1, Integer.parseInt(idpedido.getText()));

            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Resgistro eliminado exitosamente");
                limpio();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
            }
            con.close();

        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpio();
    }//GEN-LAST:event_limpiarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        com.mysql.jdbc.Connection con = null; // Se establece conexion
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO pedido (fk_cliente) VALUES(?)");
            ps.setString(1, cliente.getText());
            limpio();

            //Ejecucion del SQL, para crear y modigicar registros
            int res = ps.executeUpdate();//
            if(res > 0){
                JOptionPane.showMessageDialog(null, "pedido Guardado exitosamente");
               
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar el pedido");
            }
            con.close();

        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        com.mysql.jdbc.Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM pedido WHERE id_pedido = ?");
            ps.setString(1, idpedido.getText());
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setText(rs.getString("fk_cliente"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningun dato");
            }
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        com.mysql.jdbc.Connection con = null;
        try{
            con = getConection();
            // en este caso se utiliza el la sentencia sql update, para actualizar el registro
            ps = con.prepareStatement("UPDATE pedido SET  fk_cliente=?  WHERE id_pedido=?,");
            ps.setString(1, cliente.getText());
            ps.setString(2, idpedido.getText());

            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos exitosamente");
                limpio();
            } else {
                JOptionPane.showMessageDialog(null, "Error no se pudo actualizar");
            }
            con.close();

        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField cliente;
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField idpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
