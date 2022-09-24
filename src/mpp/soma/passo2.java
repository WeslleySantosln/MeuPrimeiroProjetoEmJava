package mpp.soma;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
  * @author Weslley Santos
 */
public class passo2 extends javax.swing.JFrame {
    
    passo3 passo3;
    
    
    // As informações abaixo são da area de cadastro.
            String nOme ;
            String sObrenome ;

            int mNascimento ;
            int aNascimento ;      
            String nCpf  ;     

            String lOgin ;
            String sEnha ;
            String sExo ;
    // As infomações abaixo são da area de analise de credito.        
            String cidadeEmbarque;
            String pontoDestino;
            String ciaAerea;
            String viagem;
                       
            int nuParcelas ;
            int nuAdultos;
            int nuCriancas ;
            String rendaM ;
            
            double valorPassagem = 0;
            double valorPassagem2 = 0;
            double valorPassagem3 = 0;
            
            
            Double valorParcelas = 0.0;     
            String aProvacao;
            int rendaM2 = 0;
   
   
   //  
    public passo2() {
        initComponents();
    
        
        lblValorDasParcelas.setVisible(false);
        lblValorDasParcelas2.setVisible(false);
        String horaEdata = new SimpleDateFormat("dd/MM/yyyy  HH:mm").format(Calendar.getInstance().getTime());
        lblHora.setText(horaEdata);
         
    
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        textNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        textSobrenome = new javax.swing.JTextField();
        mesNascimento = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        anoNascimento = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        cPf = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        qtdAdulto = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        qtdCrianca = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSexo = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        lblParcelado = new javax.swing.JLabel();
        nParcelas = new javax.swing.JSpinner();
        jScrollPane6 = new javax.swing.JScrollPane();
        listRendaM = new javax.swing.JList<>();
        btnRadioAvista = new javax.swing.JRadioButton();
        btnParcelado = new javax.swing.JRadioButton();
        lblAviso = new javax.swing.JLabel();
        lblValorDasParcelas2 = new javax.swing.JLabel();
        lblValorDasParcelas = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblValorDosPrecos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 80, 183, 33));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 88, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Sobrenome Completo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 88, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CONSÓRCIO PARA VIAGENS DO GRUPO W.K");
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 13, 575, -1));

        textSobrenome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(textSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 80, 483, 33));

        mesNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mesNascimento.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        mesNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesNascimento.setName(""); // NOI18N
        getContentPane().add(mesNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 146, 70, 31));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Mês de Nascimento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 146, -1, 31));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Ano de Nascimento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 146, -1, 31));

        anoNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        anoNascimento.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2022, 1));
        anoNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anoNascimento.setName(""); // NOI18N
        getContentPane().add(anoNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 146, 70, 31));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("C.P.F:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 153, -1, -1));

        cPf.setText("Sem pontos em sem virgulas!");
        cPf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPfMouseClicked(evt);
            }
        });
        getContentPane().add(cPf, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 146, 270, 32));

        btnCalc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalc.setText("Salvar e Continuar.");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 680, 998, 37));
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 190, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Login ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 219, -1, -1));

        textLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(textLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 150, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 70, -1));
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 183, 38));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Sexo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 217, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Companhia Aérea:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 374, 150, -1));

        qtdAdulto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtdAdulto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        qtdAdulto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qtdAdulto.setName(""); // NOI18N
        qtdAdulto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtdAdultoStateChanged(evt);
            }
        });
        getContentPane().add(qtdAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 455, 70, 31));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Quantidade de crianças:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 458, -1, -1));

        qtdCrianca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtdCrianca.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        qtdCrianca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qtdCrianca.setName(""); // NOI18N
        qtdCrianca.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtdCriancaStateChanged(evt);
            }
        });
        getContentPane().add(qtdCrianca, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 455, 88, 31));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Renda mensal:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 559, 120, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 293, 1058, 5));

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel12.setText("As informações abaixo são para analise de credito.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 300, 390, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 337, 1058, 10));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Quantidade de adultos: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 458, -1, -1));

        jListSexo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Masculino", "Feminino", "Prefiro não responder" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListSexo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 196, 140, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Cidade Embarque:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 375, 150, 20));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Recife", "São Paulo", "Fortaleza" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 354, 120, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Ponto de destino:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 374, 150, -1));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Disney - Orlando", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 354, 120, 60));

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "S.S.L - AZUL" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList5.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList5ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jList5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 354, 88, 60));

        lblParcelado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblParcelado.setText("Numero de parcelas:");
        getContentPane().add(lblParcelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 454, 168, 31));

        nParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nParcelas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        nParcelas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nParcelas.setName(""); // NOI18N
        nParcelas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nParcelasStateChanged(evt);
            }
        });
        getContentPane().add(nParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 455, 85, 31));

        listRendaM.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "entre R$ 0 a R$ 3.000,00", "entre R$ 3.001,00 a R$ 5.000,00", "entre R$ 5.001,00 a R$ 10.000,00+" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(listRendaM);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 528, 234, 90));

        buttonGroup1.add(btnRadioAvista);
        btnRadioAvista.setText("À VISTA");
        btnRadioAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioAvistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadioAvista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 426, -1, -1));

        buttonGroup1.add(btnParcelado);
        btnParcelado.setText("PARCELADO");
        btnParcelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnParceladoMouseClicked(evt);
            }
        });
        getContentPane().add(btnParcelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 426, -1, -1));

        lblAviso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(lblAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 422, 366, 30));

        lblValorDasParcelas2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblValorDasParcelas2.setText("Valor das parcelas:");
        getContentPane().add(lblValorDasParcelas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, 28));

        lblValorDasParcelas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(lblValorDasParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, 270, 28));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel16.setText("Total geral:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        lblValorDosPrecos.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        getContentPane().add(lblValorDosPrecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 270, 28));

        setSize(new java.awt.Dimension(1041, 777));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void informacoesDeCadastro(){
        // As informações abaixo são da area de cadastro.
            nOme = textNome.getText();
            sObrenome = textSobrenome.getText();

            mNascimento = (int) (mesNascimento.getValue());
            aNascimento = (int) anoNascimento.getValue();       
            nCpf = cPf.getText();        

            lOgin = textLogin.getText() ; 
            sEnha = textSenha.getText() ;
            sExo = jListSexo.getSelectedValue();
    
    }
    
    
    private void calculoPassagem() {
        
        // As infomações abaixo são da area de analise de credito.           
            
            cidadeEmbarque = jList3.getSelectedValue();
            pontoDestino = jList4.getSelectedValue();
            ciaAerea = jList5.getSelectedValue();
            viagem = (cidadeEmbarque+pontoDestino+ciaAerea);
   
            nuParcelas = (int) nParcelas.getValue();
            nuAdultos = (int) qtdAdulto.getValue();
            nuCriancas = (int) qtdCrianca.getValue();
            rendaM = listRendaM.getSelectedValue();
            
            
        //Valores da passagem
        
            if(viagem.equalsIgnoreCase("recifedisney - orlandos.s.l - azul")){
                   valorPassagem = 4305;
                   lblAviso.setVisible(false);

            }else if(viagem.equalsIgnoreCase("são Paulodisney - orlandos.s.l - azul")){
                   valorPassagem = 3805;
                   lblAviso.setVisible(false);

            }else if(viagem.equalsIgnoreCase("fortalezadisney - orlandos.s.l - azul")){
                   valorPassagem = 4337;
                   lblAviso.setVisible(false);

            }else{ 
                   lblAviso.setVisible(true);
                   lblAviso.setText("<html><font color=#FF0000>*Por favor, selecione os pontos de embaquer, destino e companhia aérea<font/><html/>");
                   valorPassagem = 0;
            }

        //Acrescimos referente a quantidade de crianças e adultos.               

           
            
            valorPassagem = valorPassagem*(nuAdultos+nuCriancas);    
               

            

        //juros
            
            
                
            
        
            if(btnParcelado.isSelected()){
              
              
              valorPassagem = valorPassagem * (1+(nuParcelas * 0.1));
              valorParcelas = valorPassagem / nuParcelas;
              lblValorDasParcelas.setText(Double.toString(valorParcelas));
              lblValorDasParcelas.setVisible(true);
              lblValorDasParcelas2.setVisible(true);  
            }        

            if(btnRadioAvista.isSelected()){
                
                lblValorDasParcelas.setVisible(false);
                lblValorDasParcelas2.setVisible(false);
 
            }   

        lblValorDosPrecos.setText(Double.toString(valorPassagem));
            
          
            
    }
    
    @SuppressWarnings("null")
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        
      
        String horaEdata = new SimpleDateFormat("dd/MM/yyyy  HH:mm").format(Calendar.getInstance().getTime());
        lblHora.setText(horaEdata);
        
        informacoesDeCadastro();
        calculoPassagem();
          
        
            
        
        //aprovacão de credito e critérios para tal. 
        //a aprovação acontece se o valor das parcelas for menor doque 20% so salario.
              
            if(rendaM == null){
                JOptionPane.showMessageDialog(null, "Prencha sua renda!");               
            
            }else{                  
                if(rendaM.equalsIgnoreCase("entre R$ 0 a R$ 3.000,00")){              
                   rendaM2 = 3000;
                   
                }else if (rendaM.equalsIgnoreCase("entre R$ 3.001,00 a R$ 5.000,00")){                 
                   rendaM2 = 5000;
                   
                }else if (rendaM.equalsIgnoreCase("entre R$ 5.001,00 a R$ 10.000,00+")){
                   rendaM2 = 10000;
                }                  
            }
               
               
                if((valorParcelas< (rendaM2*0.20)) || btnRadioAvista.isSelected()){
                    
                    aProvacao = "Aprovado!";
                
                }else{    
                    aProvacao = "Analise de credito negado pelo banco central!";
                }                   
    
        //condições para determinar se existe campos vazios.
        
            if( !(btnRadioAvista.isSelected() || btnParcelado.isSelected()) || rendaM == null || nOme == null || sObrenome == null || aNascimento == 1900 || nCpf == null || lOgin == null || sEnha == null || cidadeEmbarque == null || pontoDestino == null ||ciaAerea  == null){
                JOptionPane.showMessageDialog(null, "Prencha todos os campos!");  
            }else{
                this.dispose();
                passo3 = new passo3();
                passo3.setVisible(true);
                passo3.recebendo(nOme);
                passo3.avaliacao(aProvacao);
            }   
            
        
      
    }//GEN-LAST:event_btnCalcActionPerformed

    private void cPfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPfMouseClicked

        cPf.setText("");
    
    }//GEN-LAST:event_cPfMouseClicked

    private void btnParceladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParceladoMouseClicked
    
        calculoPassagem();
             
    }//GEN-LAST:event_btnParceladoMouseClicked

    private void btnRadioAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioAvistaActionPerformed
            
        calculoPassagem();
        
        
    }//GEN-LAST:event_btnRadioAvistaActionPerformed

    private void jList5ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList5ValueChanged

          calculoPassagem();
    }//GEN-LAST:event_jList5ValueChanged

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        calculoPassagem();
    }//GEN-LAST:event_jList3MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        calculoPassagem();
    }//GEN-LAST:event_jList4MouseClicked

    private void nParcelasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nParcelasStateChanged
     calculoPassagem();
    }//GEN-LAST:event_nParcelasStateChanged

    private void qtdAdultoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtdAdultoStateChanged
        calculoPassagem();
    }//GEN-LAST:event_qtdAdultoStateChanged

    private void qtdCriancaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtdCriancaStateChanged
       calculoPassagem();
    }//GEN-LAST:event_qtdCriancaStateChanged
    
  
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new passo2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner anoNascimento;
    private javax.swing.JButton btnCalc;
    private javax.swing.JRadioButton btnParcelado;
    private javax.swing.JRadioButton btnRadioAvista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cPf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jListSexo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblParcelado;
    private javax.swing.JLabel lblValorDasParcelas;
    private javax.swing.JLabel lblValorDasParcelas2;
    private javax.swing.JLabel lblValorDosPrecos;
    private javax.swing.JList<String> listRendaM;
    private javax.swing.JSpinner mesNascimento;
    private javax.swing.JSpinner nParcelas;
    private javax.swing.JSpinner qtdAdulto;
    private javax.swing.JSpinner qtdCrianca;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textSobrenome;
    // End of variables declaration//GEN-END:variables

   
}
