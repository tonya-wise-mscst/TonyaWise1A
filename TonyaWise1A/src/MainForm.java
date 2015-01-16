import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainForm extends JFrame {

	private JPanel contentPane;
	private JLabel GrossPaylbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gross Pay:");
		lblNewLabel.setBounds(29, 31, 63, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNewButton_actionPerformed(arg0);
			}
		});
		btnNewButton.setBounds(39, 56, 101, 23);
		contentPane.add(btnNewButton);
		
		GrossPaylbl = new JLabel("");
		GrossPaylbl.setBounds(114, 31, 181, 14);
		contentPane.add(GrossPaylbl);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		int hours = 40;
		double GrossPay, PayRate = 25.0;
		GrossPay = hours * PayRate;
		GrossPaylbl.setText("Your gross pay is $" + GrossPay);
	}
}
