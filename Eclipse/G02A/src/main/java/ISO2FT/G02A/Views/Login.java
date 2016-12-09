package ISO2FT.G02A.Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import ISO2FT.G02A.Model.Manager;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(108, 260, 33, 15);
		panel.add(lblUser);
		
		textField = new JTextField();
		textField.setBounds(210, 258, 176, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(71, 302, 70, 15);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
		        {
					Manager man = Manager.get();
					System.out.println(man);
					System.out.println("ENTER key pressed");
		        }
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(210, 300, 176, 19);
		panel.add(textField_1);
		
		JButton btnConnectToDb = new JButton("Connect to DB");
		btnConnectToDb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConnectToDb.setBounds(148, 348, 148, 25);
		panel.add(btnConnectToDb);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/juan/workspace/G02A/src/logo.png"));
		label.setBounds(98, 0, 261, 243);
		panel.add(label);
	}
}
