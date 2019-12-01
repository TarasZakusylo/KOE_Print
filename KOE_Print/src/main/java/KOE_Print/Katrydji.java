package KOE_Print;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Katrydji extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel l_fon;
	
	public Katrydji(String s) {
		super(s);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/fon.jpg"));
		l_fon.setBounds(-1, 0, 995, 565);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
