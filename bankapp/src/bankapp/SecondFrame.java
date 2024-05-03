package bankapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class SecondFrame implements ActionListener {
	JMenuItem jm1,jm2,jm3,jm4;
	 JTextArea ja;
	 JFrame j1;
 SecondFrame() {
	 j1=new JFrame();
	 JMenuBar jm=new JMenuBar();
	ja=new JTextArea();
	 ja.setBounds(0, 10, 390, 390);
	 JMenu menu=new JMenu("File");
	  jm1=new JMenuItem("Create a account");
	 jm2=new JMenuItem("Print customer balance");
	 jm3=new JMenuItem("Exit");
	 jm1.addActionListener(this);
	 jm2.addActionListener(this);
	 jm3.addActionListener(this);
	
	 
	 
	 JMenu menu1=new JMenu("Edit");
	 JMenu menu2=new JMenu("View");
	 jm4=new JMenuItem("View customer details");
	 jm4.addActionListener(this);
	 menu2.add(jm4);
	 
	 JMenu menu3=new JMenu("Option");
	 JMenu menu4=new JMenu("Window");
	 JMenu menu5=new JMenu("Help");
	 
	 
	 
	  
	 
	 j1.setJMenuBar(jm);
	 jm.add(menu);
	 jm.add(menu1);
	 jm.add(menu2);
	 jm.add(menu3);
	 jm.add(menu4);
	 jm.add(menu5);
	 
	 menu.add(jm1);
	 menu.add(jm2);
	 menu.add(jm3);
	 j1.add(ja);
	 j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 j1.setSize(400, 400);
	 j1.setLayout(null);
	 j1.setVisible(true);
	 
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==jm1) {
		j1.dispose();
		CreateAc ac=new CreateAc();
		
	}else if(e.getSource()==jm2) {
		try {
			ja.print();
		} catch (PrinterException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(e.getSource()==jm3) {
		System.exit(0);
	}else if(e.getSource()==jm4) {
		j1.dispose();
		Details d=new Details();
	}
	
}
}
