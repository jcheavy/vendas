package views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Comp;
import util.DocumentLetras;
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
	private TelaTabela telaTabela;
	
	private JButton btSalvar;
	
	// Integer id, String nome, String cpfCnpj, String email, TipoCliente tipo,
	// Endereco endereco
   
	int col1 = 10;
	int w = 60;
	int h = 20;			   
	
	public TelaCliente() {
        
		setBackground(Paleta.cor_4);
		setLayout(new BorderLayout());
		
		String[] tipo = {"PESSOA FÍSICA", "PES. JURÍDICA"};		
		
        
		painelCentro = new JPanel();
		painelCentro.setLayout(null);
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cliente"));
		painelCentro.setPreferredSize(new Dimension(1100, 90));
		
		add(painelCentro, BorderLayout.NORTH);
       
		lbNome = Comp.label("Nome :");
        lbNome.setBounds(col1,h,w,h);
		painelCentro.add(lbNome);  
		
		txNome = Comp.txfield(65);		
		txNome.setDocument(new DocumentLetras());
		txNome.setBounds(70,h,700,h);
		painelCentro.add(txNome);
		
		lbTipo =  Comp.label("Tipo :");
        lbTipo.setBounds(780,h,100,h);
		painelCentro.add(lbTipo);

		cbTipo = new JComboBox(tipo);
		cbTipo.setFont(Utils.gramond_13);
		cbTipo.setBounds(830,h,150,h);
		painelCentro.add(cbTipo, "wrap");
				
		btSalvar = Comp.botao("Salvar");
		btSalvar.setBounds(998,h,94,50);
		btSalvar.setContentAreaFilled(false);
		btSalvar.setOpaque(true);
		btSalvar.setBackground(Paleta.cor_4);
		btSalvar.setFocusable(false);
		painelCentro.add(btSalvar);
		
		lbEmail =  Comp.label("Email :");
		lbEmail.setBounds(col1,50,w,h);
		painelCentro.add(lbEmail);

		txEmail = new JTextField(65);
		txEmail.setFont(Utils.gramond_13);
		txEmail.setBounds(70,50,700,h);
		painelCentro.add(txEmail);	

		lbCpf =  Comp.label("Cpf :");
		lbCpf.setBounds(780,50,w,h);
		painelCentro.add(lbCpf);

		txCpf = Comp.mascaras("###.###.###-##");
		txCpf.setBounds(830,50,150,h);
		painelCentro.add(txCpf);
		
		telaEndereco = new TelaEndereco();
		add(telaEndereco, BorderLayout.CENTER);
		
		telaTabela = new TelaTabela();
		add(telaTabela, BorderLayout.SOUTH);
				
	} 

	 
}
