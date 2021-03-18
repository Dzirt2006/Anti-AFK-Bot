package frameworks;

import java.awt.AWTException;
import java.awt.Robot;

public class Controls implements Centrable {
	public static void moveMouse() throws AWTException {
		Robot robot = new Robot();
		while (true) {
			robot.mouseMove((int) (Math.random() * Centrable.getCenter()[0]),
					(int) (Math.random() * Centrable.getCenter()[1]));
			sleep();
		}
	}

	public static void sleep() {
		try {

			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
