package com.mycompany.tictactoe2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {

    private String startGame = "X";
    private int i = 0;

    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }

    private void choose_a_player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void winingGame() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();

        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();

        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();

        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);

        }

        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
        }

        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
        }

        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
        }

        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
        }

        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
        }

        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
        }

        // PLAYER O CODING
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
        }

        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
        }

        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);

        }

        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);

        }

        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
        }

        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

            btn1.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
        }

        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
        }
        if (i == 9) {
            JOptionPane.showMessageDialog(this, "No one wins ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            i = 0;
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
        jLabel1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        againbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        againbtn.setBackground(new java.awt.Color(0, 0, 0));
        againbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        againbtn.setForeground(new java.awt.Color(255, 255, 255));
        againbtn.setText("PLAY AGAIN");
        againbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 0, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.setToolTipText("");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(againbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(againbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:

        try{
            if (btn3.getText().equals("X")|| btn3.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn3.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn3.setForeground(Color.black);
                i++;
            } else {
                btn3.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn3.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn3.setForeground(Color.black);
                i++;
            } else {
                btn3.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }


    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
       try{
        if (btn2.getText().equals("X")|| btn2.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn2.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn2.setForeground(Color.black);
                i++;
            } else {
                btn2.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }}
        catch(NullPointerException e){
                btn2.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn2.setForeground(Color.black);
                i++;
            } else {
                btn2.setForeground(Color.red);
                i++;
            }
           choose_a_player();
           winingGame();
        }   
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
       try{
        if (btn1.getText().equals("X")|| btn1.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn1.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn1.setForeground(Color.black);
                i++;
            } else {
                btn1.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }}
        catch(NullPointerException e){
                btn1.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn1.setForeground(Color.black);
                i++;
            } else {
                btn1.setForeground(Color.red);
                i++;
            }
           choose_a_player();
           winingGame();
        }   
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        try{
            if (btn4.getText().equals("X")|| btn4.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn4.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn4.setForeground(Color.black);
                i++;
            } else {
                btn4.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn4.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn4.setForeground(Color.black);
                i++;
            } else {
                btn4.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        try{
            if (btn5.getText().equals("X")|| btn5.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn5.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn5.setForeground(Color.black);
                i++;
            } else {
                btn5.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn5.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn5.setForeground(Color.black);
                i++;
            } else {
                btn5.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        try{
            if (btn6.getText().equals("X")|| btn6.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn6.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn6.setForeground(Color.black);
                i++;
            } else {
                btn6.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn6.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn6.setForeground(Color.black);
                i++;
            } else {
                btn6.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        try{
            if (btn7.getText().equals("X")|| btn7.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn7.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn7.setForeground(Color.black);
                i++;
            } else {
                btn7.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn7.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn7.setForeground(Color.black);
                i++;
            } else {
                btn7.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        try{
            if (btn8.getText().equals("X")|| btn8.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn8.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn8.setForeground(Color.black);
                i++;
            } else {
                btn8.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn8.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn8.setForeground(Color.black);
                i++;
            } else {
                btn8.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        
        try{
            if (btn9.getText().equals("X")|| btn9.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           btn9.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn9.setForeground(Color.black);
                i++;
            } else {
                btn9.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            btn9.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                btn9.setForeground(Color.black);
                i++;
            } else {
                btn9.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void againbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againbtnActionPerformed
        // TODO add your handling code here:
        btn1.setText(null);
        btn2.setText(null);
        btn1.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);

        btn1.setBackground(Color.lightGray);
        btn2.setBackground(Color.lightGray);
        btn3.setBackground(Color.lightGray);
        btn4.setBackground(Color.lightGray);
        btn5.setBackground(Color.lightGray);
        btn6.setBackground(Color.lightGray);
        btn7.setBackground(Color.lightGray);
        btn8.setBackground(Color.lightGray);
        btn9.setBackground(Color.lightGray);
        i = 0;

    }//GEN-LAST:event_againbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Do you want to Exit", "Tic Tac,Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton againbtn;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
