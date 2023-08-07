import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Commons {
JPanel panel;
	
JFrame frame;
	//all classes in this project will share a Common Graphical user Interface "..... 
	public Component Frame() {
		JFrame frame = new JFrame("ATM System Window");
		frame.setSize(1400, 900);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.yellow);
		//Container c=getContentPane();
		JPanel panel=new JPanel();
		panel.setLayout(null);
        panel.setBounds(0,0,1500,200);
		frame.add(panel);
		JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\Documents\\JAVA INTERNSHIP\\CODSOFT\\ATM SYSTEM\\ATM.png")); 
        label.setPreferredSize(new Dimension(100, 200));  //Gets the size of the image
        label.setBounds(250,0,1500,200); //Sets the location of the image
        panel.add(label); //Adds objects to the container
	   
		setVisible(true);
		
		return frame;
	}

		

	private void setVisible(boolean b) {
	}
}

