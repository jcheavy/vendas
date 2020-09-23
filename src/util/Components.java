package util;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Components {
	
	public static int NOVA_LINHA = 0;
	public static int NOVA_COLUNA = 1;
	GridBagConstraints gbc1 = null;
	
	public JButton botao(String desc, int posi, int qtdCol) {
		configurar(posi, qtdCol);
		JButton but = new JButton(desc);
		but.setFont(Utils.gramond_15);
		return but;
	}

	public JLabel label(String desc, int posi, int qtdCol) {
		configurar(posi, qtdCol);
		JLabel labl = new JLabel(desc);
		// labl.setFont(Utils.gramond_14);
		return labl;
	}

	public JTextField txfield(int col, int tam, int posi, int qtdCol) {

		configurar(posi, qtdCol);
		JTextField txtfield = new JTextField(col);
		txtfield.setPreferredSize(new Dimension(100, tam));
		return txtfield;

	}

	private void configurar(int posicao, int qtdColunas) {

		if (posicao == NOVA_LINHA) {
			gbc1.gridy = gbc1.gridy + 1;
			gbc1.gridx = 0;
		} else {
			gbc1.gridx = gbc1.gridx + 1;
		}
		gbc1.gridwidth = qtdColunas;
	}
	
	
}
