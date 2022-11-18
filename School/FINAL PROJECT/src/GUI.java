
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class GUI {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				constructGUI();
			}
		});

	}

	private static void constructGUI() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		// Setting up the basics
		// JFrame.setDefaultLookAndFeelDecorated(true);
		MyFrame frame = new MyFrame();
		frame.setVisible(true);

	}

}

class MyFrame extends JFrame {
	public JLabel someText;
	public JTextField firstNumber;
	public JButton calculateButton;
	//change to JButton

	public MyFrame() {
		super();
		init();
	}

	// getting the action for when the user presses the calculate button

	class MyButtonListener implements ActionListener {
		MyFrame fr;

		public MyButtonListener(MyFrame frame) {
			fr = frame;
		}

		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			String firstNumber = fr.firstNumber.getText();
			Double.parseDouble(firstNumber);
			
			// CALCULATION

			// total.setText("Result: " + result);
				System.out.println("Enter a Number: ");
				BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
				try {
					String userString = userInput.readLine();
					Socket connection = new Socket("127.0.0.1", 1236);
					InputStream input = connection.getInputStream();
					OutputStream output = connection.getOutputStream();
					
					output.write(userString.length());
					output.write(userString.getBytes());
					
					int n = input.read();
					byte[] data = new byte[n];
					input.read(data);
					
					
					String serverResponse = new String(data, StandardCharsets.UTF_8);
					System.out.println("User said: " + serverResponse);
					
					if(!connection.isClosed()) {
						connection.close();
					}
					
				} catch (IOException i) {
					i.printStackTrace();
				}
			

			System.out.println("Hello, the numbers you have entered are: " + firstNumber + " and have clicked " + btn.getText());
		}
	}

	// creating the buttons and entry boxes
	public void init() {
		firstNumber = new JTextField();
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new MyButtonListener(this));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Final Project!!!");
		this.setLayout(new GridLayout(2, 2));
		this.add(new JLabel("Enter Fibonacci Number:"));
		this.add(firstNumber);
		this.add(calculateButton);
		this.add(new JLabel("Result: "));



		int frameWidth = 450;
		int frameHeight = 100;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int) screenSize.getWidth() - frameWidth, 0, frameWidth, frameHeight);
	}

}
