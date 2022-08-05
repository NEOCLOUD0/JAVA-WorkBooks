package cop2805;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class HomeWork5 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				constructGUI();
			}
		});

	}

	private static void constructGUI() {
		try {
			UIManager.setLookAndFeel(
			 "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception e) { }
		// Setting up the basics
		//JFrame.setDefaultLookAndFeelDecorated(true);
		MyFrame frame = new MyFrame();
		frame.setVisible(true);

	}

}

class MyFrame extends JFrame {
	public JLabel someText;
	public JTextField firstNumber;
	public JTextField secondNumber;
	public JComboBox<Object> comboBox;
	public JButton registerButton;

	public MyFrame() {
		super();
		init();
	}
	
	//getting the action for when the user presses the calculate button

	class MyButtonListener implements ActionListener {
		MyFrame fr;
		public MyButtonListener(MyFrame frame)
		{
			fr = frame;
		}
		

		public void actionPerformed(ActionEvent e) 
		{
			JButton btn = (JButton) e.getSource();
			String firstNumber = fr.firstNumber.getText();
			Double.parseDouble(firstNumber);
			String secondNumber = fr.secondNumber.getText();
			Double.parseDouble(secondNumber);
			String comboBox = (String)fr.comboBox.getSelectedItem();
			// CALCULATION
			
			
			//total.setText("Result: " + result);
			

			System.out.println("Hello, the numbers you have entered are: " + firstNumber + ", " + secondNumber
					+ " you have selected " + comboBox + " and have clicked " + btn.getText());
		}
	}
	
	// creating the buttons and entry boxes
	public void init() {
		firstNumber = new JTextField();
		secondNumber = new JTextField();
		comboBox = new JComboBox<Object>();
		comboBox.addActionListener(new MyButtonListener(this));
		registerButton = new JButton("Calculate");
		registerButton.addActionListener(new MyButtonListener(this));
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Creating Calculator");
		this.setLayout(new GridLayout(5, 2));
		this.add(new JLabel("First Number:"));
		this.add(firstNumber);
		this.add(new JLabel("Second Number:"));
		this.add(secondNumber);
		this.add(new JLabel());
		
		String[] selections = {"Addition", "Subtraction", "Multiplication", "Division"};
		comboBox = new JComboBox<Object>(selections);
		this.add(comboBox);

		this.add(new JLabel());
		this.add(registerButton);
		
		this.add(new JLabel("Result: "));
		
		
		
//		// CALCULATION
//		double firstField = Double.parseDouble(firstNumber.getText());
//		double secondField = Double.parseDouble(secondNumber.getText());
//		String userChoice = (String) comboBox.getSelectedItem();
//		double result = 0;
//		
//		switch (userChoice) {
//		case "Addition":
//			result = firstField + secondField;
//			break;
//		case "Subtraction":
//			result = firstField - secondField;
//			break;
//		case "Multiplication":
//			result = firstField * secondField;
//			break;
//		case "Division":
//			result = firstField / secondField;
//			break;
//		default: 
//			firstField = 1;
//			secondField = 2;
//			result = firstField + secondField;
//			break;
//		}
//		
//		//total.setText("Result: " + result);
		
		int frameWidth = 300;
		int frameHeight = 200;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int) screenSize.getWidth() - frameWidth, 0, frameWidth, frameHeight);
	}

}

