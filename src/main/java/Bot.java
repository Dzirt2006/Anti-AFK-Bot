import java.awt.AWTException;

import frameworks.Centrable;
import frameworks.Controls;

public class Bot implements Centrable {

	private static Thread mouseThread = new Thread(new Runnable() {
		@Override
		public void run() {
			try {
				Controls.moveMouse();
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	});

	private static Thread windowThread = new Thread(new Runnable() {
		@Override
		public void run() {

		}
	});

	public static void startRobot() {
//		mouseThread.start();
//		windowThread.start();
		Window frame = new Window();
		frame.startGUI();
	}

}
