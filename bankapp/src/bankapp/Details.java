package bankapp;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Details {
 Details() {
	JFrame j3=new JFrame();
	String a[]= {"Account Number","Customer Name","Opening Date","Bank Balance"};
	String b[][]= {{"1111","Arun","March/3/2003","1000"},
			{"2222","Amal","March/4/2005","20000"},
			{"3333","leo","February/3/2002","3000"},
			{"4444","antony","April/3/2002","25000"},
			{"5555","aron","January/1/2008","13000"},
			{"5555","eby","April/3/2007","33000"},
	
	};
	
	JTable jt=new JTable(b, a);
	jt.setBounds(20, 30, 350, 350);
	JScrollPane jp=new JScrollPane(jt);
	
	j3.add(jp);
	
	j3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j3.setSize(400, 400);
	
	j3.setVisible(true);
}
}
