package bankapp;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CreateAc  implements ActionListener{
	JLabel print;
	JButton jb1,jb2;
	JFrame j2;
	CreateAc() {
		j2=new JFrame();
		print=new JLabel();
		print.setBounds(150, 300, 100, 50);
		JLabel jl1=new JLabel("Create Account");
		jl1.setBounds(130, 10, 120, 30);
		jl1.setFont(new Font("arial", Font.BOLD, 16));
		
		JLabel jl2=new JLabel("Account Number");
		jl2.setBounds(20, 50, 100, 30);
		JTextField jt2=new JTextField();
		jt2.setBounds(160, 50, 200, 30);
		
		JLabel jl3=new JLabel("Person name");
		jl3.setBounds(20, 90, 100, 30);
		JTextField jt3=new JTextField();
		jt3.setBounds(160, 90, 200, 30);
		
		JLabel jl4=new JLabel("Deposit Amount");
		jl4.setBounds(20, 130, 100, 30);
		JTextField jt4=new JTextField();
		jt4.setBounds(160, 130, 200, 30);
		
		JLabel jl5=new JLabel("Deposit Date");
		jl5.setBounds(20, 170, 100, 30);
		String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox<String>jc1=new JComboBox<String>(days);
		jc1.setBounds(150, 170, 60, 30);
		String month[]= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		JComboBox<String>jc2=new JComboBox<String>(month);
		jc2.setBounds(220, 170, 60, 30);
		String year[]= {"1998","1999","2000","2001","2002","2003","2004",};
		JComboBox<String>jc3=new JComboBox<String>(year);
		jc3.setBounds(290, 170, 60, 30);
		
		
		jb1=new JButton("Save");
		jb1.setBounds(100, 210, 90, 30);
		jb1.addActionListener(this);
		jb2=new JButton("Cancel");
		jb2.setBounds(220, 210, 90, 30);
		jb2.addActionListener(this);
		
		j2.add(print);
       j2.add(jb2);
		j2.add(jb1);
		j2.add(jc1);
		j2.add(jc2);
		j2.add(jc3);
		j2.add(jl5);
		j2.add(jt4);
		j2.add(jl4);
		j2.add(jt3);
		j2.add(jl3);
		j2.add(jt2);
		j2.add(jl2);
		j2.add(jl1);
		j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j2.setSize(400, 400);
		j2.setLayout(null);
		j2.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1) {
			JOptionPane.showMessageDialog(print,"Account created" );
		}else if(e.getSource()==jb2) {
			
			System.exit(0);
		}
		
	}

}
