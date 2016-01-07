

//---------------------------------------------------------------
//Grades.java
//---------------------------------------------------------------

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Grades extends JFrame 
{
	private Random rand = new Random((new Date()).getTime());
	public Grades()
	{
	setTitle( "                                      Get An 'A' In Java!" );
	
	// --------------- Get The Container Handle -----------------
	Container pane = getContentPane();
	pane.setLayout( null );
	
	//  -------------- Create The Components --------------------
	final JButton raise = new JButton( "Push For An 'A'" );
	
	//  -------------- Populate The Container --------------------
	pane.add(raise);
	raise.setBounds(230, 230, 120, 30);  // initial location & size
	
	//  -------------- Create Event Listeners --------------------
	/*		raise.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	raise.setText("Got ME!");
	}
	});
	*/
	
	class ButtonListener implements ActionListener
	{
	public void actionPerformed(ActionEvent e)
	{
	raise.setText("Got ME!");
	}
	}
	
	ButtonListener bl = new ButtonListener( ) ;
	
	raise.addActionListener( bl );
	
	
	raise.addMouseListener(new MouseListener()
	{
	public void mousePressed (MouseEvent e) {}  // Don't need these
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked (MouseEvent e) {}
	public void mouseExited  (MouseEvent e) {}
	
	public void mouseEntered (MouseEvent e) 	// Only event we're looking for
	{
	int x = rand.nextInt(380);				// x < 380
	int y = rand.nextInt(440);				// y < 440
	raise.setLocation(x, y);				// move to position
	raise.repaint();						// make it visible again
	}
	});
	
	addWindowListener( new WindowAdapter()
	{
	public void windowClosed(WindowEvent e)
	{
	System.exit(0);
	}
	});
	
	//  -------------- Display The Container ------------------
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setSize( 500, 500 );	show();
	}
	
	public static void main(String[] args)
	{
		new Grades();
	}
}
