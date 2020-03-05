import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.JTextField;


class textField extends JFrame{
	private Container c;
	private JLabel imglabel;
	private ImageIcon img;
	private JTextField tf1, tf2;
	private Font f;
	
	textField()
	{
		components();
	}
	public void components(){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		
		f = new Font("Arial", Font.BOLD + Font.ITALIC, 24);
		
		tf1 = new JTextField("arif");
		tf1.setBounds(50,50,200,50);
		tf1.setFont(f);
		tf1.setForeground(Color.WHITE);
		tf1.setBackground(Color.BLUE);
		c.add(tf1);
		
		tf2 = new JTextField("shahriar");
		tf2.setBounds(50,110,200,50);
		tf2.setFont(f);
		tf2.setForeground(Color.WHITE);
		tf2.setBackground(Color.RED);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		c.add(tf2);
	}
	
	public static void main(String[] args)
	{
		textField frame = new textField();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(750 , 400, 600, 400);
		frame.setTitle("boi niben");
	}
}