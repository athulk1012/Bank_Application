package bankapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyLogin {
	 MyLogin() {
		 JLabel head=new JLabel("Welcome");
		 head.setFont(new Font("", Font.BOLD, 18));
		 head.setBounds(150, 20, 120, 50);
		 JFrame j=new JFrame();
			JLabel j1=new JLabel("Username");
			j1.setBounds(10, 100, 80, 30);
			JTextField jt1=new JTextField();
			jt1.setBounds(120, 100, 200, 30);
			JLabel j2=new JLabel("Password");
			j2.setBounds(10, 150, 80, 30);
			JPasswordField jt2=new JPasswordField();
			jt2.setBounds(120, 150, 200, 30);
			JButton jlog=new JButton("Login");
			jlog.setBounds(150, 200, 90, 30);
			jlog.setBackground(Color.CYAN);
			j.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			j.setBackground(Color.gray);
			
			
			jlog.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==jlog) {
						
					
					j.dispose();
				SecondFrame s=new SecondFrame();
					}
				}
			});
			
			
			
			j.add(head);
			j.add(jt1);
			j.add(j1);
			j.add(jt2);
			j.add(j2);
			j.add(jlog);
			
			j.setSize(400, 400);
			j.setLayout(null);
			j.setVisible(true);
			
		}
	 public static void main(String[] args) {
		 MyLogin my=new MyLogin();
	}
	}


