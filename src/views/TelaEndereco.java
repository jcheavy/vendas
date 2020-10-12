package views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Comp;
import util.Paleta;

public class TelaEndereco extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel lbRua; 
	private JLabel lbBairro;
	private JLabel lbCep;
	private JLabel lbCidade;
	private JLabel lbEstado;
	private JLabel lbNumero;
	
	private JTextField  txRua; 
	private JTextField txBairro;
	private JTextField txCep;
	private JTextField txCidade;
	private JTextField txEstado;
	private JTextField txNumero;
   
	private JButton btLimpar;
	private JButton btDelete;
	private JButton btPesquisar;
	
	private JPanel painelCentro;	

	public TelaEndereco() {        	
     
		setLayout(new BorderLayout());
		
		painelCentro = new JPanel();
		painelCentro.setLayout(null);
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Endereço"));
		painelCentro.setPreferredSize(new Dimension(1100, 110));
		
		add(painelCentro, BorderLayout.CENTER);
		
		lbRua = Comp.label("Rua :");
		lbRua.setBounds(10,20,60,20);
		painelCentro.add(lbRua);
		
		txRua = Comp.txfield(85);
		txRua.setBounds(70,20,700,20);
		painelCentro.add(txRua);
		
		lbNumero = Comp.label("Nº :");
		lbNumero.setBounds(780,20,60,20);
		painelCentro.add(lbNumero);
		
		lbBairro = Comp.label("Bairro :");
		lbBairro.setBounds(10,50,60,20);
		painelCentro.add(lbBairro);
		
		txNumero = Comp.txfield();
		txNumero.setBounds(830,20,150,20);
		painelCentro.add(txNumero);
				
		btLimpar = Comp.botao("Limpar");
		btLimpar.setBounds(997,20,94,20);
		painelCentro.add(btLimpar);
		
		txBairro = Comp.txfield(85);
		txBairro.setBounds(70,50,700,20);
		painelCentro.add(txBairro);
		
		lbCep = Comp.label("CEP.:");
		lbCep.setBounds(780,50,60,20);
		painelCentro.add(lbCep);
					
		txCep = Comp.mascaras("#####-###");
		txCep.setBounds(830,50,150,20);
		painelCentro.add(txCep);
		
		btPesquisar = Comp.botao("Pesquisar");
		btPesquisar.setBounds(998,50,94,20);
		painelCentro.add(btPesquisar);
		
		lbCidade = Comp.label("Cidade :");
		lbCidade.setBounds(10,80,60,20);
		painelCentro.add(lbCidade);
		
		txCidade = Comp.txfield(85);
		txCidade.setBounds(70,80,700,20);
		painelCentro.add(txCidade);						
		
		lbEstado = Comp.label("Estado:");
		lbEstado.setBounds(780,80,60,20);
		painelCentro.add(lbEstado);
		
		txEstado = Comp.txfield(65);
		txEstado.setBounds(830,80,150,20);
		painelCentro.add(txEstado);
		
		btDelete = Comp.botao("Deletar");
		btDelete.setBounds(998,80,94,20);
		btDelete.setOpaque(true);
		btDelete.setBackground(Paleta.cor_4);
		painelCentro.add(btDelete);		
	
	}

}
