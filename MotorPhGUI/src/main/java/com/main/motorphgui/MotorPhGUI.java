/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.main.motorphgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author djjoh
 */
public class MotorPhGUI implements ActionListener{

    private static JLabel label;
    private static JTextField usertext;
    private static JLabel password;
    private static JPasswordField passwordtext;
    private static JButton login;
    private static JLabel success;
    
    public static void main(String[] args) {
        //Panel and Frame size
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        //add components to Panel
        label = new JLabel("User Name");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        
        usertext = new JTextField();
        usertext.setBounds(100, 20, 165, 25);
        panel.add(usertext);
        
        password = new JLabel("Password");
        password.setBounds(10, 50, 80, 25);
        panel.add(password);
        
        passwordtext = new JPasswordField();
        passwordtext.setBounds(100, 50, 165, 25);
        panel.add(passwordtext);
        
        login = new JButton("Log In");
        login.setBounds(120, 90, 80, 25);
        login.addActionListener(new MotorPhGUI());
        panel.add(login);
        
        success = new JLabel("");
        success.setBounds(100, 120, 300, 25);
        panel.add(success);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    // action and condition for button
        String user = usertext.getText();
        String password = passwordtext.getText();
        
        if(user.equals("1") && password.equals("1")) {
            success.setText("Successfully Log In!");
            MotorPhDashboard dashboard = new MotorPhDashboard();
            dashboard.show();
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
