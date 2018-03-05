import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CompleteScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompleteScreen window = new CompleteScreen();
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
	public CompleteScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1367, 796);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You have completed the test.");
		lblNewLabel.setFont(new Font("Serif",Font.BOLD,30));
		lblNewLabel.setBounds(526, 333, 376, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JButton viewResultsButton = new JButton("View Results");
		viewResultsButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewResultsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 frame.dispose();
				 ResultScreen result = new ResultScreen();
				 result.main(null);

			}
		});
		viewResultsButton.setBackground(Color.RED);
		viewResultsButton.setBounds(616, 506, 173, 60);
		frame.getContentPane().add(viewResultsButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Resources/Images/tickicon.png"));
		label.setBounds(556, 70, 284, 171);
		frame.getContentPane().add(label);
	}

}
