package _00_Intro_To_ArrayLists;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	JButton addButton;
	JButton viewButton;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton addButton = new JButton("Add Name");
		JButton viewButton = new JButton("View Names");
		
		
		
		addButton.addActionListener(null);
		viewButton.addActionListener(null);
		
		frame.setSize(300,100);
		
		
		frame.add(panel);
		panel.add(addButton);
		panel.add(viewButton);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
	
	}
	public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton)e.getSource();
	String names = null;
		if(addButton.equals(buttonPressed)){
	 names = JOptionPane.showInputDialog("add a name");	
	}
	
	ArrayList<String> namesList = new ArrayList<String>();
		namesList.add(names);
	
	if(viewButton.equals(buttonPressed)){
	 for (int i=0; i<namesList.size(); i++){
	 System.out.println("Guest #" + "i: " + namesList.get(i));
	}
	}
	
	
}
}
