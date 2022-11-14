
import java.awt.Color;
import static java.awt.Color.gray;
import static java.awt.Color.magenta;
import static java.awt.Color.orange;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tharu
 */
public class TIC extends javax.swing.JFrame {
    private String turn="O";
    private int xcount=0;
    private int ocount=0;
    private int totalcount=0;
    
    /**
     * Creates new form TIC
     */
    public TIC() {
        initComponents();
    }
    private void ChoosePlayer(){
        if(turn.equalsIgnoreCase("X")){
            turn="O";
        }
        else{
            turn="X";
        }
    }
    
    private void SetScore(){
        xscore.setText(String.valueOf(xcount));
        oscore.setText(String.valueOf(ocount));
    }
    
    private void ResetGame(){
        BUT1.setText("");
        BUT2.setText("");
        BUT3.setText("");
        BUT4.setText("");
        BUT5.setText("");
        BUT6.setText("");
        BUT7.setText("");
        BUT8.setText("");
        BUT9.setText("");
        
        BUT1.setBackground(gray);
        BUT2.setBackground(gray);
        BUT3.setBackground(gray);
        BUT4.setBackground(gray);
        BUT5.setBackground(gray);
        BUT6.setBackground(gray);
        BUT7.setBackground(gray);
        BUT8.setBackground(gray);
        BUT9.setBackground(gray);
        totalcount=0;
    }
    private void winingGame(){
        totalcount++;
        String btn1=BUT1.getText();
        String btn2=BUT2.getText();
        String btn3=BUT3.getText();
        String btn4=BUT4.getText();
        String btn5=BUT5.getText();
        String btn6=BUT6.getText();
        String btn7=BUT7.getText();
        String btn8=BUT8.getText();
        String btn9=BUT9.getText();
        if((btn1==btn2)&&(btn2==btn3)&& btn1 != ""){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT1.setBackground(orange);
            BUT2.setBackground(orange);
            BUT3.setBackground(orange);}
        
        else if((btn4==btn5)&&(btn5 == btn6)&&(btn4!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT4.setBackground(orange);
            BUT5.setBackground(orange);
            BUT6.setBackground(orange);
            
            
        }
        else if((btn7==btn8)&&(btn8==btn9)&&(btn7!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT7.setBackground(orange);
            BUT8.setBackground(orange);
            BUT9.setBackground(orange);
            
            
        }
        else if((btn1==btn4)&&(btn4==btn7)&&(btn1!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT1.setBackground(orange);
            BUT4.setBackground(orange);
            BUT7.setBackground(orange);
            
            
        }
        else if((btn2==btn5)&&(btn5==btn8)&&(btn2!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT2.setBackground(orange);
            BUT5.setBackground(orange);
            BUT8.setBackground(orange);
            
            
        }
          else if((btn3==btn6)&&(btn6==btn9)&&(btn3!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT3.setBackground(orange);
            BUT6.setBackground(orange);
            BUT9.setBackground(orange);
            
            
        }
          else if((btn1==btn5)&&(btn5==btn9)&&(btn1!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT1.setBackground(orange);
            BUT5.setBackground(orange);
            BUT9.setBackground(orange);
            
            
        }
          else if((btn3==btn5)&&(btn5==btn3)&&(btn3!="")){
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg="Player O Wins";
                ocount++;
            }
            else{
                msg="Player X Wins";
                xcount++;
            }
            JOptionPane.showMessageDialog(this,msg,"tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            BUT3.setBackground(orange);
            BUT5.setBackground(orange);
            BUT7.setBackground(orange);
            
            
        }
          else if(totalcount==9){
              JOptionPane.showMessageDialog(this,"Draw!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          ResetGame();
          }
         SetScore();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BUT1 = new javax.swing.JButton();
        BUT2 = new javax.swing.JButton();
        BUT3 = new javax.swing.JButton();
        BUT7 = new javax.swing.JButton();
        BUT5 = new javax.swing.JButton();
        BUT6 = new javax.swing.JButton();
        BUT9 = new javax.swing.JButton();
        BUT8 = new javax.swing.JButton();
        BUT4 = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        BUT1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT1ActionPerformed(evt);
            }
        });

        BUT2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT2ActionPerformed(evt);
            }
        });

        BUT3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT3ActionPerformed(evt);
            }
        });

        BUT7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT7ActionPerformed(evt);
            }
        });

        BUT5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT5.setToolTipText("");
        BUT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT5ActionPerformed(evt);
            }
        });

        BUT6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT6ActionPerformed(evt);
            }
        });

        BUT9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT9ActionPerformed(evt);
            }
        });

        BUT8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT8ActionPerformed(evt);
            }
        });

        BUT4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BUT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT4ActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(255, 204, 204));
        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(0, 255, 255));
        RESET.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCORECARD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PLAYER O :");

        xscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xscore.setText("0");

        oscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oscore.setText("0");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("PLAYER X :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(xscore, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oscore, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(xscore, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oscore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BUT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BUT8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUT9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BUT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BUT5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BUT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BUT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BUT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BUT5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BUT9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUT8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BUT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT9ActionPerformed
      if(BUT9.getText()!=""){
        return;
    }  
        BUT9.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT9.setForeground(Color.red);  
    }
    else{
         BUT9.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    
    }//GEN-LAST:event_BUT9ActionPerformed

    private void BUT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT7ActionPerformed
     if(BUT7.getText()!=""){
        return;
    }  
        BUT7.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT7.setForeground(Color.red);  
    }
    else{
         BUT7.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    
    }//GEN-LAST:event_BUT7ActionPerformed

    private void BUT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT8ActionPerformed
      if(BUT8.getText()!=""){
        return;
    }  
        
        BUT8.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT8.setForeground(Color.red);  
    }
    else{
         BUT8.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    
    }//GEN-LAST:event_BUT8ActionPerformed

    private void BUT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT4ActionPerformed
         if(BUT4.getText()!=""){
        return;
    }  
        BUT4.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT4.setForeground(Color.red);  
    }
    else{
         BUT4.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    
    }//GEN-LAST:event_BUT4ActionPerformed

    private void BUT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT1ActionPerformed
    if(BUT1.getText()!=""){
        return;
    }
        
    BUT1.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT1.setForeground(Color.red);  
    }
    else{
         BUT1.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    }//GEN-LAST:event_BUT1ActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        JFrame frame =new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if u want to exit","tic tac toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        ResetGame();
    }//GEN-LAST:event_RESETActionPerformed

    private void BUT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT2ActionPerformed
     if(BUT2.getText()!=""){
        return;
    }  
        BUT2.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT2.setForeground(Color.red);  
    }
    else{
         BUT2.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
            
    }//GEN-LAST:event_BUT2ActionPerformed

    private void BUT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT3ActionPerformed
 if(BUT3.getText()!=""){
        return;
    }  
        BUT3.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT3.setForeground(Color.red);  
    }
    else{
         BUT3.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    
    }//GEN-LAST:event_BUT3ActionPerformed

    private void BUT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT5ActionPerformed
 if(BUT5.getText()!=""){
        return;
    }  
        BUT5.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT5.setForeground(Color.red);  
    }
    else{
         BUT5.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
    
    }//GEN-LAST:event_BUT5ActionPerformed

    private void BUT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT6ActionPerformed
        if(BUT6.getText()!=""){
        return;
    }    
        BUT6.setText(turn);
    if(turn.equalsIgnoreCase("X")){
     
    BUT6.setForeground(Color.red);  
    }
    else{
         BUT6.setForeground(magenta);
        
    }
    winingGame();
    ChoosePlayer();
   
    }//GEN-LAST:event_BUT6ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUT1;
    private javax.swing.JButton BUT2;
    private javax.swing.JButton BUT3;
    private javax.swing.JButton BUT4;
    private javax.swing.JButton BUT5;
    private javax.swing.JButton BUT6;
    private javax.swing.JButton BUT7;
    private javax.swing.JButton BUT8;
    private javax.swing.JButton BUT9;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton RESET;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oscore;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
