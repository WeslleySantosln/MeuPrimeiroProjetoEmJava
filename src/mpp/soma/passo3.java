package mpp.soma;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author Weslley Santos
 */
public class passo3 extends javax.swing.JFrame {
    
    passo2 passo2;
    
    
    
   
    public passo3() {
        initComponents();
        btnContinuar.setVisible(false);
   
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 2, 90, 140));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 610, 39));

        lblResultado.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 50, 610, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     
        passo2 = new passo2;
        
        
        
    }//GEN-LAST:event_btnContinuarActionPerformed
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new passo3().setVisible(true);
        });
           
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables

    


public void recebendo (String recebe){    
        
        LocalDateTime agora = LocalDateTime.now();       
        String horaEdata = new SimpleDateFormat("dd/MM/yyyy  HH:mm").format(Calendar.getInstance().getTime());        
        String saudacao;
        
        
        
        if (agora.getHour() > 5 && agora.getHour()<= 12 ){
            saudacao = "Bom dia!";

        }else if(agora.getHour() > 12 && agora.getHour() <= 18){
            saudacao = "Boa tarde!";

        }else{    
            saudacao = "Boa noite!";
        }

        jLabel1.setText("Olá "+recebe+", "+saudacao);


        


        
}

public void avaliacao(String resultado){

    
    if(resultado.equalsIgnoreCase("aprovado!")){
        
    btnContinuar.setVisible(true);
    lblResultado.setText("você foi "+resultado+"!");
    }else {
    
    lblResultado.setText(resultado);    
    
    }


    
}

}
