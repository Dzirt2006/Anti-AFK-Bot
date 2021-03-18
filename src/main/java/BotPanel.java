import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BotPanel extends JPanel implements KeyListener, ActionListener {

	public BotPanel() {
		// TODO Auto-generated constructor stub
	}

	public void mountStartPanel() {
		this.setLayout(new FlowLayout());
		JButton button = new JButton();
		button.setText("Start Bot");
		button.addActionListener(this);
		this.add(button);
	}

	public void mountEscListenerPanel() {
		this.removeAll();
		this.revalidate();
		JLabel label = new JLabel("Press ESC for exit");
		this.add(label);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		mountEscListenerPanel(); // fix here(add new thread)
		WindowActivity.runMouseThread();
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

}
