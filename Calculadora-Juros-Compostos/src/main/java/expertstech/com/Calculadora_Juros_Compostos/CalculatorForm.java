package expertstech.com.Calculadora_Juros_Compostos;

import javax.swing.JFrame;

public abstract class CalculatorForm extends JFrame {

	public CalculatorForm() {

		this.inicializar();
	}

	private void inicializar() {

		this.setTitle("Calculadora Juros Compostos");
		this.setSize(640, 480);
	}

}
