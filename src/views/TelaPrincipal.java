package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import util.Paleta;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelTop;
	private JPanel panelEsq;
	private JPanel panelData, panelPesquisa;
	private JButton btpesquisar;
	private JTextField txpesquisar;

	private void resolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimension = t.getScreenSize();
		setSize((dimension.width + 5), (dimension.height - 38));
	}

	public TelaPrincipal() {

		Container telaPri = getContentPane();
		telaPri.setBackground(Paleta.cor_6);
		telaPri.setLayout(new BorderLayout());

		panelTop = new JPanel(new BorderLayout());
		panelTop.setPreferredSize(new Dimension(30, 40));
		panelTop.setBackground(Paleta.cor_4);
		telaPri.add(panelTop, BorderLayout.NORTH);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(3, 1, 3, 1);

		panelData = new JPanel();
		panelData.setBackground(Paleta.cor_4);
		panelData.setPreferredSize(new Dimension(250, 100));		
		panelTop.add(panelData, BorderLayout.WEST);
		

		panelPesquisa = new JPanel(new GridBagLayout());
		panelPesquisa.setBackground(Paleta.cor_4);
		constraints.gridx = 1;
		constraints.gridy = 0;
		panelTop.add(panelPesquisa, BorderLayout.CENTER);
	
		
		
		btpesquisar = new JButton("Pesquisar");
		txpesquisar = new JTextField(10);

	
		constraints.gridx = 0;
		constraints.gridy = 0;
		panelPesquisa.add(btpesquisar, constraints);

		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 1;
		constraints.gridy = 0;
		panelPesquisa.add(txpesquisar, constraints);

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
