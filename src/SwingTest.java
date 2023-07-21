import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class SwingTest {
	public static void main(String[] args) {
		Border border = BorderFactory.createLineBorder(Color.BLUE,1);
		
		JLabel label = new JLabel();
		label.setText("Bro");
		label.setForeground(Color.white);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setFont(new Font("Arial",Font.PLAIN,20));
		label.setBorder(border);
		label.setBounds(50, 50, 250, 250);
		
		MyFrame myFrame = new MyFrame();
		myFrame.getContentPane().add(label);
		myFrame.setLayout(null);
	}

}
