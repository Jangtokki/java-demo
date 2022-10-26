package java_019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Win_2 extends Frame{

	public Win_2() {
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WinExit());
	}
	
	class WinExit extends WindowAdapter{
		private void Windowclosing() {
			// TODO Auto-generated method stub

		}
	}
}
