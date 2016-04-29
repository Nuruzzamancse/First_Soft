import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import org.omg.CORBA.PUBLIC_MEMBER;

public class UpdateForm {
	
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
	private JTextField CTB_12;
	private JTextField CTB_13;
	private JTextField CTB_14;
	private JTextField CTB_15;
	private JTextField CTB_16;
	private JTextField PTB_11;
	private JTextField UTB_11;
	private JTextField CTB_11;
	private JButton btnSave;
	private JButton btnBack;
	
	public void update() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateForm window = new UpdateForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		public UpdateForm() {
			initialize();
			
		}
		
		private void initialize()
		{
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(0, 204, 255));
			frame.setResizable(false);
			frame.setBounds(100, 100, 461, 800);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		    frame.setLocation(x, y);
		    
		    
		        JPanel panel = new JPanel();
                        //panel.setOpaque(false);
                         //panel.setBackground(new Color(0,0,0,0));
			panel.setBackground(new Color(0, 255, 0));
                        panel.setForeground(Color.green);
			panel.setBounds(10, 25, 435, 40);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
                        
                         
			
			JLabel lblNewLabel = new JLabel("      Food Item");
			lblNewLabel.setBounds(10, 11, 120, 22);
			panel.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			
			JLabel lblCostPreUnit = new JLabel("Price Per Unit");
			lblCostPreUnit.setBounds(290, 6, 126, 32);
			panel.add(lblCostPreUnit);
			lblCostPreUnit.setFont(new Font("Times New Roman", Font.BOLD, 14));
                        
                        
                        
			
		
			
			
			
			
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(51, 153, 255));
                        panel_1.setOpaque(false);
			panel_1.setBounds(10, 62, 180, 633);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			PTB_1 = new JTextField();
			PTB_1.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_1.setBounds(10, 11, 140, 28);
			panel_1.add(PTB_1);
			PTB_1.setColumns(10);
			PTB_1.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_1.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			

			PTB_2 = new JTextField();
			PTB_2.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_2.setColumns(10);
			PTB_2.setBounds(10, 50, 140, 28);
			panel_1.add(PTB_2);
			PTB_2.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_2.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_3 = new JTextField();
			PTB_3.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_3.setColumns(10);
			PTB_3.setBounds(10, 89, 140, 28);
			panel_1.add(PTB_3);
			PTB_3.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_3.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_4 = new JTextField();
			PTB_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_4.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_4.setColumns(10);
			PTB_4.setBounds(10, 128, 140, 28);
			panel_1.add(PTB_4);
			PTB_4.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_4.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_5 = new JTextField();
			PTB_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_5.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_5.setColumns(10);
			PTB_5.setBounds(10, 167, 140, 28);
			panel_1.add(PTB_5);
			PTB_5.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_5.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			
			PTB_6 = new JTextField();
			PTB_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_6.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_6.setColumns(10);
			PTB_6.setBounds(10, 206, 140, 28);
			panel_1.add(PTB_6);
			PTB_6.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_6.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_7 = new JTextField();
			PTB_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_7.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_7.setColumns(10);
			PTB_7.setBounds(10, 245, 140, 28);
			panel_1.add(PTB_7);
			PTB_7.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_7.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_8 = new JTextField();
			PTB_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_8.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_8.setColumns(10);
			PTB_8.setBounds(10, 284, 140, 28);
			panel_1.add(PTB_8);
			PTB_8.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_8.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_9 = new JTextField();
			PTB_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_9.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_9.setColumns(10);
			PTB_9.setBounds(10, 323, 140, 28);
			panel_1.add(PTB_9);
			PTB_9.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_9.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_10 = new JTextField();
			PTB_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_10.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_10.setColumns(10);
			PTB_10.setBounds(10, 362, 140, 28);
			panel_1.add(PTB_10);
			PTB_10.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_10.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_11 = new JTextField();
			PTB_11.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_11.setColumns(10);
			PTB_11.setBounds(10, 401, 140, 28);
			panel_1.add(PTB_11);
			PTB_11.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_11.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_12 = new JTextField();
			PTB_12.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_12.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_12.setColumns(10);
			PTB_12.setBounds(10, 440, 140, 28);
			panel_1.add(PTB_12);
			PTB_11.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_12.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_13 = new JTextField();
			PTB_13.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_13.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_13.setColumns(10);
			PTB_13.setBounds(10, 479, 140, 28);
			panel_1.add(PTB_13);
			PTB_11.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_13.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_14 = new JTextField();
			PTB_14.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_14.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_14.setColumns(10);
			PTB_14.setBounds(10, 518, 140, 28);
			panel_1.add(PTB_14);
			PTB_14.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_14.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_15 = new JTextField();
			PTB_15.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_15.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_15.setColumns(10);
			PTB_15.setBounds(10, 557, 140, 28);
			panel_1.add(PTB_15);
			PTB_15.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_15.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			PTB_16 = new JTextField();
			PTB_16.setHorizontalAlignment(SwingConstants.CENTER);
			PTB_16.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			PTB_16.setColumns(10);
			PTB_16.setBounds(10, 596, 140, 28);
			panel_1.add(PTB_16);
			PTB_16.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 if(PTB_16.getText().length()>10){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
				 }
			});
			
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(51, 153, 255));
                        panel_3.setOpaque(false);
			panel_3.setBounds(270, 62, 180, 630);
			frame.getContentPane().add(panel_3);
			panel_3.setLayout(null);
			
			CTB_1 = new JTextField();
			CTB_1.setForeground(new Color(0, 0, 0));
			CTB_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_1.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_1.setColumns(10);
			CTB_1.setBounds(10, 11, 140, 28);
			panel_3.add(CTB_1);
			CTB_1.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_1.getText().length();i++) 
						 if(CTB_1.getText().charAt(i)=='.')cnt++;
					 if(CTB_1.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_2 = new JTextField();
			CTB_2.setForeground(new Color(0, 0, 0));
			CTB_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_2.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_2.setColumns(10);
			CTB_2.setBounds(10, 50, 140, 28);
			panel_3.add(CTB_2);
			CTB_2.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_2.getText().length();i++) 
						 if(CTB_2.getText().charAt(i)=='.')cnt++;
					 if(CTB_2.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_3 = new JTextField();
			CTB_3.setForeground(new Color(0, 0, 0));
			CTB_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_3.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_3.setColumns(10);
			CTB_3.setBounds(10, 89, 140, 28);
			panel_3.add(CTB_3);
			CTB_3.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_3.getText().length();i++) 
						 if(CTB_3.getText().charAt(i)=='.')cnt++;
					 if(CTB_3.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_4 = new JTextField();
			CTB_4.setForeground(new Color(0, 0, 0));
			CTB_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_4.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_4.setColumns(10);
			CTB_4.setBounds(10, 128, 140, 28);
			panel_3.add(CTB_4);
			CTB_4.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_4.getText().length();i++) 
						 if(CTB_4.getText().charAt(i)=='.')cnt++;
					 if(CTB_4.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_5 = new JTextField();
			CTB_5.setForeground(new Color(0, 0, 0));
			CTB_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_5.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_5.setColumns(10);
			CTB_5.setBounds(10, 167, 140, 28);
			panel_3.add(CTB_5);
			CTB_5.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_5.getText().length();i++) 
						 if(CTB_5.getText().charAt(i)=='.')cnt++;
					 if(CTB_5.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_6 = new JTextField();
			CTB_6.setForeground(new Color(0, 0, 0));
			CTB_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_6.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_6.setColumns(10);
			CTB_6.setBounds(10, 206, 140, 28);
			panel_3.add(CTB_6);
			CTB_6.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_6.getText().length();i++) 
						 if(CTB_6.getText().charAt(i)=='.')cnt++;
					 if(CTB_6.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_7 = new JTextField();
			CTB_7.setForeground(new Color(0, 0, 0));
			CTB_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_7.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_7.setColumns(10);
			CTB_7.setBounds(10, 245, 140, 28);
			panel_3.add(CTB_7);
			CTB_7.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_7.getText().length();i++) 
						 if(CTB_7.getText().charAt(i)=='.')cnt++;
					 if(CTB_7.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_8 = new JTextField();
			CTB_8.setForeground(new Color(0, 0, 0));
			CTB_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_8.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_8.setColumns(10);
			CTB_8.setBounds(10, 284, 140, 28);
			panel_3.add(CTB_8);
			CTB_8.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_8.getText().length();i++) 
						 if(CTB_8.getText().charAt(i)=='.')cnt++;
					 if(CTB_8.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_9 = new JTextField();
			CTB_9.setForeground(new Color(0, 0, 0));
			CTB_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_9.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_9.setColumns(10);
			CTB_9.setBounds(10, 323, 140, 28);
			panel_3.add(CTB_9);
			CTB_9.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_9.getText().length();i++) 
						 if(CTB_9.getText().charAt(i)=='.')cnt++;
					 if(CTB_9.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_10 = new JTextField();
			CTB_10.setForeground(new Color(0, 0, 0));
			CTB_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_10.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_10.setColumns(10);
			CTB_10.setBounds(10, 362, 140, 28);
			panel_3.add(CTB_10);
			CTB_10.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_10.getText().length();i++) 
						 if(CTB_10.getText().charAt(i)=='.')cnt++;
					 if(CTB_10.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_11 = new JTextField();
			CTB_11.setForeground(new Color(0, 0, 0));
			CTB_11.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_11.setColumns(10);
			CTB_11.setBounds(10, 398, 140, 28);
			panel_3.add(CTB_11);
			CTB_11.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_11.getText().length();i++) 
						 if(CTB_11.getText().charAt(i)=='.')cnt++;
					 if(CTB_11.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_12 = new JTextField();
			CTB_12.setForeground(new Color(0, 0, 0));
			CTB_12.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_12.setColumns(10);
			CTB_12.setBounds(10, 398+39, 140, 28);
			panel_3.add(CTB_12);
			CTB_12.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_12.getText().length();i++) 
						 if(CTB_12.getText().charAt(i)=='.')cnt++;
					 if(CTB_12.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_13 = new JTextField();
			CTB_13.setForeground(new Color(0, 0, 0));
			CTB_13.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_13.setColumns(10);
			CTB_13.setBounds(10, 398+78, 140, 28);
			panel_3.add(CTB_13);
			CTB_13.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_13.getText().length();i++) 
						 if(CTB_13.getText().charAt(i)=='.')cnt++;
					 if(CTB_13.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_14 = new JTextField();
			CTB_14.setForeground(new Color(0, 0, 0));
			CTB_14.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_14.setColumns(10);
			CTB_14.setBounds(10, 398+78+39, 140, 28);
			panel_3.add(CTB_14);
			CTB_14.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_14.getText().length();i++) 
						 if(CTB_14.getText().charAt(i)=='.')cnt++;
					 if(CTB_14.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_15 = new JTextField();
			CTB_15.setForeground(new Color(0, 0, 0));
			CTB_15.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_15.setColumns(10);
			CTB_15.setBounds(10, 398+78+78, 140, 28);
			panel_3.add(CTB_15);
			CTB_15.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_15.getText().length();i++) 
						 if(CTB_15.getText().charAt(i)=='.')cnt++;
					 if(CTB_15.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			CTB_16 = new JTextField();
			CTB_16.setForeground(new Color(0, 0, 0));
			CTB_16.setHorizontalAlignment(SwingConstants.CENTER);
			CTB_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
			CTB_16.setColumns(10);
			CTB_16.setBounds(10, 398+78+78+39, 140, 28);
			panel_3.add(CTB_16);
			CTB_16.addKeyListener(new KeyAdapter() {
				 public void keyTyped(KeyEvent e) {
					 char C=e.getKeyChar();
					 int cnt=0;
					 for(int i=0;i<CTB_16.getText().length();i++) 
						 if(CTB_16.getText().charAt(i)=='.')cnt++;
					 if(CTB_16.getText().length()>5 || (cnt==1&&C=='.') ){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					    }
					 else if(!(Character.isDigit(C)||C=='.'||C==KeyEvent.VK_BACK_SLASH)||C==KeyEvent.VK_DELETE){
						 Toolkit.getDefaultToolkit().beep();
				            e.consume();
					 }
				 }
			});
			
			btnSave = new JButton("SAVE");
			btnSave.setFont(new Font("Times New Roman", Font.BOLD, 16));
			btnSave.setBounds(300, 720, 100, 29);
			frame.getContentPane().add(btnSave);
			btnSave.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					Save_Pre();
					
				}
			});
			
			btnBack = new JButton("BACK");
			btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
			btnBack.setBounds(40, 720, 100, 29);
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
                        
                        JLabel lbl = new JLabel();
                        lbl.setBounds(0, 0, 461, 800);
                        lbl.setIcon(new ImageIcon("/home/mdnuruzzaman/NetBeansProjects/uddt.png"));
                        frame.getContentPane().add(lbl);
			
			Initializing();
			
		}
		
		private void Save_Pre(){
			FILEIO ob= new FILEIO();
			ob.PTB[0]=PTB_1.getText();
			ob.PTB[1]=PTB_2.getText();
			ob.PTB[2]=PTB_3.getText();
			ob.PTB[3]=PTB_4.getText();
			ob.PTB[4]=PTB_5.getText();
			ob.PTB[5]=PTB_6.getText();
			ob.PTB[6]=PTB_7.getText();
			ob.PTB[7]=PTB_8.getText();
			ob.PTB[8]=PTB_9.getText();
			ob.PTB[9]=PTB_10.getText();
			ob.PTB[10]=PTB_11.getText();
			ob.PTB[11]=PTB_12.getText();
			ob.PTB[12]=PTB_13.getText();
			ob.PTB[13]=PTB_14.getText();
			ob.PTB[14]=PTB_15.getText();
			ob.PTB[15]=PTB_15.getText();
			
			ob.CTB[0]=CTB_1.getText();
			ob.CTB[1]=CTB_2.getText();
			ob.CTB[2]=CTB_3.getText();
			ob.CTB[3]=CTB_4.getText();
			ob.CTB[4]=CTB_5.getText();
			ob.CTB[5]=CTB_6.getText();
			ob.CTB[6]=CTB_7.getText();
			ob.CTB[7]=CTB_8.getText();
			ob.CTB[8]=CTB_9.getText();
			ob.CTB[9]=CTB_10.getText();
			ob.CTB[10]=CTB_11.getText();
			ob.CTB[11]=CTB_12.getText();
			ob.CTB[12]=CTB_13.getText();
			ob.CTB[13]=CTB_14.getText();
			ob.CTB[14]=CTB_15.getText();
			ob.CTB[15]=CTB_16.getText();
			
	
			ob.Write();
			JOptionPane.showMessageDialog(null,"Done");
			
		}
		private void Initializing(){
			FILEIO ob= new FILEIO();
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
			
			
			CTB_1.setText(ob.CTB[0]);
			CTB_2.setText(ob.CTB[1]);
			CTB_3.setText(ob.CTB[2]);
			CTB_4.setText(ob.CTB[3]);
			CTB_5.setText(ob.CTB[4]);
			CTB_6.setText(ob.CTB[5]);
			CTB_7.setText(ob.CTB[6]);
			CTB_8.setText(ob.CTB[7]);
			CTB_9.setText(ob.CTB[8]);
			CTB_10.setText(ob.CTB[9]);
			CTB_11.setText(ob.CTB[10]);
			CTB_12.setText(ob.CTB[11]);
			CTB_13.setText(ob.CTB[12]);
			CTB_14.setText(ob.CTB[13]);
			CTB_15.setText(ob.CTB[14]);
			CTB_16.setText(ob.CTB[15]);
			
		}

	}
