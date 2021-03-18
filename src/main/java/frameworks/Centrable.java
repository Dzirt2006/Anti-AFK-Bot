package frameworks;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public interface Centrable {

	static int[] getCenter() {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) dimension.getWidth();
		int y = (int) dimension.getHeight();
		return new int[] { x, y };
	}

	default void setOnCenter(JFrame frame) {
		int[] dim = getCenter();
		int x = (dim[0] - frame.getWidth()) / 2;
		int y = (dim[1] - frame.getHeight()) / 2;
		frame.setLocation(x, y);
	}
}
