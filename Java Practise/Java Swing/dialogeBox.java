import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

class MsgDlg1{
	public static void main(String[] args)
	{
		ImageIcon icon = new ImageIcon("Bee.png");
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Welcome "+name);
		
	}
}
class A{
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog(null, "Enter your first name : ", "Input", JOptionPane.QUESTION_MESSAGE);
		String l = JOptionPane.showInputDialog("Enter you last name : ");
		String name = s + " "+ l;
		JOptionPane.showMessageDialog(null,"Your full name is  "+name);
	}
}

class B{
	public static void main(String[] args)
	{
		int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit ?", "quit",JOptionPane.YES_NO_CANCEL_OPTION);
		if(choice == JOptionPane.YES_OPTION)
		{
			System.out.println("You have choice YES option");
			//System.exit(0);
		}
		else if(choice == JOptionPane.NO_OPTION)
		{
			System.out.println("You have choice no option");
		}
		else
		{
			System.out.println("You have choice Cancel option");
		}
	}
}

class Jframe{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		//frame.setLocationRelativeTo(null);
		frame.setLocation(750, 400);
		frame.setBounds(750, 400, 400 , 300); // combine of location and size
		frame.setTitle("BOI NIBEN");
		//frame.setResizable(false);  // unable ro resize
		
	}
}

class ConfirmDialog{
	public static void main(String[] args)
	{
		JOptionPane.showConfirmDialog(null, "do you want to quit?", "confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
	}
}

class JfImg extends JFrame{
	private ImageIcon icon;     // ImageIcon is a class to set the icon in the frame
	private Container c;
	JfImg(){   //constructor for connecting component method
		component();
	}
	public void component(){   // for add an incon to the frame
	    c = this.getContentPane(); 
        //c.setBackground(Color.yellow);
		
		icon = new ImageIcon(getClass().getResource("book.png"));
		this.setIconImage(icon.getImage());
	}
	public static void main(String[] args)
	{
		JfImg frame = new JfImg();
		frame.setVisible(true);    // from this line, the frame design in begining
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		//frame.setLocationRelativeTo(null);
		frame.setLocation(750, 400);
		frame.setBounds(750, 400, 800 , 1050); // combine of location and size
		frame.setTitle("BOI NIBEN");
		//frame.setResizable(false);  // unable ro resize
		
	}
}
class LabelDemo extends JFrame{
	private Container c;
	private JLabel userLabel, passLabel;
	private ImageIcon icon;
	private Font f;
	
	LabelDemo()
	{
		component();
	}
	public void component()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		
		f = new Font("Arial", Font.BOLD, 14);
		
		icon = new ImageIcon(getClass().getResource("book.png"));
		this.setIconImage(icon.getImage());
		
		userLabel = new JLabel();
		userLabel.setText("Enter your user name : ");
		userLabel.setBounds(20, 20, 500, 50);
		userLabel.setFont(f);
		userLabel.setForeground(Color.RED);
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.yellow);
		userLabel.setToolTipText("put down your username");
		c.add(userLabel);
		
		System.out.println(userLabel.getText());
		
		passLabel = new JLabel();
		passLabel.setText("Enter you password : ");
		passLabel.setBounds(20, 70, 500, 50);
		passLabel.setFont(f);
		passLabel.setForeground(Color.RED);
		passLabel.setOpaque(true);
		passLabel.setBackground(Color.GREEN);
		passLabel.setToolTipText("put your password");
		c.add(passLabel);
	}
	public static void main(String[] args)
	{
		LabelDemo frame = new LabelDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(750 , 400, 600, 400);
		frame.setTitle("boi niben");
	}
}