import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class QuestionScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionScreen window = new QuestionScreen();
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
	public QuestionScreen() {
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
		
		
		JButton btnReadTheQuestion = new JButton("Read the Question");
		btnReadTheQuestion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReadTheQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:/Users/BegumOzceylan/eclipse-workspace/DEfI-GUI/Resorces/Audios/Question4.wav");
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
					Clip clip = AudioSystem.getClip();
			        clip.open(audioInputStream);
			        clip.start();
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnReadTheQuestion.setBounds(585, 188, 219, 54);
		frame.getContentPane().add(btnReadTheQuestion);
		JLabel lblYouSaid = new JLabel("What you say will appear here ");
		lblYouSaid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYouSaid.setBounds(574, 559, 329, 69);
		frame.getContentPane().add(lblYouSaid);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpeechRecognizer sc = new SpeechRecognizer();
				sc.main(null);

			}
		});
		btnNewButton.setIcon(new ImageIcon("Resources/Images/images.png"));
		System.out.print("Hello");
		btnNewButton.setBounds(618, 330, 169, 168);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageUploadScreen image = new ImageUploadScreen();
				image.main(null);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(637, 671, 128, 48);
		frame.getContentPane().add(btnNewButton_1);
	}
}
