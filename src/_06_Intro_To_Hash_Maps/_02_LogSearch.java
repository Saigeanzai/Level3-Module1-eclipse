package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JButton entry = new JButton("Add Entry");
	JButton search = new JButton("Search by ID");
	JButton list = new JButton("View List");
	JButton remove = new JButton("Remove Entry");

	public static void main(String[] args) {
		/*
		 * Crate a HashMap of Integers for the keys and Strings for the values.
		 *
		 * Create a GUI with three buttons.
		 */
		_02_LogSearch logSearch = new _02_LogSearch();
		logSearch.setup();
	}

	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(200, 150);

		frame.add(panel);
		panel.add(entry);
		panel.add(search);
		panel.add(list);
		panel.add(remove);

		entry.addActionListener(this);
		search.addActionListener(this);
		list.addActionListener(this);
		remove.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * Button 1: Add Entry When this button is clicked, use an input dialog to ask
		 * the user to enter an ID number. After an ID is entered, use another input
		 * dialog to ask the user to enter a name. Add this information as a new entry
		 * to your HashMap.
		 * 
		 * Button 2: Search by ID When this button is clicked, use an input dialog to
		 * ask the user to enter an ID number. If that ID exists, display that name to
		 * the user. Otherwise, tell the user that that entry does not exist.
		 * 
		 * Button 3: View List When this button is clicked, display the entire list in a
		 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
		 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
		 * 
		 * When this is complete, add a fourth button to your window. Button 4: Remove
		 * Entry When this button is clicked, prompt the user to enter an ID using an
		 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
		 * the user that the ID is not in the list.
		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (entry.equals(buttonPressed)) {
			String n = JOptionPane.showInputDialog("Enter an ID number");
			int num = Integer.parseInt(n);
			String name = JOptionPane.showInputDialog("Enter a name");
			log.put(num, name);
		}

		if (search.equals(buttonPressed)) {
			String n = JOptionPane.showInputDialog("Enter an ID number");
			int num = Integer.parseInt(n);
			for (int id : log.keySet()) {
				if (id == num) {
					JOptionPane.showMessageDialog(null, log.get(id));
				} else {
					JOptionPane.showMessageDialog(null, "That entry does not exist");
				}
			}

		}
		if (list.equals(buttonPressed)) {
			for (int id : log.keySet()) {
				String name = log.get(id);
				JOptionPane.showMessageDialog(null, "ID: " + id + " Name: " + name);
			}

		}
		if (remove.equals(buttonPressed)) {
			String n = JOptionPane.showInputDialog("Enter an ID number");
			int num = Integer.parseInt(n);
			for (int id : log.keySet()) {
				if (id == num) {
					log.remove(num);
				} else {
					JOptionPane.showMessageDialog(null, "That entry does not exist");
				}
			}

		}
	}

}
