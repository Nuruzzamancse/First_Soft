import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.omg.CORBA.Context;
import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class SellForm{
	private JFrame frame;
	

	private JTextField PTB_1;
	private JTextField PTB_2;
	private JTextField PTB_3;
	private JTextField PTB_4;
	private JTextField PTB_5;
	private JTextField PTB_6;
	private JTextField PTB_7;
	private JTextField PTB_8;
	private JTextField PTB_9;
	private JTextField PTB_10;
	private JTextField PTB_11;
	private JTextField PTB_12;
	private JTextField PTB_13;
	private JTextField PTB_14;
	private JTextField PTB_15;
	private JTextField PTB_16;
	
	private JTextField UTB_1;
	private JTextField UTB_2;
	private JTextField UTB_3;
	private JTextField UTB_4;
	private JTextField UTB_5;
	private JTextField UTB_6;
	private JTextField UTB_7;
	private JTextField UTB_8;
	private JTextField UTB_9;
	private JTextField UTB_10;
	private JTextField CTB_1;
	private JTextField CTB_2;
	private JTextField CTB_3;
	private JTextField CTB_4;
	private JTextField CTB_5;
	private JTextField CTB_6;
	private JTextField CTB_7;
	private JTextField CTB_8;
	private JTextField CTB_9;
	private JTextField CTB_10;
	private JTextField UTB_11;
	private JTextField UTB_12;
	private JTextField UTB_13;
	private JTextField UTB_14;
	private JTextField UTB_15;
	private JTextField UTB_16;
	
	private JTextField CPF_1;
	private JTextField CPF_2;
	private JTextField CPF_3;
	private JTextField CPF_4;
	private JTextField CPF_5;
	private JTextField CPF_6;
	private JTextField CPF_7;
	private JTextField CPF_8;
	private JTextField CPF_9;
	private JTextField CPF_10;
	private JTextField CPF_11;
	private JTextField CPF_12;
	private JTextField CPF_13;
	private JTextField CPF_14;
	private JTextField CPF_15;
	private JTextField CPF_16;
	private JTextField CPF_17;
	
	private JTextField RTB_1;
	private JTextField RTB_2;
	private JTextField RTB_3;
	private JTextField RTB_4;
	private JTextField RTB_5;
	private JTextField RTB_6;
	private JTextField RTB_7;
	private JTextField RTB_8;
	private JTextField RTB_9;
	private JTextField RTB_10;
	private JTextField RTB_11;
	private JTextField RTB_12;
	private JTextField RTB_13;
	private JTextField RTB_14;
	private JTextField RTB_15;
	private JTextField RTB_16;
	
	private JTextField TU_1;
	private JTextField TU_2;
	private JTextField TU_3;
	private JTextField TU_4;
	private JTextField TU_5;
	private JTextField TU_6;
	private JTextField TU_7;
	private JTextField TU_8;
	private JTextField TU_9;
	private JTextField TU_10;
	private JTextField TU_11;
	private JTextField TU_12;
	private JTextField TU_13;
	private JTextField TU_14;
	private JTextField TU_15;
	private JTextField TU_16;
	
	private JLabel lblRequirUnit;
	private JTextField TotalCost;
	private JLabel lblTotalCost;
	
	private double[] Auto=new double[17];
	private double[] Cost=new double[17];
	
	public void sell() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellForm window = new SellForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public SellForm() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 1285, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	    
	    
	        JPanel panel = new JPanel();
		panel.setBackground(new Color(120,255,120));
		panel.setBounds(90, 11, 1190, 40);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food Item");
		lblNewLabel.setBounds(50, 11, 120, 22);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
	
		
		JLabel lblUnit = new JLabel("Cost Per Unit");
		lblUnit.setBounds(300,6,140,32);
		panel.add(lblUnit);
		lblUnit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblCostPreUnit = new JLabel("Taken Unit");
		lblCostPreUnit.setBounds(520, 6, 126, 32);
		
		panel.add(lblCostPreUnit);
		lblCostPreUnit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		
		JLabel lblRequired = new JLabel("Take");
		lblRequired.setBounds(1040,6,126,32);
		panel.add(lblRequired);
		lblRequired.setFont(new Font("Times New Roman", Font.BOLD, 16));
		

		JLabel lblFood = new JLabel("Cost Per Food");
		lblFood.setBounds(720,6,150,32);
		panel.add(lblFood);
		lblFood.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 255));
                
		panel_1.setBounds(80,62,180,630);
                panel_1.setOpaque(false);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		
		PTB_1 = new JTextField();
		PTB_1.setEditable(false);
		PTB_1.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_1.setBounds(10, 11, 160, 28);
		PTB_1.setColumns(10);
		panel_1.add(PTB_1);
		
		PTB_2 = new JTextField();
		PTB_2.setEditable(false);
		PTB_2.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_2.setColumns(10);
		PTB_2.setBounds(10, 50, 160, 28);
		panel_1.add(PTB_2);
		
		PTB_3 = new JTextField();
		PTB_3.setEditable(false);
		PTB_3.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_3.setColumns(10);
		PTB_3.setBounds(10, 89, 160, 28);
		panel_1.add(PTB_3);
		
		PTB_4 = new JTextField();
		PTB_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_4.setEditable(false);
		PTB_4.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_4.setColumns(10);
		PTB_4.setBounds(10, 128, 160, 28);
		panel_1.add(PTB_4);
		
		PTB_5 = new JTextField();
		PTB_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_5.setEditable(false);
		PTB_5.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_5.setColumns(10);
		PTB_5.setBounds(10, 167, 160, 28);
		panel_1.add(PTB_5);
		
		PTB_6 = new JTextField();
		PTB_6.setEditable(false);
		PTB_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_6.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_6.setColumns(10);
		PTB_6.setBounds(10, 206, 160, 28);
		panel_1.add(PTB_6);
		
		PTB_7 = new JTextField();
		PTB_7.setEditable(false);
		PTB_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_7.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_7.setColumns(10);
		PTB_7.setBounds(10, 245, 160, 28);
		panel_1.add(PTB_7);
		
		PTB_8 = new JTextField();
		PTB_8.setEditable(false);
		PTB_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_8.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_8.setColumns(10);
		PTB_8.setBounds(10, 284, 160, 28);
		panel_1.add(PTB_8);
		
		PTB_9 = new JTextField();
		PTB_9.setEditable(false);
		PTB_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_9.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_9.setColumns(10);
		PTB_9.setBounds(10, 323, 160, 28);
		panel_1.add(PTB_9);
		
		PTB_10 = new JTextField();
		PTB_10.setEditable(false);
		PTB_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_10.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_10.setColumns(10);
		PTB_10.setBounds(10, 362, 160, 28);
		panel_1.add(PTB_10);
		
		PTB_11 = new JTextField();
		PTB_11.setEditable(false);
		PTB_11.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_11.setColumns(10);
		PTB_11.setBounds(10, 401, 160, 28);
		panel_1.add(PTB_11);
		
		PTB_12 = new JTextField();
		PTB_12.setEditable(false);
		PTB_12.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_12.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_12.setColumns(10);
		PTB_12.setBounds(10, 440, 160, 28);
		panel_1.add(PTB_12);
		
		PTB_13 = new JTextField();
		PTB_13.setEditable(false);
		PTB_13.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_13.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_13.setColumns(10);
		PTB_13.setBounds(10, 479, 160, 28);
		panel_1.add(PTB_13);
		
		PTB_14 = new JTextField();
		PTB_14.setEditable(false);
		PTB_14.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_14.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_14.setColumns(10);
		PTB_14.setBounds(10, 479+39, 160, 28);
		panel_1.add(PTB_14);
		
		PTB_15 = new JTextField();
		PTB_15.setEditable(false);
		PTB_15.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_15.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_15.setColumns(10);
		PTB_15.setBounds(10, 479+78, 160, 28);
		panel_1.add(PTB_15);
		
		PTB_16 = new JTextField();
		PTB_16.setEditable(false);
		PTB_16.setHorizontalAlignment(SwingConstants.CENTER);
		PTB_16.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PTB_16.setColumns(10);
		PTB_16.setBounds(10, 479+78+39, 160, 28);
		panel_1.add(PTB_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 153, 255));
                panel_2.setOpaque(false);
		panel_2.setBounds(360, 62, 140, 630);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		UTB_1 = new JTextField();
		UTB_1.setEditable(false);
		UTB_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_1.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_1.setColumns(10);
		UTB_1.setBounds(10, 11, 120, 28);
		panel_2.add(UTB_1);
		
		UTB_2 = new JTextField();
		UTB_2.setEditable(false);
		UTB_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_2.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_2.setColumns(10);
		UTB_2.setBounds(10, 50, 120, 28);
		panel_2.add(UTB_2);
		

		UTB_3 = new JTextField();
		UTB_3.setEditable(false);
		UTB_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_3.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_3.setColumns(10);
		UTB_3.setBounds(10, 89, 120, 28);
		panel_2.add(UTB_3);
		
		UTB_4 = new JTextField();
		UTB_4.setEditable(false);
		UTB_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_4.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_4.setColumns(10);
		UTB_4.setBounds(10, 128, 120, 28);
		panel_2.add(UTB_4);
		
		UTB_5 = new JTextField();
		UTB_5.setEditable(false);
		UTB_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_5.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_5.setColumns(10);
		UTB_5.setBounds(10, 167, 120, 28);
		panel_2.add(UTB_5);
		
		UTB_6 = new JTextField();
		UTB_6.setEditable(false);
		UTB_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_6.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_6.setColumns(10);
		UTB_6.setBounds(10, 206, 120, 28);
		panel_2.add(UTB_6);
		
		UTB_7 = new JTextField();
		UTB_7.setEditable(false);
		UTB_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_7.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_7.setColumns(10);
		UTB_7.setBounds(10, 245, 120, 28);
		panel_2.add(UTB_7);
		
		UTB_8 = new JTextField();
		UTB_8.setEditable(false);
		UTB_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_8.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_8.setColumns(10);
		UTB_8.setBounds(10, 284, 120, 28);
		panel_2.add(UTB_8);
		
		UTB_9 = new JTextField();
		UTB_9.setEditable(false);
		UTB_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_9.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_9.setColumns(10);
		UTB_9.setBounds(10, 323, 120, 28);
		panel_2.add(UTB_9);
		
		UTB_10 = new JTextField();
		UTB_10.setEditable(false);
		UTB_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_10.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_10.setColumns(10);
		UTB_10.setBounds(10, 362, 120, 28);
		panel_2.add(UTB_10);
		
		UTB_11 = new JTextField();
		UTB_11.setEditable(false);
		UTB_11.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_11.setColumns(10);
		UTB_11.setBounds(10, 398, 120, 28);
		panel_2.add(UTB_11);
		
		UTB_12 = new JTextField();
		UTB_12.setEditable(false);
		UTB_12.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_12.setColumns(10);
		UTB_12.setBounds(10, 398+39, 120, 28);
		panel_2.add(UTB_12);
		
		UTB_13 = new JTextField();
		UTB_13.setEditable(false);
		UTB_13.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_13.setColumns(10);
		UTB_13.setBounds(10, 398+78, 120, 28);
		panel_2.add(UTB_13);
		
		UTB_14 = new JTextField();
		UTB_14.setEditable(false);
		UTB_14.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_14.setColumns(10);
		UTB_14.setBounds(10, 398+78+39, 120, 28);
		panel_2.add(UTB_14);
		
		UTB_15 = new JTextField();
		UTB_15.setEditable(false);
		UTB_15.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_15.setColumns(10);
		UTB_15.setBounds(10, 398+78+78, 120, 28);
		panel_2.add(UTB_15);
		
		UTB_16 = new JTextField();
		UTB_16.setEditable(false);
		UTB_16.setHorizontalAlignment(SwingConstants.CENTER);
		UTB_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UTB_16.setColumns(10);
		UTB_16.setBounds(10, 398+78+78+39, 120, 28);
		panel_2.add(UTB_16);
		
		
		JPanel panel4 = new JPanel();
		//panel4.setBackground(new Color(120,120,250));
                panel4.setOpaque(false);
		panel4.setBounds(790,60,150,630);
		frame.getContentPane().add(panel4);
		panel4.setLayout(null);
		
		CPF_1 = new JTextField();
		CPF_1.setEditable(false);
		CPF_1.setHorizontalAlignment(SwingConstants.CENTER);
		CPF_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		CPF_1.setBounds(20,11,105,28);
		CPF_1.setColumns(10);
		panel4.add(CPF_1);
		
		    CPF_2 = new JTextField();
		    CPF_2.setEditable(false);
			CPF_2.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_2.setColumns(10);
			CPF_2.setBounds(20,50,105,28);
			panel4.add(CPF_2);
		
			CPF_3 = new JTextField();
			CPF_3.setEditable(false);
			CPF_3.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_3.setColumns(10);
			CPF_3.setBounds(20,89,105,28);
			panel4.add(CPF_3);
			
			CPF_4 = new JTextField();
			CPF_4.setEditable(false);
			CPF_4.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_4.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_4.setColumns(10);
			CPF_4.setBounds(20,128,105,28);
			panel4.add(CPF_4);
			
			CPF_5 = new JTextField();
			CPF_5.setEditable(false);
			CPF_5.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_5.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_5.setColumns(10);
			CPF_5.setBounds(20,167,105,28);
			panel4.add(CPF_5);
			
			CPF_6 = new JTextField();
			CPF_6.setEditable(false);
			CPF_6.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_6.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_6.setColumns(10);
			CPF_6.setBounds(20,206,105,28);
			panel4.add(CPF_6);
			
			CPF_7 = new JTextField();
			CPF_7.setEditable(false);
			CPF_7.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_7.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_7.setColumns(10);
			CPF_7.setBounds(20,245,105,28);
			panel4.add(CPF_7);
			
			CPF_8 = new JTextField();
			CPF_8.setEditable(false);
			CPF_8.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_8.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_8.setColumns(10);
			CPF_8.setBounds(20,284,105,28);
			panel4.add(CPF_8);
			
			CPF_9 = new JTextField();
			CPF_9.setEditable(false);
			CPF_9.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_9.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_9.setColumns(10);
			CPF_9.setBounds(20,323,105,28);
			panel4.add(CPF_9);
			
			CPF_10 = new JTextField();
			CPF_10.setEditable(false);
			CPF_10.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_10.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_10.setColumns(10);
			CPF_10.setBounds(20,362,105,28);
			panel4.add(CPF_10);
			
			CPF_11 = new JTextField();
			CPF_11.setEditable(false);
			CPF_11.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_11.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_11.setColumns(10);
			CPF_11.setBounds(20,401,105,28);
			panel4.add(CPF_11);
			
			CPF_12 = new JTextField();
			CPF_12.setEditable(false);
			CPF_12.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_12.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_12.setColumns(10);
			CPF_12.setBounds(20,440,105,28);
			panel4.add(CPF_12);
			
			
            CPF_13 = new JTextField();
            CPF_13.setEditable(false);
	        CPF_13.setHorizontalAlignment(SwingConstants.CENTER);
	        CPF_13.setFont(new Font("Times New Roman", Font.ITALIC, 20));
	        CPF_13.setColumns(10);
	        CPF_13.setBounds(20,479,105,28);
	        panel4.add(CPF_13);
		
	
			
			CPF_14 = new JTextField();
			CPF_14.setEditable(false);
			CPF_14.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_14.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_14.setColumns(10);
			CPF_14.setBounds(20,518,105,28);
			panel4.add(CPF_14);
		

			CPF_15 = new JTextField();
			CPF_15.setEditable(false);
			CPF_15.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_15.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_15.setColumns(10);
			CPF_15.setBounds(20,557,105,28);
			panel4.add(CPF_15);
			
			CPF_16 = new JTextField();
			CPF_16.setEditable(false);
			CPF_16.setHorizontalAlignment(SwingConstants.CENTER);
			CPF_16.setFont(new Font("Times New Roman", Font.ITALIC, 20));
			CPF_16.setColumns(10);
			CPF_16.setBounds(20,596,105,28);
			panel4.add(CPF_16);
			
			JPanel panel5 = new JPanel();
                        panel5.setOpaque(false);
			panel5.setLayout(null);
			
			panel5.setBackground(SystemColor.textHighlight);
			panel5.setBackground(new Color(120,120,250));
			panel5.setBounds(1000,60,290,630);
			frame.getContentPane().add(panel5);
			
			JButton button1 = new JButton("Full");
			button1.setBounds(110,11,80,28);
			button1.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button1);
			
			button1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[0]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button2 = new JButton("Full");
			button2.setBounds(110,50,80,28);
			button2.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button2);
			
			button2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[1]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button3 = new JButton("Full");
			button3.setBounds(110,89,80,28);
			button3.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button3);
			
			button3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[2]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button4 = new JButton("Full");
			button4.setBounds(110,128,80,28);
			button4.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button4);
			
			button4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[3]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button5 = new JButton("Full");
			button5.setBounds(110,167,80,28);
			button5.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button5);
			
			button5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[4]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button6 = new JButton("Full");
			button6.setBounds(110,206,80,28);
			button6.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button6);
			
			button6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[5]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button7 = new JButton("Full");
			button7.setBounds(110,245,80,28);
			button7.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button7);
			
			button7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[6]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button8 = new JButton("Full");
			button8.setBounds(110,284,80,28);
			button8.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button8);
			
			button8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[7]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button9 = new JButton("Full");
			button9.setBounds(110,323,80,28);
			button9.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button9);
			
			button9.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[8]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button10 = new JButton("Full");
			button10.setBounds(110,362,80,28);
			button10.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button10);
			
			button10.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[9]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button11 = new JButton("Full");
			button11.setBounds(110,401,80,28);
			button11.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button11);
			
			button11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[10]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button12 = new JButton("Full");
			button12.setBounds(110,440,80,28);
			button12.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button12);
			
			button12.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[11]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button13 = new JButton("Full");
			button13.setBounds(110,479,80,28);
			button13.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button13);
			
			button13.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[12]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button14 = new JButton("Full");
			button14.setBounds(110,518,80,28);
			button14.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button14);
			
			button14.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[13]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button15 = new JButton("Full");
			button15.setBounds(110,557,80,28);
			button15.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button15);
			
			button15.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[14]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			JButton button16 = new JButton("Full");
			button16.setBounds(110,596,80,28);
			button16.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Bisal.PNG"));
			panel5.add(button16);
			
			button16.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 Auto[15]+=Double.parseDouble("1");
					 AutoCostCal();
					
				}
			});
			
			
			
			JButton button1_2 = new JButton("Half");
			button1_2.setBounds(200,11,80,28);
			button1_2.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_2);
			button1_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[0]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_3 = new JButton("Half");
			button1_3.setBounds(200,50,80,28);
			button1_3.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_3);
			button1_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[1]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_4 = new JButton("Half");
			button1_4.setBounds(200,89,80,28);
			button1_4.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_4);
			button1_4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[2]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			
			JButton button1_5 = new JButton("Half");
			button1_5.setBounds(200,89+39,80,28);
			button1_5.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_5);
			button1_5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[3]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_6 = new JButton("Half");
			button1_6.setBounds(200,167,80,28);
			button1_6.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_6);
			button1_6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[4]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_7 = new JButton("Half");
			button1_7.setBounds(200,206,80,28);
			button1_7.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_7);
			button1_7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[5]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_8 = new JButton("Half");
			button1_8.setBounds(200,245,80,28);
			button1_8.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_8);
			button1_8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[6]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_9 = new JButton("Half");
			button1_9.setBounds(200,284,80,28);
			button1_9.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_9);
			button1_9.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[7]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_10 = new JButton("Half");
			button1_10.setBounds(200,323,80,28);
			button1_10.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_10);
			button1_10.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[8]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_11 = new JButton("Half");
			button1_11.setBounds(200,362,80,28);
			button1_11.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_11);
			button1_11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[9]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_12 = new JButton("Half");
			button1_12.setBounds(200,401,80,28);
			button1_12.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_12);
			button1_12.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[10]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			JButton button1_13 = new JButton("Half");
			button1_13.setBounds(200,440,80,28);
			button1_13.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_13);
			button1_13.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[11]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			
			JButton button1_14 = new JButton("Half");
			button1_14.setBounds(200,479,80,28);
			button1_14.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_14);
			button1_14.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[12]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			
			JButton button1_15 = new JButton("Half");
			button1_15.setBounds(200,518,80,28);
			button1_15.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_15);
			button1_15.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[13]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			
			JButton button1_16 = new JButton("Half");
			button1_16.setBounds(200,557,80,28);
			button1_16.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_16);
			button1_16.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[14]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			
			JButton button1_17 = new JButton("Half");
			button1_17.setBounds(200,596,80,28);
			button1_17.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Haf.PNG"));
			panel5.add(button1_17);
			button1_17.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Auto[15]+=Double.parseDouble(".5");
					 AutoCostCal();
				}
			});
			
			
			RTB_1 = new JTextField();
			RTB_1.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_1.setColumns(10);
			RTB_1.setBounds(15, 11, 70, 28);
			panel5.add(RTB_1);
			RTB_1.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[0]=0.0;
						 if(RTB_1.getText().length()>0)
							 Auto[0]=Double.parseDouble(RTB_1.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_1.getText().length();i++) 
						 if(RTB_1.getText().charAt(i)=='.')cnt++;
					 if(RTB_1.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[0]=Double.parseDouble(RTB_1.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_2 = new JTextField();
			RTB_2.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_2.setColumns(10);
			RTB_2.setBounds(15, 50, 70, 28);
			panel5.add(RTB_2);
			RTB_2.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[1]=0.0;
						 if(RTB_2.getText().length()>0)
							 Auto[0]=Double.parseDouble(RTB_2.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_2.getText().length();i++) 
						 if(RTB_2.getText().charAt(i)=='.')cnt++;
					 if(RTB_2.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[1]=Double.parseDouble(RTB_2.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_3 = new JTextField();
			RTB_3.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_3.setColumns(10);
			RTB_3.setBounds(15, 89, 70, 28);
			panel5.add(RTB_3);
			RTB_3.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[2]=0.0;
						 if(RTB_3.getText().length()>0)
							 Auto[2]=Double.parseDouble(RTB_3.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_3.getText().length();i++) 
						 if(RTB_3.getText().charAt(i)=='.')cnt++;
					 if(RTB_3.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[2]=Double.parseDouble(RTB_3.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_4 = new JTextField();
			RTB_4.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_4.setColumns(10);
			RTB_4.setBounds(15, 128, 70, 28);
			panel5.add(RTB_4);
			RTB_4.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[3]=0.0;
						 if(RTB_4.getText().length()>0)
							 Auto[3]=Double.parseDouble(RTB_4.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_4.getText().length();i++) 
						 if(RTB_4.getText().charAt(i)=='.')cnt++;
					 if(RTB_4.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[3]=Double.parseDouble(RTB_4.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_5 = new JTextField();
			RTB_5.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_5.setColumns(10);
			RTB_5.setBounds(15, 167, 70, 28);
			panel5.add(RTB_5);
			RTB_5.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[4]=0.0;
						 if(RTB_5.getText().length()>0)
							 Auto[4]=Double.parseDouble(RTB_5.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_5.getText().length();i++) 
						 if(RTB_5.getText().charAt(i)=='.')cnt++;
					 if(RTB_5.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[4]=Double.parseDouble(RTB_5.getText()+C);
						 AutoCostCal();
					 }
				 }
				 
			});
			
			RTB_6 = new JTextField();
			RTB_6.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_6.setColumns(10);
			RTB_6.setBounds(15, 206, 70, 28);
			panel5.add(RTB_6);
			RTB_6.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[5]=0.0;
						 if(RTB_6.getText().length()>0)
							 Auto[5]=Double.parseDouble(RTB_6.getText());
						 AutoCostCal();
					 }
					 for(int i=0;i<RTB_6.getText().length();i++) 
						 if(RTB_6.getText().charAt(i)=='.')cnt++;
					 if(RTB_6.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[5]=Double.parseDouble(RTB_6.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_7 = new JTextField();
			RTB_7.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_7.setColumns(10);
			RTB_7.setBounds(15, 245, 70, 28);
			panel5.add(RTB_7);
			RTB_7.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[6]=0.0;
						 if(RTB_7.getText().length()>0)
							 Auto[6]=Double.parseDouble(RTB_7.getText());
						 AutoCostCal();
					 }
					 for(int i=0;i<RTB_7.getText().length();i++) 
						 if(RTB_7.getText().charAt(i)=='.')cnt++;
					 if(RTB_7.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[6]=Double.parseDouble(RTB_7.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_8 = new JTextField();
			RTB_8.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_8.setColumns(10);
			RTB_8.setBounds(15, 284, 70, 28);
			panel5.add(RTB_8);
			RTB_8.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[7]=0.0;
						 if(RTB_8.getText().length()>0)
							 Auto[7]=Double.parseDouble(RTB_8.getText());
						 AutoCostCal();
					 }
					 for(int i=0;i<RTB_8.getText().length();i++) 
						 if(RTB_8.getText().charAt(i)=='.')cnt++;
					 if(RTB_8.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[7]=Double.parseDouble(RTB_8.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_9 = new JTextField();
			RTB_9.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_9.setColumns(10);
			RTB_9.setBounds(15, 323, 70, 28);
			panel5.add(RTB_9);
			RTB_9.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[8]=0.0;
						 if(RTB_9.getText().length()>0)
							 Auto[8]=Double.parseDouble(RTB_9.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_9.getText().length();i++) 
						 if(RTB_9.getText().charAt(i)=='.')cnt++;
					 if(RTB_9.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[8]=Double.parseDouble(RTB_9.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_10 = new JTextField();
			RTB_10.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_10.setColumns(10);
			RTB_10.setBounds(15, 362, 70, 28);
			panel5.add(RTB_10);
			RTB_10.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[9]=0.0;
						 if(RTB_10.getText().length()>0)
							 Auto[9]=Double.parseDouble(RTB_10.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_10.getText().length();i++) 
						 if(RTB_10.getText().charAt(i)=='.')cnt++;
					 if(RTB_10.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[9]=Double.parseDouble(RTB_10.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_11 = new JTextField();
			RTB_11.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_11.setColumns(10);
			RTB_11.setBounds(15, 401, 70, 28);
			panel5.add(RTB_11);
			RTB_11.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[10]=0.0;
						 if(RTB_11.getText().length()>0)
							 Auto[10]=Double.parseDouble(RTB_11.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_11.getText().length();i++) 
						 if(RTB_11.getText().charAt(i)=='.')cnt++;
					 if(RTB_11.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[10]=Double.parseDouble(RTB_11.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_12 = new JTextField();
			RTB_12.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_12.setColumns(10);
			RTB_12.setBounds(15, 440, 70, 28);
			panel5.add(RTB_12);
			RTB_12.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[11]=0.0;
						 if(RTB_12.getText().length()>0)
							 Auto[1]=Double.parseDouble(RTB_12.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_12.getText().length();i++) 
						 if(RTB_12.getText().charAt(i)=='.')cnt++;
					 if(RTB_12.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[11]=Double.parseDouble(RTB_1.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_13 = new JTextField();
			RTB_13.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_13.setColumns(10);
			RTB_13.setBounds(15, 479, 70, 28);
			panel5.add(RTB_13);
			RTB_13.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[12]=0.0;
						 if(RTB_13.getText().length()>0)
							 Auto[12]=Double.parseDouble(RTB_1.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_13.getText().length();i++) 
						 if(RTB_13.getText().charAt(i)=='.')cnt++;
					 if(RTB_13.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[12]=Double.parseDouble(RTB_1.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_14 = new JTextField();
			RTB_14.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_14.setColumns(10);
			RTB_14.setBounds(15, 518, 70, 28);
			panel5.add(RTB_14);
			RTB_14.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[13]=0.0;
						 if(RTB_14.getText().length()>0)
							 Auto[13]=Double.parseDouble(RTB_14.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_14.getText().length();i++) 
						 if(RTB_14.getText().charAt(i)=='.')cnt++;
					 if(RTB_14.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[13]=Double.parseDouble(RTB_14.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_15 = new JTextField();
			RTB_15.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_15.setColumns(10);
			RTB_15.setBounds(15, 557, 70, 28);
			panel5.add(RTB_15);
			RTB_15.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[14]=0.0;
						 if(RTB_15.getText().length()>0)
							 Auto[14]=Double.parseDouble(RTB_1.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_15.getText().length();i++) 
						 if(RTB_15.getText().charAt(i)=='.')cnt++;
					 if(RTB_15.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[14]=Double.parseDouble(RTB_15.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			RTB_16 = new JTextField();
			RTB_16.setHorizontalAlignment(SwingConstants.CENTER);
			RTB_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
			RTB_16.setColumns(10);
			RTB_16.setBounds(15, 596, 70, 28);
			panel5.add(RTB_16);
			RTB_16.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 
					 char C=e.getKeyChar();
					 if(C==KeyEvent.VK_BACK_SPACE){
						 Auto[15]=0.0;
						 if(RTB_16.getText().length()>0)
							 Auto[15]=Double.parseDouble(RTB_1.getText());
						 AutoCostCal();
					 }
					 int cnt=0;
					 for(int i=0;i<RTB_16.getText().length();i++) 
						 if(RTB_16.getText().charAt(i)=='.')cnt++;
					 if(RTB_16.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
					 else{
						 Auto[15]=Double.parseDouble(RTB_16.getText()+C);
						 AutoCostCal();
					 }
				 }
			});
			
			
			JPanel panel3 = new JPanel();
			panel3.setBackground(new Color(50,255,120));
                        panel3.setOpaque(false);
			panel3.setBounds(580,60,130,630);
			frame.getContentPane().add(panel3);
			panel3.setLayout(null);
			
			TU_1 = new JTextField();
			TU_1.setEditable(false);
			TU_1.setHorizontalAlignment(SwingConstants.CENTER);
			TU_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_1.setBounds(15,11,100,28);
			panel3.add(TU_1);
			
			TU_2 = new JTextField();
			TU_2.setEditable(false);
			TU_2.setHorizontalAlignment(SwingConstants.CENTER);
			TU_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_2.setBounds(15,50,100,28);
			panel3.add(TU_2);
			
			TU_3 = new JTextField();
			TU_3.setEditable(false);
			TU_3.setHorizontalAlignment(SwingConstants.CENTER);
			TU_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_3.setBounds(15,89,100,28);
			panel3.add(TU_3);
			
			TU_4 = new JTextField();
			TU_4.setEditable(false);
			TU_4.setHorizontalAlignment(SwingConstants.CENTER);
			TU_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_4.setBounds(15,128,100,28);
			panel3.add(TU_4);
			
			TU_5 = new JTextField();
			TU_5.setEditable(false);
			TU_5.setHorizontalAlignment(SwingConstants.CENTER);
			TU_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_5.setBounds(15,167,100,28);
			panel3.add(TU_5);
			
			TU_6 = new JTextField();
			TU_6.setEditable(false);
			TU_6.setHorizontalAlignment(SwingConstants.CENTER);
			TU_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_6.setBounds(15,206,100,28);
			panel3.add(TU_6);
			
			TU_7 = new JTextField();
			TU_7.setEditable(false);
			TU_7.setHorizontalAlignment(SwingConstants.CENTER);
			TU_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_7.setBounds(15,245,100,28);
			panel3.add(TU_7);
			
			TU_8 = new JTextField();
			TU_8.setEditable(false);
			TU_8.setHorizontalAlignment(SwingConstants.CENTER);
			TU_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_8.setBounds(15,284,100,28);
			panel3.add(TU_8);
			
			TU_9 = new JTextField();
			TU_9.setEditable(false);
			TU_9.setHorizontalAlignment(SwingConstants.CENTER);
			TU_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_9.setBounds(15,323,100,28);
			panel3.add(TU_9);
			
			TU_10 = new JTextField();
			TU_10.setEditable(false);
			TU_10.setHorizontalAlignment(SwingConstants.CENTER);
			TU_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_10.setBounds(15,362,100,28);
			panel3.add(TU_10);
			
			TU_11 = new JTextField();
			TU_11.setEditable(false);
			TU_11.setHorizontalAlignment(SwingConstants.CENTER);
			TU_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_11.setBounds(15,401,100,28);
			panel3.add(TU_11);
			
			TU_12 = new JTextField();
			TU_12.setEditable(false);
			TU_12.setHorizontalAlignment(SwingConstants.CENTER);
			TU_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_12.setBounds(15,440,100,28);
			panel3.add(TU_12);
			
			TU_13 = new JTextField();
			TU_13.setEditable(false);
			TU_13.setHorizontalAlignment(SwingConstants.CENTER);
			TU_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_13.setBounds(15,479,100,28);
			panel3.add(TU_13);
			
			TU_14 = new JTextField();
			TU_14.setEditable(false);
			TU_14.setHorizontalAlignment(SwingConstants.CENTER);
			TU_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_14.setBounds(15,518,100,28);
			panel3.add(TU_14);
			
			TU_15 = new JTextField();
			TU_15.setEditable(false);
			TU_15.setHorizontalAlignment(SwingConstants.CENTER);
			TU_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_15.setBounds(15,557,100,28);
			panel3.add(TU_15);
			
			TU_16 = new JTextField();
			TU_16.setEditable(false);
			TU_16.setHorizontalAlignment(SwingConstants.CENTER);
			TU_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
			TU_16.setBounds(15,596,100,28);
			panel3.add(TU_16);
			
			
			TotalCost = new JTextField();
			TotalCost.setEditable(false);
			TotalCost.setHorizontalAlignment(SwingConstants.CENTER);
			TotalCost.setFont(new Font("Times New Roman", Font.BOLD, 16));
			TotalCost.setColumns(10);
			TotalCost.setBounds(810, 720, 100, 28);
			frame.getContentPane().add(TotalCost);
                        
                        JPanel panelw = new JPanel();
                        panelw.setBounds(605, 720, 200, 28);
                        frame.getContentPane().add(panelw);
			
			lblTotalCost = new JLabel("Total Payable Cost");
			//lblTotalCost.setBackground(new Color(255, 0, 0));
                        lblTotalCost.setForeground(Color.blue);
			lblTotalCost.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblTotalCost.setBounds(605, 720, 200, 28);
			panelw.add(lblTotalCost);
			
			JButton printButton = new JButton("Order");
			printButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
			printButton.setBounds(1100, 720, 100, 29);
                        printButton.setForeground(Color.BLUE);
			frame.getContentPane().add(printButton);
			
			printButton.addActionListener(new PrintUIWindow(frame));
			
			/*printButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});*/
		
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBounds(85, 720, 170, 29);
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				MainForm1 ob= new MainForm1();
				String[] args = null;
				ob.main(args);
				
			}
		});
		
		JLabel jLabel = new JLabel("Tk");
		jLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jLabel.setBounds(915, 720, 100, 29);
		jLabel.setForeground(Color.yellow);
		//jLabel.setIcon(new ImageIcon("H:\\PICTURE\\soft.PNG"));
		frame.add(jLabel);
		Initializing();
		
		JLabel imageLabel = new JLabel();
		imageLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		imageLabel.setBounds(0,0,1400,850);
		imageLabel.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/Food.png"));
		frame.getContentPane().add(imageLabel);
	
		
		
	}
	
	private void Initializing()
	{
		FILEIO ob = new FILEIO();
		ob.Read();
		
		PTB_1.setText(ob.PTB[0]);
		PTB_2.setText(ob.PTB[1]);
		PTB_3.setText(ob.PTB[2]);
		PTB_4.setText(ob.PTB[3]);
		PTB_5.setText(ob.PTB[4]);
		PTB_6.setText(ob.PTB[5]);
		PTB_7.setText(ob.PTB[6]);
		PTB_8.setText(ob.PTB[7]);
		PTB_9.setText(ob.PTB[8]);
		PTB_10.setText(ob.PTB[9]);
		PTB_11.setText(ob.PTB[10]);
		PTB_12.setText(ob.PTB[11]);
		PTB_13.setText(ob.PTB[12]);
		PTB_14.setText(ob.PTB[13]);
		PTB_15.setText(ob.PTB[14]);
		PTB_16.setText(ob.PTB[15]);
		
		UTB_1.setText(ob.CTB[0]);
		UTB_2.setText(ob.CTB[1]);
		UTB_3.setText(ob.CTB[2]);
		UTB_4.setText(ob.CTB[3]);
		UTB_5.setText(ob.CTB[4]);
		UTB_6.setText(ob.CTB[5]);
		UTB_7.setText(ob.CTB[6]);
		UTB_8.setText(ob.CTB[7]);
		UTB_9.setText(ob.CTB[8]);
		UTB_10.setText(ob.CTB[9]);
		UTB_11.setText(ob.CTB[10]);
		UTB_12.setText(ob.CTB[11]);
		UTB_13.setText(ob.CTB[12]);
		UTB_14.setText(ob.CTB[13]);
		UTB_15.setText(ob.CTB[14]);
		UTB_16.setText(ob.CTB[15]);
		
		for(int i=0;i<16;i++) Auto[i]=Cost[i]=0.0; 
		
		    if(ob.CTB[0].length()!=0)
			Cost[0]=Double.parseDouble(ob.CTB[0]);
			if(ob.CTB[1].length()!=0)
			Cost[1]=Double.parseDouble(ob.CTB[1]);
			if(ob.CTB[2].length()!=0)
			Cost[2]=Double.parseDouble(ob.CTB[2]);
			if(ob.CTB[3].length()!=0)
			Cost[3]=Double.parseDouble(ob.CTB[3]);
			if(ob.CTB[4].length()!=0)
			Cost[4]=Double.parseDouble(ob.CTB[4]);
			if(ob.CTB[5].length()!=0)
			Cost[5]=Double.parseDouble(ob.CTB[5]);
			if(ob.CTB[6].length()!=0)
			Cost[6]=Double.parseDouble(ob.CTB[6]);
			if(ob.CTB[7].length()!=0)
			Cost[7]=Double.parseDouble(ob.CTB[7]);
			if(ob.CTB[8].length()!=0)
			Cost[8]=Double.parseDouble(ob.CTB[8]);
			if(ob.CTB[9].length()!=0)
			Cost[9]=Double.parseDouble(ob.CTB[9]);
			if(ob.CTB[10].length()!=0)
			Cost[10]=Double.parseDouble(ob.CTB[10]);
			if(ob.CTB[11].length()!=0)
				Cost[11]=Double.parseDouble(ob.CTB[11]);
			if(ob.CTB[12].length()!=0)
				Cost[12]=Double.parseDouble(ob.CTB[12]);
			if(ob.CTB[13].length()!=0)
				Cost[13]=Double.parseDouble(ob.CTB[13]);
			if(ob.CTB[14].length()!=0)
				Cost[14]=Double.parseDouble(ob.CTB[14]);
			if(ob.CTB[15].length()!=0)
				Cost[15]=Double.parseDouble(ob.CTB[15]);
			
			
		
		
	}
	
	
	void AutoCostCal(){
		double Ans=0.0;
		
		DecimalFormat k = new DecimalFormat("##.00");
		
		for(int i=0;i<16;i++)
			{
			Ans+=(Cost[i]*Auto[i]);
			if(i==0){
				
				CPF_1.setText(k.format(Cost[i]*Auto[i]));
				
				TU_1.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_1.setText(null);
				if(Auto[i]==0)
					TU_1.setText(null);
					
			}
			else if(i==1){
				if(Cost[i]*Auto[i]!=0)
				CPF_2.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_2.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_2.setText(null);
				if(Auto[i]==0)
					TU_2.setText(null);
				}
			else if(i==2){
				if(Cost[i]*Auto[i]!=0)
				CPF_3.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_3.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_3.setText(null);
				if(Auto[i]==0)
					TU_3.setText(null);
				}
			else if(i==3){
				if(Cost[i]*Auto[i]!=0)
				CPF_4.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_4.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_4.setText(null);
				if(Auto[i]==0)
					TU_4.setText(null);
			}
			else if(i==4){
				if(Cost[i]*Auto[i]!=0)
				CPF_5.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_5.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_5.setText(null);
				if(Auto[i]==0)
					TU_5.setText(null);
			}
			else if(i==5){
				if(Cost[i]*Auto[i]!=0)
				CPF_6.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_6.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_6.setText(null);
				if(Auto[i]==0)
					TU_6.setText(null);
			}
			else if(i==6){
				if(Cost[i]*Auto[i]!=0)
				CPF_7.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_7.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_7.setText(null);
				if(Auto[i]==0)
					TU_7.setText(null);
			}
			else if(i==7){
				if(Cost[i]*Auto[i]!=0)
				CPF_8.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_8.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_8.setText(null);
				if(Auto[i]==0)
					TU_8.setText(null);
			}
			else if(i==8){
				if(Cost[i]*Auto[i]!=0)
				CPF_9.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_9.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_9.setText(null);
				if(Auto[i]==0)
					TU_9.setText(null);
			}
			else if(i==9){
				if(Cost[i]*Auto[i]!=0)
				CPF_10.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_10.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_10.setText(null);
				if(Auto[i]==0)
					TU_10.setText(null);
			}
			else if(i==10){
				if(Cost[i]*Auto[i]!=0)
				CPF_11.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_11.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_11.setText(null);
				if(Auto[i]==0)
					TU_11.setText(null);
			}
			else if(i==11){
				if(Cost[i]*Auto[i]!=0)
				CPF_12.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_12.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_12.setText(null);
				if(Auto[i]==0)
					TU_12.setText(null);
			}
			else if(i==12){
				if(Cost[i]*Auto[i]!=0)
				CPF_13.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_13.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_13.setText(null);
				if(Auto[i]==0)
					TU_13.setText(null);
			}
			else if(i==13){
				if(Cost[i]*Auto[i]!=0)
				CPF_14.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_14.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_14.setText(null);
				if(Auto[i]==0)
					TU_14.setText(null);
			}
			else if(i==14){
				if(Cost[i]*Auto[i]!=0)
				CPF_15.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_15.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_15.setText(null);
				if(Auto[i]==0)
					TU_15.setText(null);
			}
			else if(i==15){
				if(Cost[i]*Auto[i]!=0)
				CPF_16.setText(k.format(Cost[i]*Auto[i]));
				if(Auto[i]!=0)
				TU_16.setText(k.format(Auto[i]));
				if(Cost[i]*Auto[i]==0)
					CPF_16.setText(null);
				if(Auto[i]==0)
					TU_16.setText(null);
			}
			}
		
		DecimalFormat f = new DecimalFormat("##.00");
		 
		TotalCost.setText(f.format(Ans));
		if(Ans==0)
			TotalCost.setText(null);
	}
	
	
	

	

}