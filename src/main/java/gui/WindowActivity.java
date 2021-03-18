package gui;

import java.awt.AWTException;

import frameworks.Controls;

public class WindowActivity {
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

	public static void runMouseThread() {
		mouseThread.start();
	}

	public static void terminateMouseThread() {
		mouseThread.interrupt();
	}

}
