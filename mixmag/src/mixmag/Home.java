package mixmag;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Home {

	private JFrame frame;
	private JTextArea textArea_1;
	private JTable table;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 150, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnChooseFile = new JButton("Choose File");
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				readfile of = new readfile();
			try {
				of.PickMe();			
			    } catch (Exception e) {
			    	e.printStackTrace();
			    }
			textArea_1.setText(of.sb.toString());
			}
			
		});
		btnChooseFile.setBounds(260, 389, 145, 23);
		frame.getContentPane().add(btnChooseFile);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(344, 119, -202, 30);
		frame.getContentPane().add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(483, 254, 164, 149);
		frame.getContentPane().add(textArea_1);
		
		table = new JTable();
		table.setBounds(319, 328, 209, -226);
		frame.getContentPane().add(table);
	}
}
