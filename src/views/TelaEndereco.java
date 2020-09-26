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
import net.miginfocom.swing.MigLayout;
import util.Comp;
import util.Paleta;
import util.Utils;

public class TelaEndereco extends JPanel {

	private JLabel lbRua, lbBairro, lbCep, lbCidade, lbEstado;
	private JTextField  txRua, txBairro, txCep, txCidade, txEstado;

	private JPanel painelCentro;	

	public TelaEndereco() {
        
	
  
		painelCentro = new JPanel(new MigLayout());
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Endereço"));
		painelCentro.setPreferredSize(new Dimension(1100, 110));
		
		add(painelCentro);
		
		lbRua = Comp.label("Rua :");
		painelCentro.add(lbRua);
		
		txRua = Comp.txfield(85);
		painelCentro.add(txRua, "span, wrap");
		
		lbBairro = Comp.label("Bairro :");
		painelCentro.add(lbBairro);
		
		txBairro = Comp.txfield(85);
		painelCentro.add(txBairro);
		
		lbCep = Comp.label("CEP.:");
		painelCentro.add(lbCep);
		
		txCep = Comp.mascaras("#####-###");
		painelCentro.add(txCep, "wrap");
		
		lbCidade = Comp.label("Cidade :");
		painelCentro.add(lbCidade);
		
		txCidade = Comp.txfield(85);
		painelCentro.add(txCidade);
		
					
		
		lbEstado = Comp.label("Estado :");
		painelCentro.add(lbEstado);
		
		txEstado = Comp.txfield(65);
		painelCentro.add(txEstado, "wrap");
				
	
	}

}
