package expertstech.com.Calculadora_Juros_Compostos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class CalculatorForm extends JFrame {

	private static final long serialVersionUID = 1L;
	
	protected JPanel pnlForm;
	protected JPanel pnlRodape;
	
	protected JButton btnCalcular;
	protected JButton btnLimpar;
	protected JButton btnFechar;	

	protected JLabel lblCapital;
	protected JTextField txtCapital;

	protected JLabel lblTaxaJuros;
	protected JTextField txtTaxaJuros;

	protected JLabel lblPeriodo;
	protected JTextField txtPeriodo;

	protected JLabel lblMontante;
	protected JTextField txtMontante;

	public CalculatorForm() {

		this.inicializar();
	}

	private void inicializar() {

		this.setTitle("Calculadora Juros Compostos");
		this.setSize(640, 480);
	}

}
