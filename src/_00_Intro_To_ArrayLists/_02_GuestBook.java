package _00_Intro_To_ArrayLists;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton("Add Name");
	JButton viewButton = new JButton("View Names");
	ArrayList<String> namesList = new ArrayList<String>();
	public static void main(String[] args) {

		_02_GuestBook guestBook = new _02_GuestBook();
		guestBook.setup();

	}

	void setup() {
		addButton.addActionListener(this);
		viewButton.addActionListener(this);

		frame.setSize(300, 100);

		frame.add(panel);
		panel.add(addButton);
		panel.add(viewButton);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		//String names = null;
		if (addButton.equals(buttonPressed)) {
			String name = JOptionPane.showInputDialog("add a name");
			namesList.add(name);
		}

		

		if (viewButton.equals(buttonPressed)) {
			String msg = "";
			for (int i = 0; i < namesList.size(); i++) {
				//System.out.println();
				msg += "Guest #" + (i+1) + ": " + namesList.get(i) + "\n"; 
			}
			JOptionPane.showMessageDialog(null, msg);
		}

	}
}
