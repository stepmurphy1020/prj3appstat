package SaltandSmooth;

import javax.swing.SwingUtilities;
import java.util.Scanner;

public class Main {
	static Scanner SCAN = new Scanner(System.in);
	static int lowerbound;
	static int upperbound;

	public static void main(String[] args) {
		System.out.println("Please input an upperbound for the Graph");
		Main.upperbound = SCAN.nextInt();
		System.out.println("Please input an lowerbound for the Graph");
		Main.lowerbound = SCAN.nextInt();

		data h = new data();
		h.addData(lowerbound, upperbound);
		System.out.println("Original Data:" + data.data1);
		Salter S = new Salter();
		S.salter();
		System.out.println("Salted Data:" + data.data2);
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new graph().setVisible(true);
			}
		});

		System.out.println(graph.d);
	}
}
