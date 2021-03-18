import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import frameworks.Centrable;

public class Window implements Centrable, KeyListener, ActionListener {
	private JFrame botFrame;
	private JPanel panel;

	public Window() {
		botFrame = new JFrame("Anti AFK bot");
		panel = new JPanel();
	}

	public void mountFrame() {
		botFrame.setSize(600, 600);
		setOnCenter(botFrame);
		mountStartPanel();
		botFrame.setVisible(true);
	}

	public void mountStartPanel() {
		panel.setLayout(new FlowLayout());
		JButton button = new JButton();
		button.setText("Start Bot");
		button.addActionListener(this);
		panel.add(button);
		botFrame.add(panel);
	}

	public void mountEscListenerPanel() {
		panel.removeAll();
		panel.revalidate(); 
		JLabel label = new JLabel("Press ESC for exit");
		panel.add(label);
		panel.addKeyListener(this);
		panel.repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent arg) {
		System.out.println("refresh");
		if (arg.getKeyCode() == KeyEvent.VK_ESCAPE) {
			WindowActivity.terminateMouseThread();
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		mountEscListenerPanel(); // fix here(add new thread)
		WindowActivity.runMouseThread();
	}

	/*
	 * 1. fix exit 2. refactor 3. wrap
	 */

}
