import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen window = new WelcomeScreen();
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
	public WelcomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 769);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(433, 73, 680, 379);
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/DEFI LOGO.png"));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnWelcome = new JButton("Welcome!");
		btnWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				InformationScreen info = new InformationScreen();
				info.main(null);
			}
		});
		btnWelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnWelcome.setBounds(594, 540, 153, 63);
		frame.getContentPane().add(btnWelcome);
	}
}
