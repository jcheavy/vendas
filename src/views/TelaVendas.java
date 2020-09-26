package views;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import util.Paleta;
import util.Utils;

public class TelaVendas extends JPanel {

	private JLabel lbId, lbNome, lbCpfCnpj, lbEmail, lbTipo, lbEndereco;
	private JTextField txNome, txCpfCnpj, txEmail, txEndereco;
	private JComboBox cbTipo;
	private JPanel painelCentro, paineltop;
	// Integer id, String nome, String cpfCnpj, String email, TipoCliente tipo,
	// Endereco endereco
	static int NOVA_LINHA = 0;
	static int NOVA_COLUNA = 1;
	GridBagConstraints gbc = null;	

	public TelaVendas() {

		painelCentro = new JPanel(new MigLayout());
		painelCentro.setPreferredSize(new Dimension(1100, 400));
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Venda"));
		
		add(painelCentro);     	
				    
	    lbNome = label("Nome :");
	    painelCentro.add(lbNome);
	    
	    txNome = new JTextField(20);
		painelCentro.add(txNome, "wrap");
		
		lbCpfCnpj = label("Cpf/Cnpj");
		painelCentro.add(lbCpfCnpj);
		
		txCpfCnpj = txfield(20);
		painelCentro.add(txCpfCnpj);
	}

	private JButton botao(String desc) {
		JButton but = new JButton(desc);
		but.setFont(Utils.gramond_15);
		return but;
	}

	private JLabel label(String desc ) {
	
		JLabel labl = new JLabel(desc);
		labl.setFont(Utils.gramond_14);
		return labl;
	}

	private JTextField txfield(int heigt) {	
		JTextField txtfield = new JTextField();
		txtfield.setFont(Utils.gramond_14);
		txtfield.setPreferredSize(new Dimension(200, heigt));
		return txtfield;
	}


}
