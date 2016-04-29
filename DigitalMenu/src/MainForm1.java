import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class MainForm1 {
	
	private JFrame frame;
	

	
	//InputStream input = classLoader.getResourceAsStream("image.jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm1 window = new MainForm1();
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
	public MainForm1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.setBounds(100, 100, 1300, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	    frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 255));
		panel.setBounds(0, 0, 1400,850);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
	
		JLabel jLabel = new JLabel();
	        jLabel.setBounds(0,0,1400,850);
		jLabel.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Welcome6.jpg"));
		panel.add(jLabel);
		
		JLabel label = new JLabel();
		label.setFont(new Font("Times New Roman",Font.BOLD,20));
		label.setBounds(900,50,300,30);
		label.setBackground(new Color(0, 153, 255));
		jLabel.add(label);
		label.setText("If You Are Abministrator!!");
		
		JButton Update_Btn = new JButton("Update");
		Update_Btn.setFont(new Font("Times New Roman", Font.BOLD |Font.ITALIC , 20));
		Update_Btn.setBounds(950, 80, 200, 28);
		jLabel.add(Update_Btn);
		
		
		
		
	    Update_Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				JPasswordField pf = new JPasswordField();
				int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

				if (okCxl == JOptionPane.OK_OPTION) {
				  String password = new String(pf.getPassword());
				  
				  
				
				if(password.equals("1234")){
				frame.dispose();
				UpdateForm Updt=new UpdateForm();
				Updt.update();
				}
				else {
					JLabel jl1 = new JLabel("                             Sorry Try Agai");
					Toolkit.getDefaultToolkit().beep();
					jl1.setForeground(Color.red);
					JOptionPane.showConfirmDialog(null, jl1, "Sorry You are Wrong try agai", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				//System.err.println("You entered: " + password);
				}
				}
			}
		});
		
		
		JButton Sell_Btn = new JButton("Open");
		Sell_Btn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		Sell_Btn.setBounds(58, 240, 180, 55);
		//Sell_Btn.setIcon(new ImageIcon("H:\\PICTURE\\OpenButton.PNG"));
		jLabel.add(Sell_Btn);
		//frame.getContentPane().add(Sell_Btn);
		
	
		
	Sell_Btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			frame.dispose();
			
			SellForm Sell = new SellForm();
			Sell.sell();
			
			
		}
	});
		
	}

}