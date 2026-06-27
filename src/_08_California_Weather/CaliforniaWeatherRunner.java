package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

/*
 * See instructions in the CaliforniaWeather.java class
 */
public class CaliforniaWeatherRunner implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton search = new JButton("Search");
	JButton weather = new JButton("Weather Condition");
	JButton range = new JButton("Temperature Range");
	HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();

	public static void main(String[] args) {
		// new CaliforniaWeather().start();
		CaliforniaWeatherRunner weatherRunner = new CaliforniaWeatherRunner();
		weatherRunner.setup();
	}

	void setup() {

		frame.setSize(300, 250);

		frame.add(panel);
		panel.add(search);
		panel.add(weather);
		panel.add(range);

		search.addActionListener(this);
		weather.addActionListener(this);
		range.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (search.equals(buttonPressed)) {
			String input = JOptionPane.showInputDialog("Search for the the weather conditions of a city in California");
			String weatherSummary = weatherData.get(input).weatherSummary;
			double temperature = weatherData.get(input).temperatureF;
			JOptionPane.showMessageDialog(null,
					input + " is " + weatherSummary + " with a temperature of " + temperature + " F");
		}

		if (weather.equals(buttonPressed)) {
			String input = JOptionPane.showInputDialog("Enter a specified weather condition");
			ArrayList<String> key = new ArrayList<>();
			for (String i : weatherData.keySet()) {
				if (weatherData.get(i).weatherSummary.contains(input)) {
					key.add(i);
				}
			}
			String cities = "";
			for (int i = 0; i < key.size(); i++) {
				cities += key.get(i);
				if (i < key.size() - 1) {
					cities += ", ";
				}
				if (i % 5 == 0 && i > 0) {
					cities += "\n";
				}
			}
			JOptionPane.showMessageDialog(null, "The following cities are " + input + ": \n" + cities);
		}
		if (range.equals(buttonPressed)) {
			String minimum = JOptionPane.showInputDialog("Enter a minimum temperature");
			int minimum2 = Integer.parseInt(minimum);
			String maximum = JOptionPane.showInputDialog("enter a maximum temperatuer");
			int maximum2 = Integer.parseInt(maximum);
			ArrayList<String> key = new ArrayList<>();
			for (String i : weatherData.keySet()) {
				if (weatherData.get(i).temperatureF >= minimum2 && weatherData.get(i).temperatureF <= maximum2) {
					key.add(i);
				}
			}
			String cities = "";
			for (int i = 0; i < key.size(); i++) {
				cities += key.get(i);
				if (i < key.size() - 1) {
					cities += ", ";
				}
				if (i % 5 == 0 && i > 0) {
					cities += "\n";
				}
			}
			JOptionPane.showMessageDialog(null, "The following cities with the temperatures between " + minimum2
					+ " and " + maximum2 + " are: " + cities);

		}
	}
}
