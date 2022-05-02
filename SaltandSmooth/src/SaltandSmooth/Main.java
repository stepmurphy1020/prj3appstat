package SaltandSmooth;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		data h = new data();
		h.addData(0, 8);
		System.out.print(data.data1);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new graph().setVisible(true);
			}
		});
	}
}
