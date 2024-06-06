/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
/**
 *
 * @author MAGNER
 */
public class RetiroIngles extends javax.swing.JFrame {
    public Principal principal =new Principal ();
    public String usuario = "null";
     public int numeroCuenta=000;

    /**
     * Creates new form RetiroIngles
     */
    public RetiroIngles() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public RetiroIngles(String name,int numerocuenta){
        initComponents();
        this.usuario=name;
        this.numeroCuenta=numerocuenta;
        cargar();
    
    }
     public void cargar (){
       
       FileInputStream archivo = null; // variable para leer datos de un arcchivo txt 
        ObjectInputStream convertidorarchivo = null;// variable que permitira en este caso sacar datos del archivo txt 

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt");//llama al constructor que permite leer el archivo donde le pasamos la unbicacion del archivo 
            convertidorarchivo = new ObjectInputStream(archivo);// llamamos al constructor que permitira sacar datos del archivo donde le pasamos el archivo de donde queremos sacar los datos
               
                principal= (Principal)convertidorarchivo.readObject(); //agregamos ala lista el objeto que sacamos del archivo txt 
             
        }catch (IOException ex){// excepcion que nos ayuda si no encuentra el archivo 
          
            File archivos = new File ("C://Metodos//Cajero.txt"); // SI NO ENCUENTRA EL ARCHIVO SE CREARA UN NUEVO ARCHIVO 
        }catch (ClassNotFoundException cnfe)//ndica que Java no puede encontrar una clase específica en tiempo de ejecución, lo que generalmente ocurre debido a problemas como errores en el nombre de la clase
                {
                    cnfe.printStackTrace();
                }
       
       
       
       }



 private void actualizarLista() {
        try {
           
            FileOutputStream ficherosalida =new FileOutputStream ("C://Metodos//Cajero.txt") ; 
            ObjectOutputStream  convertidor = new ObjectOutputStream (ficherosalida);
            
                convertidor.writeObject(principal);
            
            convertidor.close();
            ficherosalida.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
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
        jLabel3 = new javax.swing.JLabel();
        txtRetiro = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER THE AMOUNT TO WITHDRAW");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 330, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RETREAT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 190, 40));

        txtRetiro.setBackground(new java.awt.Color(0, 51, 51));
        txtRetiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRetiro.setForeground(new java.awt.Color(255, 255, 255));
        txtRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetiroActionPerformed(evt);
            }
        });
        txtRetiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetiroKeyTyped(evt);
            }
        });
        jPanel1.add(txtRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 250, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("READY");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, -1));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("RETURN TO");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 180, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BANK CACHUPIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetiroActionPerformed

    private void txtRetiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetiroKeyTyped
        char c = evt.getKeyChar();
        if( c < '0'|| c>'9'  ) evt.consume();
        if (txtRetiro.getText().length() >= 4) evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetiroKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!txtRetiro.getText().equals("")){
            if(Double.parseDouble(txtRetiro.getText()) <= (saldo(numeroCuenta))){
                restarSaldo(Double.parseDouble(txtRetiro.getText()));
                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String fechaYHoraActual = ahora.format(formatter);

                Historia historia = new Historia (fechaYHoraActual,"Retiro","-"+txtRetiro.getText(),null,000000,redondear(saldo(numeroCuenta))+"");
                agregarHistoria(historia);
                actualizarLista();
                FinishIngles ventana = new FinishIngles (usuario,numeroCuenta);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);

                FacturaIngles factura =new FacturaIngles(usuario,numeroCuenta,"Retiro",Double.parseDouble(txtRetiro.getText()));
                factura.setVisible(true);
                factura.setLocationRelativeTo(null);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Insufficient balance.", "Error", JOptionPane.INFORMATION_MESSAGE);

            }

        }else{
            JOptionPane.showMessageDialog(null, "Enter the amount to withdraw.", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
     public double redondear(double numero) {
        // Multiplica el número por 10^digitos para desplazar los dígitos decimales
        double factor = Math.pow(10, 3);
        double numeroMultiplicado = numero * factor;

        // Redondea al entero más cercano
        long parteEntera = Math.round(numeroMultiplicado);

        // Divide el resultado por 10^digitos para obtener el número redondeado
        return parteEntera / factor;
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuIngles ventana = new MenuIngles (usuario,numeroCuenta);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
    public void agregarHistoria(Historia historia){
        for(int i= 0 ; principal.getListaCuenta().size()>i;i++){
            if(principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuenta){//receptor
               
                        principal.getListaCuenta().get(i).getListaHistoria().add(historia);
                        
                        break;
                      
            }
        
        
        }
    
    
    }
    public void  restarSaldo (double saltoRetirado){
        for(int i =0;principal.getListaCuenta().size()>i ;i++ ){
            if (principal.getListaCuenta().get(i).getNumeroCuenta()==numeroCuenta){
                 
                principal.getListaCuenta().get(i).setSaldo(principal.getListaCuenta().get(i).getSaldo()-saltoRetirado);
                 break;
            
            }
         
        }
    
    }
    public double saldo(int numerocuenta){
        double  res = 0;
        if(principal.getListaCuenta()!=null){
        for(int i =0;principal.getListaCuenta().size()>i ;i++ ){
            if (principal.getListaCuenta().get(i).getNumeroCuenta()==numerocuenta){
                 
                res = principal.getListaCuenta().get(i).getSaldo();
                 break;
            
            }
         
        }
        }
        
     
        return res;
    
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
            java.util.logging.Logger.getLogger(RetiroIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetiroIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetiroIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetiroIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetiroIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRetiro;
    // End of variables declaration//GEN-END:variables
}
