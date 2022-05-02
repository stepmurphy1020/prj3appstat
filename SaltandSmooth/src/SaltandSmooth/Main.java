package SaltandSmooth;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		data h = new data();
		h.addData(-30,30);
		System.out.print(data.data1);
		Salter S = new Salter();
		S.salter();
		System.out.print(data.data2);
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new graph().setVisible(true);
			}
		});
	}
}
