import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;


class ImgAdd extends JFrame{
	private Container c;
	private JLabel imglabel;
	private ImageIcon img;
	
	ImgAdd()
	{
		components();
	}
	public void components(){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		
		img = new ImageIcon(getClass().getResource("book.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(50, 30, 150,200);
		c.add(imglabel);
	}
	
	public static void main(String[] args)
	{
		ImgAdd frame = new ImgAdd();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(750 , 400, 600, 400);
		frame.setTitle("boi niben");
	}
}