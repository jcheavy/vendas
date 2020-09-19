package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entities.Cliente;

public class TelaCliente extends JPanel {
	
	private JLabel lbId, lbNome, lbCpfCnpj, lbEmail, lbTipo, lbEndereco;
	private JTextField txNome, txCpfCnpj, txEmail, txEndereco;	
	private JComboBox cbTipo;
	private JPanel painelCentro;
	//Integer id, String nome, String cpfCnpj, String email, TipoCliente tipo, Endereco endereco
	
	public TelaCliente() {
		
	
	 setLayout(new BorderLayout());
	 
	
	 lbId = new JLabel("ID :");
	 

	 
	 painelCentro = new JPanel(new GridBagLayout());
	 GridBagConstraints gbc = new GridBagConstraints();
	 gbc.insets = new Insets(2,10,2,2);

	 
	 painelCentro.setBackground(Color.green);
	 painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cliente "));
	 add(painelCentro, BorderLayout.BEFORE_FIRST_LINE);
	 setPreferredSize(new Dimension(400, 400));
	 
	 lbNome = new JLabel("Nome");
	 gbc.fill = GridBagConstraints.HORIZONTAL;
	 gbc.gridx = 0;
	 gbc.gridy = 0;
	 painelCentro.add(lbNome, gbc);
	 
	 
	 txNome = new JTextField(20);
	 gbc.gridx = 1;
	 gbc.gridy = 0;
	 painelCentro.add(txNome, gbc);
	 
	 lbCpfCnpj = new JLabel("Cpf/Cnpj:");
	 gbc.gridx = 0;
	 gbc.gridy = 1;
	 painelCentro.add(lbCpfCnpj, gbc);
	 
	 txCpfCnpj = new JTextField(20);
	 gbc.gridx = 1;
	 gbc.gridy = 1;
	 painelCentro.add(txCpfCnpj, gbc); 	 
	 
	 lbEmail = new JLabel("Email :");
	 gbc.gridx = 0;
	 gbc.gridy = 2;
	 painelCentro.add(lbEmail, gbc);
	 
	 txEmail = new JTextField(20);
	 gbc.gridx = 1;
	 gbc.gridy = 2;
	 painelCentro.add(txEmail, gbc);
	 	 
	 lbTipo = new JLabel("Tipo :");
	 gbc.gridx = 0;
	 gbc.gridy = 3;
	 painelCentro.add(lbTipo, gbc);
	 
	 cbTipo = new JComboBox<Cliente>();
	 gbc.gridx = 1;
	 gbc.gridy = 3;
	 painelCentro.add(cbTipo, gbc);
	 
	 lbEndereco =  new JLabel("Endereço :");
	 
	}

}
