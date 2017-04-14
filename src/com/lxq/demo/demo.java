package com.lxq.demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class demo extends JFrame{
	public static final int TEXTAREA_ROWS = 8;
    public static final int TEXTAREA_COLUMNS = 20;
    
    public demo() {
        final JTextField textField = new JTextField();
        final JPasswordField passwordField = new JPasswordField();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(new JLabel("User name: ",SwingConstants.RIGHT));
        northPanel.add(textField);
        northPanel.add(new JLabel("PassWorld: ",SwingConstants.RIGHT));
        northPanel.add(passwordField);

        add(northPanel,BorderLayout.NORTH);

        final JTextArea textArea = new JTextArea(TEXTAREA_ROWS,TEXTAREA_COLUMNS);
        JScrollPane scrollPane = new JScrollPane(textArea);

        this.add(scrollPane,BorderLayout.CENTER);

        JPanel southPanel = new JPanel();

        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton);

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textArea.append("”√ªß√˚: " + textField.getText() + "£¨√‹¬Î: "+new String(passwordField.getPassword())+"\n");
            }
        });
        add(southPanel,BorderLayout.SOUTH);
        pack();
    }
    
	public static void main(String[] agrs){
		demo frame = new demo();
        frame.setTitle("Hi Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
}
