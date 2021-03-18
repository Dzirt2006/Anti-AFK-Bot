import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

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

	/*
	 * 1. fix exit 2. refactor 3. wrap
	 */

}
