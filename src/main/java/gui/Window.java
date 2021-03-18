package gui;

import javax.swing.JFrame;

import frameworks.Centrable;

public class Window implements Centrable {
	private JFrame botFrame;
	private BotPanel panel;

	public Window() {
		botFrame = new JFrame("Anti AFK bot");
		panel = new BotPanel();
	}

	private void mountFrame() {
		botFrame.setSize(600, 600);
		setOnCenter(botFrame);
		botFrame.add(panel);
		botFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botFrame.setVisible(true);
	}

	public void startGUI() {
		mountFrame();
		panel.mountStartPanel();
	}

}
