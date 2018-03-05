import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.Font;

public class InformationScreen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public class User {
		String name;
		String surname;
		String gender;
		int age;
		String profession;
		String education;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformationScreen window = new InformationScreen();
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
	public InformationScreen() {
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
		lblNewLabel.setIcon(new ImageIcon("Resources/Images/DEFI LOGO.png"));
		lblNewLabel.setBounds(468, 73, 550, 310);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(387, 450, 165, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(387, 507, 165, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(926, 507, 161, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);


		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.print("" + timeStamp);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(924, 450, 163, 31);
		frame.getContentPane().add(comboBox_1);

		for(int i=0; i<=130; i++ ){
			comboBox_1.addItem(i);
		}

		String[] Gender = {"Female", "Male","Not Specified" };
		JComboBox comboBox = new JComboBox(Gender);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(387, 559, 165, 31);
		frame.getContentPane().add(comboBox);

		String[] EducationStatus = {"Literate" , "Illiterate"};
		JComboBox comboBox_2 = new JComboBox(EducationStatus);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_2.setBounds(928, 559, 159, 31);
		frame.getContentPane().add(comboBox_2);


		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(261, 452, 61, 20);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(261, 511, 74, 17);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Profession");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(738, 504, 102, 31);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(738, 451, 53, 23);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(261, 566, 74, 17);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Educational Status");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(740, 561, 154, 26);
		frame.getContentPane().add(lblNewLabel_6);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
							
				frame.dispose();
				TutorialScreen tutorial = new TutorialScreen();
				tutorial.main(null);
			}
		});
		btnNext.setBounds(610, 638, 142, 54);
		frame.getContentPane().add(btnNext);
	}

}
