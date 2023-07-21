import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class FrameButton extends JFrame implements ActionListener {
	private JButton button;
	
	FrameButton() {
		button = new JButton("Click!");
		button.setBounds(200,100,100,50);
		button.addActionListener(this);
		button.setFocusable(false);
		button.setBackground(Color.WHITE);
		
		Border border = BorderFactory.createLineBorder(Color.blue, 4);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBorder(border);
        this.setTitle("Title");
        this.setSize(500,500);
//        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("poo");
		}
	}
}
