/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.motorphgui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author djjoh
 */
public class MotorPhDashboard {
    JLabel label;
    JButton empinfo;
    JButton empleave;
    JButton empattendance;
    JButton emppayroll;
    public MotorPhDashboard() {
    //Panel and Frame size
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        //add components to Panel
        label = new JLabel("Employee Dashboard");
        label.setBounds(90, 10, 200, 25);
        panel.add(label);
        
        empinfo = new JButton("Employee Information");
        empinfo.setBounds(50, 50, 200, 25);
        empinfo.addActionListener(new MotorPhGUI());
        panel.add(empinfo);
        
        empleave = new JButton("Leave Application");
        empleave.setBounds(50, 80, 200, 25);
        empleave.addActionListener(new MotorPhGUI());
        panel.add(empleave);
        
        empattendance = new JButton("Employee Attendance");
        empattendance.setBounds(50, 110, 200, 25);
        empattendance.addActionListener(new MotorPhGUI());
        panel.add(empattendance);
        
        emppayroll = new JButton("Employee Payroll");
        emppayroll.setBounds(50, 140, 200, 25);
        emppayroll.addActionListener(new MotorPhGUI());
        panel.add(emppayroll);
        
        
        frame.setVisible(true);
    }

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
