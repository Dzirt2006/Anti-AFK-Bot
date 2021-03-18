import java.awt.AWTException;

import javax.swing.JFrame;

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
//	private static Thread windowThread = new Thread(new Runnable() {
//		public void run(JFrame frame) {
//			
//		}
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//	});

}
