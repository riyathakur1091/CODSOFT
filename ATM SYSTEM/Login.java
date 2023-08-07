import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class Login extends Commons{
	public void loginView() {
		Commons common = new Commons();
		JFrame frame = (JFrame)common.Frame();
		Font txt = new Font("", Font.BOLD, 15);
		Pin pin = new Pin();
		
		//---------------Jlabel and text field to enter the "CARDNUMBER"---------------->
		JLabel card = new JLabel("ENTER YOUR CARD NUMBER");
		card.setBounds(50, 250, 1000, 200);
		card.setFont(new Font("Calibri", Font.BOLD, 45));
		JTextField cardNumber = new JTextField();
		cardNumber.setBounds(50, 390, 600, 50);
		cardNumber.setFont(txt);
		frame.add(cardNumber);
		frame.add(card);


		//-------------JLABEL----------------------------
		
        JLabel or = new JLabel(" -----------------------------------OR---------------------------------");
		or.setBounds(10, 500, 1000, 30);
		or.setFont(new Font("Calibri", Font.BOLD, 35));
		frame.add(or);

		//----------------the ADMIN login label---->

		JLabel admin = new JLabel("ADMIN LOGIN >>");
		admin.setBounds(200, 550, 600, 40);
		admin.setFont(new Font("Calibri", Font.BOLD, 48));
		frame.add(admin);
		admin.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) { 
				pin.pinView("admin");
				frame.dispose();
			}
		});
			
				

		//------------------------------------------
		
		//-----------------the continue BUTTON----------------->
		JButton cont = new JButton("CONTINUE");
		cont.setBounds(700, 390, 200, 50);
		cont.setFont(new Font("Rockwell", Font.BOLD, 25));
				frame.add(cont);
		cont.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cardNumber.getText().length() == 16) {
					pin.pinView(cardNumber.getText());
					frame.dispose();
				}
				else {
					Fail fail = new Fail();
					fail.failView("WRONG CARD NUMBER!!!");
					frame.dispose();
				}
			}
			
		});
		//----------------------------------------
		frame.setVisible(true);
	}
}