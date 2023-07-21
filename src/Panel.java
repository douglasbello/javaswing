import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0,0, 250,250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250,0, 250,250);
		
		JLabel label = new JLabel("Hi");
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.LEFT);
		redPanel.add(label);
		frame.add(bluePanel);
		frame.add(redPanel);
	}
}
