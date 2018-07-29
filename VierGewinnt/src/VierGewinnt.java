import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class VierGewinnt extends JFrame implements ActionListener {
	private JButton[] einwurf = new JButton[7];
	private JButton[][] myJButtonArray = new JButton[6][7];

	private int[][] belegtArray = new int[6][7];

	private int[] belegt = { 5, 5, 5, 5, 5, 5, 5 };
	private boolean cnt = true;

	public VierGewinnt(String title) throws HeadlessException {
		super(title);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				belegtArray[i][j] = 0;
			}
		}
		buildWindow();
	}

	private void buildWindow() {
		setLayout(null);
JMenuBar menuBar = new JMenuBar();
		
		//Hinzufügen von Menüs
		JMenu menuFile = 
			new JMenu("Menü");
		JMenu menuEdit = 
			new JMenu("Credits");
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		JMenu menuFileNew = 
				new JMenu("Neustarten");
		JMenu menuFileNew2 = 
				new JMenu("Multiplayer");
			menuFile.add(menuFileNew);
			menuFile.add(menuFileNew2);
			setJMenuBar(menuBar);
			
			
		int einwurfX = 0;
		for (int i = 0; i < 7; i++) {
			einwurf[i] = new JButton();
			einwurf[i].setBounds(einwurfX, 0, 50, 50);
			add(einwurf[i]);
			einwurf[i].addActionListener(this);
			einwurfX = einwurfX + 50;
		}
		int x = 0;
		int y = 55;
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
				myJButtonArray[i][k] = new JButton(new ImageIcon("Feld.png"));
				myJButtonArray[i][k].setBounds(x, y, 50, 50);
				add(myJButtonArray[i][k]);
				myJButtonArray[i][k].setEnabled(false);
				// myJButtonArray[i][k].addActionListener(this);
				x = x + 50;

			}
			x = 0;
			y = y + 50;
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == einwurf[0]) {
			if (cnt) {
				myJButtonArray[belegt[0]][0].setBackground(Color.BLUE);
				cnt = !cnt;
				belegtArray[belegt[0]][0] = 1;
			} else {
				myJButtonArray[belegt[0]][0].setBackground(Color.RED);
				belegtArray[belegt[0]][0] = 2;
				cnt = !cnt;
			}

			if (checkGewinner(belegt[0], 0)) {
				werHatGewonnen(belegt[0], 0);
			}
			belegt[0] = belegt[0] - 1;

			if (belegt[0] < 0) {
				einwurf[0].setEnabled(false);
			}
		}
		if (src == einwurf[1]) {
			if (cnt) {
				myJButtonArray[belegt[1]][1].setBackground(Color.BLUE);
				belegtArray[belegt[1]][1] = 1;
				cnt = !cnt;
			} else {
				myJButtonArray[belegt[1]][1].setBackground(Color.RED);
				belegtArray[belegt[1]][1] = 2;
				cnt = !cnt;
			}
			if (checkGewinner(belegt[1], 1)) {
				werHatGewonnen(belegt[1], 1);
			}
			belegt[1] = belegt[1] - 1;
			if (belegt[1] < 0) {
				einwurf[1].setEnabled(false);
			}
		}
		if (src == einwurf[2]) {
			if (cnt) {
				myJButtonArray[belegt[2]][2].setBackground(Color.BLUE);
				belegtArray[belegt[2]][2] = 1;
				cnt = !cnt;
			} else {
				myJButtonArray[belegt[2]][2].setBackground(Color.RED);
				belegtArray[belegt[2]][2] = 2;
				cnt = !cnt;
			}
			if (checkGewinner(belegt[2], 2)) {
				werHatGewonnen(belegt[2], 2);
			}
			belegt[2] = belegt[2] - 1;
			if (belegt[2] < 0) {
				einwurf[2].setEnabled(false);
			}
		}
		if (src == einwurf[3]) {
			if (cnt) {
				myJButtonArray[belegt[3]][3].setBackground(Color.BLUE);
				belegtArray[belegt[3]][3] = 1;
				cnt = !cnt;
			} else {
				myJButtonArray[belegt[3]][3].setBackground(Color.RED);
				belegtArray[belegt[3]][3] = 2;
				cnt = !cnt;
			}
			if (checkGewinner(belegt[3], 3)) {
				werHatGewonnen(belegt[3], 3);
			}
			belegt[3] = belegt[3] - 1;
			if (belegt[3] < 0) {
				einwurf[3].setEnabled(false);
			}
		}
		if (src == einwurf[4]) {
			if (cnt) {
				myJButtonArray[belegt[4]][4].setBackground(Color.BLUE);
				belegtArray[belegt[4]][4] = 1;
				cnt = !cnt;
			} else {
				myJButtonArray[belegt[4]][4].setBackground(Color.RED);
				belegtArray[belegt[4]][4] = 2;
				cnt = !cnt;
			}
			if (checkGewinner(belegt[4], 4)) {
				werHatGewonnen(belegt[4], 4);
			}
			belegt[4] = belegt[4] - 1;
			if (belegt[4] < 0) {
				einwurf[4].setEnabled(false);
			}
		}
		if (src == einwurf[5]) {
			if (cnt) {
				myJButtonArray[belegt[5]][5].setBackground(Color.BLUE);
				belegtArray[belegt[5]][5] = 1;
				cnt = !cnt;
			} else {
				myJButtonArray[belegt[5]][5].setBackground(Color.RED);
				belegtArray[belegt[5]][5] = 2;
				cnt = !cnt;
			}
			if (checkGewinner(belegt[5], 5)) {
				werHatGewonnen(belegt[5], 5);
			}
			belegt[5] = belegt[5] - 1;
			if (belegt[5] < 0) {
				einwurf[5].setEnabled(false);
			}
		}
		if (src == einwurf[6]) {
			if (cnt) {
				myJButtonArray[belegt[6]][6].setBackground(Color.BLUE);
				belegtArray[belegt[6]][6] = 1;
				cnt = !cnt;
			} else {
				myJButtonArray[belegt[6]][6].setBackground(Color.RED);
				belegtArray[belegt[6]][6] = 2;
				cnt = !cnt;
			}
			if (checkGewinner(belegt[6], 6)) {
				werHatGewonnen(belegt[6], 6);
			}
			belegt[6] = belegt[6] - 1;
			if (belegt[6] < 0) {
				einwurf[6].setEnabled(false);
			}
		}
	}

	private void werHatGewonnen(int y, int x) {
		if (belegtArray[y][x]==1) {
			JOptionPane.showMessageDialog(null, "Blau hat gewonnen");
		}else {
			JOptionPane.showMessageDialog(null, "Rot hat gewonnen");
		}
		
	}

	public boolean checkGewinner(int y, int x) {
		int tmpY = y;
		int tmpX = x;
		int cnt = 0;
		// check nach unten
		if (y + 3 > 5) {

		} else {

			if (belegtArray[y][x] == belegtArray[y + 1][x] && belegtArray[y][x] == belegtArray[y + 2][x]
					&& belegtArray[y][x] == belegtArray[y + 3][x]) {
				System.out.println("Gewonnen nach Unten");
				return true;
			}
		}
		// nach links
		if ((tmpX - 1) >= 0) {

			while (belegtArray[y][x] == belegtArray[y][tmpX - 1]) {
				cnt++;
				if (cnt == 3) {
					System.out.println("Gewonnen nach Links");
					return true;
				}
				tmpX--;
				if ((tmpX - 1) < 0) {
					break;
				}

			}
			tmpY = y;
			tmpX = x;
		}
		// nach rechts
		if ((tmpX + 1) <= 6) {

			while (belegtArray[y][x] == belegtArray[y][tmpX + 1]) {
				cnt++;
				if (cnt == 3) {
					System.out.println("Gewonnen nach Rechts");
					return true;
				}
				tmpX++;
				if ((tmpX + 1) > 6) {
					break;
				}

			}

		}
		tmpY = y;
		tmpX = x;
		cnt = 0;
		// Diagonale links runter
		if ((tmpX - 1) >= 0 && (tmpY + 1) <= 5) {
			while (belegtArray[y][x] == belegtArray[tmpY + 1][tmpX - 1]) {
				cnt++;
				if (cnt == 3) {
					System.out.println("Gewonnen");
					return true;
				}
				tmpX--;
				tmpY++;
				if ((tmpX - 1) < 0 || (tmpY + 1) > 5) {
					break;
				}

			}
		}
		tmpY = y;
		tmpX = x;

		// Diagonale rechts hoch
		if ((tmpX + 1) <= 6 && (tmpY - 1) >= 0) {
			while (belegtArray[y][x] == belegtArray[tmpY - 1][tmpX + 1]) {
				cnt++;
				if (cnt == 3) {
					System.out.println("Gewonnen");
					return true;
				}
				tmpX++;
				tmpY--;
				if ((tmpX + 1) > 6 || (tmpY - 1) < 0) {
					break;
				}

			}
		}

		// -----------------------------------------------------------------

		tmpY = y;
		tmpX = x;
		cnt = 0;
		// Diagonale links hoch
		if ((tmpX - 1) >= 0 && (tmpY - 1) >= 0) {
			while (belegtArray[y][x] == belegtArray[tmpY - 1][tmpX - 1]) {
				cnt++;
				if (cnt == 3) {
					System.out.println("Gewonnen");
					return true;
				}
				tmpX--;
				tmpY--;
				if ((tmpX - 1) < 0 || (tmpY - 1) < 0) {
					break;
				}

			}
		}
		tmpY = y;
		tmpX = x;

		// Diagonale rechts runter
		if ((tmpX + 1) <= 6 && (tmpY + 1) <= 5) {
			while (belegtArray[y][x] == belegtArray[tmpY + 1][tmpX + 1]) {
				cnt++;
				if (cnt == 3) {
					System.out.println("Gewonnen");
					return true;
				}
				tmpX++;
				tmpY++;
				if ((tmpX + 1) > 6 || (tmpY + 1) > 5) {
					break;
				}

			}
		}
		return false;
	}

	public static void main(String[] args) {
		VierGewinnt win = new VierGewinnt("4 Gewinnt");
		win.setBounds(400, 100, 600, 430);
		win.setVisible(true);
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
