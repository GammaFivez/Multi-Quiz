/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MultiQuiz;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.TimerTask;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuizStart extends javax.swing.JFrame {
    private List<QuestionList> questionLst;
    private int totalQuestion;
    private int questCounter = 0;
    public int score;
    private int rbSelected = 0;
    private int selectedButton = 0;
    private boolean answered;
    private int timerCounter = 0;
    private java.util.Timer timer = new java.util.Timer();
    private QuestionList crntQuestion;
    
    // By Numan
    // Class that starts the quiz
    public QuizStart() {
        initComponents();
        setSize(new Dimension(800, 500));
        questionLst = new ArrayList<>();
        addQuestion();
        timer();
        totalQuestion = questionLst.size();
        showNxtQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        questionNoLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionNoLabel.setText("Questions: 1/n");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        scoreLabel.setText("Score: 0");

        questionLabel.setText("Question...");

        timerLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        timerLabel.setText("00:0");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timerLabel)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scoreLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionNoLabel)
                    .addComponent(timerLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    //Code for submit button
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
                if(answered == false){
                    if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected()){
                        checkAnsw();
                    }else{
                        JOptionPane.showMessageDialog(null, "Select an option!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    showNxtQuestion();
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //System.exit(0);
        QuizStart qzrt = new QuizStart();
        qzrt.dispatchEvent(new WindowEvent(qzrt, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_exitButtonActionPerformed

    //Checks user answers against variabe retrieved from aiken format
    private void checkAnsw(){
        answered = true;
        if(jRadioButton1.isSelected()){
            rbSelected = 1;
        }
        else if(jRadioButton2.isSelected()){
            rbSelected = 2; 
        }
        else if(jRadioButton3.isSelected()){
            rbSelected = 3; 
        }
        else if(jRadioButton4.isSelected()){
            rbSelected = 4; 
        }
        
        int answNo = rbSelected;
        if(answNo == crntQuestion.getCorrectAns()){
            score++;
            scoreLabel.setText("Score: "+score);
        }
        
        jRadioButton1.setForeground(Color.RED);
        jRadioButton2.setForeground(Color.RED);
        jRadioButton3.setForeground(Color.RED);
        jRadioButton4.setForeground(Color.RED);
        switch(crntQuestion.getCorrectAns()){
            case 1:
                jRadioButton1.setForeground(Color.GREEN);
                break;
            case 2:
                jRadioButton2.setForeground(Color.GREEN);
                break;
            case 3:
                jRadioButton3.setForeground(Color.GREEN);
                break;
            case 4:
                jRadioButton4.setForeground(Color.GREEN);
                break;
        }
        if(questCounter < totalQuestion){
            submitButton.setText("Next");
        }else{
            submitButton.setText("Finish");
        }
    }
      
    //Updates question on quiz screen
    private void showNxtQuestion(){
        buttonGroup1.clearSelection();
        jRadioButton1.setForeground(Color.BLACK);
        jRadioButton2.setForeground(Color.BLACK);
        jRadioButton3.setForeground(Color.BLACK);
        jRadioButton4.setForeground(Color.BLACK);

        if(questCounter < totalQuestion){
            timer();
            crntQuestion = questionLst.get(questCounter);
            questionLabel.setText(crntQuestion.getQuestion());
            jRadioButton1.setText(crntQuestion.getOption1());
            jRadioButton2.setText(crntQuestion.getOption2());
            jRadioButton3.setText(crntQuestion.getOption3());
            jRadioButton4.setText(crntQuestion.getOption4());
            questCounter++;
            submitButton.setText("Submit");
            questionNoLabel.setText("Question: "+questCounter+"/"+totalQuestion);
            answered = false;
        } else{
            QuizStart qzstrt = new QuizStart();
            qzstrt.dispatchEvent(new WindowEvent(qzstrt, WindowEvent.WINDOW_CLOSING));
        }
    }

   // Begins timer for quiz
    private void timer(){
        timerCounter = 100;
        TimerTask task = new TimerTask(){
            public void run(){
                timerLabel.setText(Integer.toString(timerCounter));
                timerCounter--;
                if(timerCounter == -1){
                    showNxtQuestion();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 350);
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
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizStart().setVisible(true);
            }
        });
    }
        //Aiken format. Reads file, saves certain lines into assigned variables
        private void addQuestion(){
        try {
            FileReader file = new FileReader("C://Users//"+UserInput.DataStorage.usernameDisplay+"//MultiQuiz//questions.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            String userQuestion = "";
            int answer = 0;
            ArrayList<String> options = new ArrayList<String>();
            
            do {
                do {
                    line = reader.readLine();
                    if (line.contains("?")) { //stores the question
                        userQuestion = line;
                    } else if (line.contains(")")) { //Stores the options
                        options.add(line);
                    } else if (line.length() == 1) { //Stores the answer
                        answer = Integer.valueOf(line);
                    }   
                }   while (answer == 0);
                questionLst.add(new QuestionList(userQuestion, options.get(0), options.get(1), options.get(2), options.get(3), answer));
                answer = 0;
                options.clear();
            }   while ((line = reader.readLine()) != null);
            file.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionNoLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}

