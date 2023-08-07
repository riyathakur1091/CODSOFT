//importing libraries to create the frame and implmenting the action listeners--->

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;

//creating a class Number_count that will hold all the components such as frame ,Button,textArea etc..--->
  
public class Number_Count extends JFrame
{  
    //declaring a "Jframe"---->
			JFrame frame;
		

	//declaring "JLabels"--->
			JLabel lb1;
			
   		
	//declaring "JTextField "---->
            JTextField tf;  
    		

	//declaring a "Jbutton"--->
			JButton b; 


	////declaring a "button listener"--->
            ButtonListener bl; 


		
    //constructor---> 
   	        Number_Count()
		{  
        			 setTitle("Word Count Window"); 

			
			//*creating label as"lb1" to display the numbers of words-----> 
 
      			 	lb1=new JLabel("Total number of Words : ");
				    lb1.setForeground(Color.BLACK);	  
       			 	lb1.setBounds(100,70,200,20);

  
          	       //*<Creating the text area where the user will provide the input>
                     tf = new JTextField();
                     tf.setBounds(100,100,500,40);
                    
             

 		      //*creating a button named "Check_Count" that implements an action listener that when clicking ,display the number of words and characters--> 
          
        			b=new JButton("Check Count");  
        			b.setBounds(100,150, 80,30);//x axis,y axis,width,height.

		       //*applying the action listener on the button---->


        	       		bl=new ButtonListener();   
                       		b.addActionListener(bl);
     

		     //*adding components in the frame---->   
	
        		add(lb1);
				add(tf);
				add(b);
			
		  //*setting the size of the frame----->

      				setSize(800,500);  
        			setLayout(null);
       				setVisible(true); //set visibility to true. 
        			setDefaultCloseOperation(EXIT_ON_CLOSE);  
              } 


   //<mplementing the above declared action listener  in the button--->		
	private class ButtonListener implements ActionListener
	{
             public void actionPerformed(ActionEvent e)
	    {  
        	if(e.getSource()==b)
		{  
       			 String text=tf.getText();  
       		 	 String words[]=text.split("\\s");//splits the string based on whitespace    
        	 	 lb1.setText("Total number of Words: "+words.length);  
       		 }
	
 	    } 
}

 
	public static void main(String[] args) 
       {  
    	    new Number_Count();  
        }
}  