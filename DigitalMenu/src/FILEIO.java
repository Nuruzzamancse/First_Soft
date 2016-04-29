import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FILEIO {
	private String Path="C:\\ShopManagement";
	private String FileName="C:\\ShopManagement\\Data.Text";
	public String[] PTB = new String[17];
	public String[] CTB = new String[17];
	//public String[] UTB = new String[12];
	private BufferedReader br;
	
	 
	FILEIO(){
		try{
			File file=new File(Path);
			if(!file.exists())
				file.mkdirs();
			
			file = new File(FileName);
			file.createNewFile();
			
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"SystemError!!!");
			}
	}
	private void ClearFile(){
		try{
		PrintWriter writer = new PrintWriter(FileName);
		writer.print("");
		writer.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"SystemError!!!");
		}
		
	}
	private void Set(){
		for(int i=0;i<17;i++) PTB[i]=CTB[i]="";
	}
	public void Read(){
		try{
			Set();
			br = new BufferedReader(new FileReader(FileName));
			for(int i=0;i<16;i++){
				PTB[i]=br.readLine();
				CTB[i]=br.readLine(); 
			}
			br.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"SystemError!!!");	
		}
	}
	public void Write(){
		ClearFile();
		try{
			File file= new File(FileName);
			FileWriter fileWritter = new FileWriter(file,true);
	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	        PrintWriter Write=new PrintWriter(bufferWritter); 
	        for(int i=0;i<16;i++){
	        	Write.println(PTB[i]);
	        	Write.println(CTB[i]);
	        }
	        Write.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"SystemError!!!");
		}
	}
}