package KOE_Print;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Menu extends JFrame{

	private static final long serialVersionUID = 1L;

	private JLabel l_fon;
	private JButton b_Katrydji;
	private JButton b_Pruntera;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		b_Katrydji = new JButton("Катриджі");
		b_Katrydji.setFont(new Font("Impact", Font.PLAIN, 25));
		b_Katrydji.setForeground(new Color(0, 0, 0));
		b_Katrydji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Katrydji("KOE_Print");
				setVisible(false);
			}
		});
		b_Katrydji.setBounds(41, 36, 282, 42);
		getContentPane().add(b_Katrydji);

		b_Pruntera = new JButton("Принтера");
		b_Pruntera.setFont(new Font("Impact", Font.PLAIN, 25));
		b_Pruntera.setForeground(new Color(0, 0, 0));
		b_Pruntera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Pruntera("KOE_Print");
				setVisible(false);
			}
		});
		b_Pruntera.setBounds(657, 36, 282, 42);
		getContentPane().add(b_Pruntera);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/fon.jpg"));
		l_fon.setBounds(-1, 0, 995, 565);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}