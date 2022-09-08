package expertstech.com.Calculadora_Juros_Compostos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
		this.getContentPane().setLayout(new BorderLayout());
		
		this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
	}

	public JPanel getPnlForm() {

		if (pnlForm == null) {

			pnlForm = new JPanel();
		}
		
		return pnlForm;
	}

	public JPanel getPnlRodape() {

		if (pnlRodape == null) {

			pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

			btnCalcular = new JButton("Calcular");
			btnLimpar = new JButton("Limpar");
			btnFechar = new JButton("Fechar");

			pnlRodape.add(btnCalcular);
			pnlRodape.add(btnLimpar);
			pnlRodape.add(btnFechar);
		}

		return pnlRodape;
	}

}
