import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ResultScreen {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultScreen window = new ResultScreen();
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
	public ResultScreen() {
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
		
String[] columnNames = {"MMSE Point", "Cognitive Impairment"};
		
		String[][] rowdata = { {"27-30", "Normal"},
			    {"21-26", "Mild Cognitive Impairment"},
			    {"11-20", "Moderate Cognitive Impairment"},
			    {"0-10", "Severe Cognitive Impairment"} };
		frame.getContentPane().setLayout(null);

		
		JTable table = new JTable(rowdata,columnNames);
	
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(485, 85, 407, 91);
		frame.getContentPane().add(scrollPane);
		
		String[] headers = {"Question Number", "Answer"};
		
		String[][] rows = { {"Question1", "ABC"},
				{"Question2", "DEF"},
				{"Question3", "ABC"},
				{"Question4", "DEF"},
				{"Question5", "ABC"},
				{"Question6", "DEF"},
				{"Question7", "ABC"},
				{"Question8", "DEF"},
				{"Question9", "ABC"},
				{"Question10", "DEF"},
				{"Question11", "ABC"},};
		
				
				table_1 = new JTable(rows,headers);
				table_1.setBounds(10, 124, 195, 173);
				frame.getContentPane().add(table_1);


				JScrollPane scrollPane_1 = new JScrollPane(table_1);
				scrollPane_1.setToolTipText("");
				scrollPane_1.setBounds(518, 274, 325, 194);
				frame.getContentPane().add(scrollPane_1);
		Button button = new Button("Export the PDF File");
		button.setBounds(533, 547, 304, 74);
		button.setBackground(Color.CYAN);
		frame.getContentPane().add(button);
	}

}
