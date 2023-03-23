package Main.java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateUI {
	public static String content = "";

	public static void GUI() {
		

		//JFrame to hold them all
		JFrame frame = new JFrame("My Calculator GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		//JMenuBar create the top menu
		JMenuBar jm = new JMenuBar();
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("About");
		jm.add(m1);
		jm.add(m2);
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m12 = new JMenuItem("Save As");
		JMenuItem exit = new JMenuItem("Quit");
		
		//exit action for the quit menu item
		 class exitAction implements ActionListener{
			    public void actionPerformed (ActionEvent e){
			        System.exit(0);
			    }

				
			}
		exit.addActionListener(new exitAction());
		
		m1.add(m11);
		m1.add(m12);
		m1.add(exit);

		//JTextField The top data field no more then 20 characters
		 //   JLabel msglabel = new JLabel("Enter Text");

		JTextField jt = new JTextField(15);
		    JLabel label = new JLabel(content);
		JPanel jp = new JPanel();
		jp.add(label);
		jp.add(jt);
		
		frame.getContentPane().add(BorderLayout.NORTH, jm);
		frame.getContentPane().add(BorderLayout.CENTER, jp);
		
        frame.setVisible(true);
        jt.requestFocusInWindow();
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("The entered text is: " + jt.getText());
               content =  jt.getText();
            }
        });
	    JLabel label1 = new JLabel(content);
//	   ??  jp.add(label1);
	//JMenuBar	
//JPanel
//JTextField
//JButton

       
		
	}
	
}
