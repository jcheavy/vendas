package views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import util.Paleta;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelTop;
	private JPanel panelEsq;
	private JPanel panelData;

	private void resolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimension = t.getScreenSize();
		setSize((dimension.width + 5), (dimension.height - 38));
	}

	public TelaPrincipal() {

		Container telaPri = getContentPane();
		telaPri.setBackground(Paleta.cor_6);
		telaPri.setLayout(new BorderLayout());

		panelTop = new JPanel(new GridBagLayout());
		panelTop.setPreferredSize(new Dimension(30, 100));
		panelTop.setBackground(Paleta.cor_4);
		telaPri.add(panelTop, BorderLayout.NORTH);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		panelData = new JPanel();
		panelData.setPreferredSize(new Dimension(100, 40));
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		panelTop.add(panelData, constraints);

		panelEsq = new JPanel();
		panelEsq.setPreferredSize(new Dimension(250, 100));
		panelEsq.setBackground(Paleta.cor_2);
		telaPri.add(panelEsq, BorderLayout.WEST);

		setResizable(true);
		resolucao();
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}

}
