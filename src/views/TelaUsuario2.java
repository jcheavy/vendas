package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Robot;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Comp;
import util.Utils;

public class TelaUsuario2 extends JPanel {

	private JLabel lbId, lbNome, lbCpfCnpj, lbEmail, lbTipo, lbEndereco;
	private JTextField txNome, txCpfCnpj, txEmail, txEndereco;
	private JComboBox cbTipo;
	private JPanel painelCentro, paineltop;
	// Integer id, String nome, String cpfCnpj, String email, TipoCliente tipo,
	// Endereco endereco
	static int NOVA_LINHA = 0;
	static int NOVA_COLUNA = 1;
	GridBagConstraints gbc = null;	

	public TelaUsuario2() {

		setLayout(new BorderLayout());

		painelCentro = new JPanel(new BorderLayout());
		painelCentro.setPreferredSize(new Dimension(1100, 400));
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Usu�rio"));
		add(painelCentro, BorderLayout.WEST);
        
		paineltop = new JPanel(new GridBagLayout());
		paineltop.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Dados do cliente"));
		painelCentro.add(paineltop, BorderLayout.NORTH);
		
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,10,2,2);
		gbc.anchor = GridBagConstraints.NORTHWEST;
				    
		
		 
		lbNome = new JLabel("Nome :");
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 0;	 
		paineltop.add(lbNome, gbc);
		
		  
		txNome = new JTextField(40);
		gbc.gridx = 1;
		paineltop.add(txNome, gbc);
		
		lbTipo = new JLabel(" Tipo : ");
		gbc.gridx = 2;
		paineltop.add(lbTipo);
		
		cbTipo = new JComboBox();
		cbTipo.setPreferredSize(new Dimension(90,20));
		gbc.gridx = 3;
		paineltop.add(cbTipo);
		
		lbEmail = new JLabel("Email :");
		gbc.gridx = 0;
		gbc.gridy = 1;
		paineltop.add(lbEmail,gbc);
	 
		txEmail = new JTextField(40);
		gbc.gridx = 1;
		gbc.gridy = 1;
		paineltop.add(txEmail, gbc);
		
		lbCpfCnpj = Comp.label("CNPJ :");
		gbc.gridx = 0;
		gbc.gridy = 3;
		paineltop.add(lbCpfCnpj, gbc);

	}

	private JButton botao(String desc, int posi, int qtdCol) {
		configurar(posi, qtdCol);
		JButton but = new JButton(desc);
		but.setFont(Utils.gramond_15);
		return but;
	}

	private JLabel label(String desc, int posi, int qtdCol) {
		configurar(posi, qtdCol);
		JLabel labl = new JLabel(desc);
		//labl.setFont(Utils.gramond_14);
		return labl;
	}

	private JTextField txfield(int col, int tam, int posi, int qtdCol) {

		configurar(posi, qtdCol);
		JTextField txtfield = new JTextField(col);
		txtfield.setPreferredSize(new Dimension(100, tam));
		return txtfield;

	}

	private void configurar(int posicao, int qtdColunas) {

		if (posicao == NOVA_LINHA) {
			gbc.gridy = gbc.gridy + 1;
			gbc.gridx = 0;
		} else {
			gbc.gridx = gbc.gridx + 1;
		}
		gbc.gridwidth = qtdColunas;
	}

}
