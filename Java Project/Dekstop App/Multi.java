import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Multi extends JFrame{
	private Container c;
	private JLabel imglabel, textlabel;
	private JTextArea ta;
	private JTextField tf;
	private JButton clearButton;
	private ImageIcon img;
	private Font f;
	private Cursor cr;
	private ImageIcon icon;
	
	Multi()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		
		f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
		
		icon = new ImageIcon(getClass().getResource("calculator.png"));
		this.setIconImage(icon.getImage());
		
		img = new ImageIcon(getClass().getResource("multi2.jpg"));
		imglabel = new JLabel(img);
		imglabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		c.add(imglabel);
		
		textlabel = new JLabel("Enter any number");
		textlabel.setBounds(20, 250, 250, 40);
		textlabel.setForeground(Color.WHITE);
		textlabel.setFont(f);
		c.add(textlabel);
		
		tf= new JTextField();
		tf.setBounds(230,255,80,40);
		tf.setFont(f);
		tf.setHorizontalAlignment(JTextField.CENTER);
		tf.setBackground(Color.MAGENTA);
		c.add(tf);
		
		cr = new Cursor(Cursor.HAND_CURSOR);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(230,300,80,40);
        clearButton.setCursor(cr);		
		c.add(clearButton);
		
		
		ta = new JTextArea();
		ta.setBounds(20,350,300,300);
		ta.setFont(f);
		ta.setBackground(Color.WHITE);
		c.add(ta);
		
		
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String value = tf.getText();
				if(value.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "NO Input !");
				}
				else
				{
					ta.setText("");
				int num = Integer.parseInt(tf.getText());
				
				for(int i = 1; i<=10; i++)
				{
					int result = num *i;
					
					String r = String.valueOf(result);
					String n = String.valueOf(num);
					String inc = String.valueOf(i);
					
					ta.append(n+" X "+inc+" = "+r+"\n");
				}
				
				}	
			}
		}
		);
		
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText("");
			}
		});
		
	}
	
	
	public static void main(String[] args)
	{
		Multi frame = new Multi();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(300,20,360,700);
		frame.setTitle("Multiplication Table");
	}
}