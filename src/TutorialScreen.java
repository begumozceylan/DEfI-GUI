import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TutorialScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorialScreen window = new TutorialScreen();
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
	public TutorialScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,1367, 769);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel uyariLabel = new JLabel("BEFORE STARTING THE TEST");
		uyariLabel.setBounds(320, 129, 787, 66);
		uyariLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
		frame.getContentPane().add(uyariLabel);
		
		JLabel firstLabel = new JLabel("Information about the test");
		firstLabel.setBounds(627, 230, 238, 38);
		firstLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(firstLabel);
		
		JLabel secondLabel = new JLabel("Keyboard Check");
		secondLabel.setBounds(627, 289, 238, 29);
		secondLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(secondLabel);
		
		JLabel thirdLabel = new JLabel("Sound Check");
		thirdLabel.setBounds(627, 345, 248, 24);
		thirdLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(thirdLabel);
		
		JLabel fourthLabel = new JLabel("Camera Check");
		fourthLabel.setBounds(627, 408, 238, 26);
		fourthLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(fourthLabel);
		
		JLabel fifthLabel = new JLabel("Get paper and pencil for the test.");
		fifthLabel.setBounds(659, 473, 344, 39);
		fifthLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(fifthLabel);
		
		JLabel warningLabel = new JLabel("WARNING:");
		warningLabel.setBounds(538, 479, 122, 24);
		warningLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(warningLabel);
		
		JButton startButton = new JButton("Start the Examination");
		startButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionScreen ques = new QuestionScreen();
				ques.main(null);

			}
		});
	
		startButton.setBounds(565, 577, 229, 29);
		startButton.setBackground(new Color(0, 255, 51));
		startButton.setOpaque(true);
		startButton.setBorderPainted(false);
		frame.getContentPane().add(startButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(579, 408, 26, 24);
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/staricon.png"));
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel label = new JLabel("");
		label.setBounds(579, 230, 26, 24);
		label.setIcon(new ImageIcon("Resources/Images/staricon.png"));
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(579, 289, 26, 24);
		label_1.setIcon(new ImageIcon("Resources/Images/staricon.png"));
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(579, 345, 26, 24);
		label_2.setIcon(new ImageIcon("Resources/Images/staricon.png"));
		frame.getContentPane().add(label_2);
		
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(502, 473, 26, 29);
		label_4.setIcon(new ImageIcon("Resources/Images/warningicon.png"));
		frame.getContentPane().add(label_4);
		
		
		
	}

}
