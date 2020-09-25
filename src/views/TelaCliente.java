package views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import util.Comp;
import util.Paleta;
import util.Utils;

public class TelaCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel lbNome;
	private JLabel lbCpf; 
	private JLabel lbEmail;
	private JLabel lbTipo; 
	
	
	private JTextField txNome;
	private JTextField txCpf;	
	private JTextField txEmail;

	private JComboBox<?> cbTipo;
	private JPanel painelCentro;
	private TelaEndereco telaEndereco;
	// Integer id, String nome, String cpfCnpj, String email, TipoCliente tipo,
	// Endereco endereco

	public TelaCliente() {
        
		setBackground(Paleta.cor_4);
		setLayout(new BorderLayout());
		
		String[] tipo = {"PESSOA FÍSICA", "PES. JURÍDICA"};		
		
        
		painelCentro = new JPanel(new MigLayout("insets 5"));
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cliente"));
		painelCentro.setPreferredSize(new Dimension(1100, 100));
		
		add(painelCentro, BorderLayout.NORTH);
       
		lbNome = Comp.label("Nome :");
		painelCentro.add(lbNome);
     
		txNome = Comp.txfield(65);
		painelCentro.add(txNome);
		
		lbTipo =  Comp.label("Tipo :");
		painelCentro.add(lbTipo);

		cbTipo = new JComboBox(tipo);
		cbTipo.setFont(Utils.gramond_13);
		cbTipo.setPreferredSize(new Dimension(40,20));
		painelCentro.add(cbTipo, "wrap");
		
		lbEmail =  Comp.label("Email :");
		painelCentro.add(lbEmail);

		txEmail = Comp.txfield(65);
		painelCentro.add(txEmail);	

		lbCpf =  Comp.label("Cpf :");
		painelCentro.add(lbCpf);

		txCpf = Comp.mascaras("###.###.###-##");
		painelCentro.add(txCpf, "wrap");
		
		telaEndereco = new TelaEndereco();
		add(telaEndereco, BorderLayout.CENTER);
				
	}

}
