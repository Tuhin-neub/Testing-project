package swing;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JPasswordField;

public class PasswordFile extends JFrame{
	private Container co;
	private JPasswordField pf;
	
	PasswordFile()
	{
		com();
		
	}
	public void com()
	{
		co=this.getContentPane();
		co.setLayout(null);
		co.setBackground(Color.orange);
		
		pf=new JPasswordField();
		pf.setEchoChar('*');
		pf.setBounds(50,20,150,50);
		co.add(pf);
		
		
	}
	
	public static void main(String args[])
	{
		PasswordFile frame=new PasswordFile();
		frame.setVisible(true);
		frame.setBounds(100,50,400,500);
		frame.setTitle("PASSWORD FIELD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}