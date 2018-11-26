import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null);
		int a = 0;
		a = s.length();
		char c;

		for (int i = 1; i <= a; i++) {
			c = s.charAt(a - i);
			System.out.print(c);
		}

	}
}