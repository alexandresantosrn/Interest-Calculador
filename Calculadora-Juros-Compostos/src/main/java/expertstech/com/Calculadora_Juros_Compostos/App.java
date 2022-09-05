package expertstech.com.Calculadora_Juros_Compostos;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {

			Calculator calc = new Calculator();
			calc.setVisible(true);
		});
	}
}
