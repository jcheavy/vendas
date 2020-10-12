package views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import util.Comp;
import util.DocumentLetras;
import util.Paleta;
import util.Utils;

public class TelaUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel lbNome;
	private JLabel lbCpf; 
	private JLabel lbSenha;
	private JLabel lbTipo; 
	
	
	private JTextField txNome;
	private JTextField txCpf;		
	private JPasswordField txPassword;

	private JComboBox<?> cbTipo;
	private JPanel painelCentro;
	private TelaEndereco telaEndereco;
	private TelaTabela telaTabela;


	public TelaUsuario() {
        
		setBackground(Paleta.cor_4);
		setLayout(new BorderLayout());
		
		String[] tipo = {"USUÁRIO", "ADMIN"};		
		
        
		painelCentro = new JPanel();
		painelCentro.setLayout(null);
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cliente"));
		painelCentro.setPreferredSize(new Dimension(1000, 90));
		
		add(painelCentro, BorderLayout.NORTH);
       
		lbNome = Comp.label("Nome :");
		lbNome.setBounds(10,20,60,20);
		painelCentro.add(lbNome);
     
		txNome = Comp.txfield(65);
		txNome.setBounds(70,20,700,20);
		txNome.setDocument(new DocumentLetras());
		painelCentro.add(txNome);
		
		lbTipo =  Comp.label("Tipo :");
		lbTipo.setBounds(780,20,60,20);
		painelCentro.add(lbTipo);

		cbTipo = new JComboBox(tipo);
		cbTipo.setBounds(830,20,150,20);
		cbTipo.setFont(Utils.gramond_13);
		cbTipo.setPreferredSize(new Dimension(40,20));
		painelCentro.add(cbTipo);
		
		lbSenha =  Comp.label("Senha :");
		lbSenha.setBounds(10,50,60,20);
		painelCentro.add(lbSenha);

		txPassword = new JPasswordField(40);
		txPassword.setBounds(70,50,700,20);
		painelCentro.add(txPassword);	

		lbCpf =  Comp.label("Cpf :");
		lbCpf.setBounds(780,50,60,20);
		painelCentro.add(lbCpf);

		txCpf = Comp.mascaras("###.###.###-##");
		txCpf.setBounds(830,50,150,20);
		painelCentro.add(txCpf);
		
		telaEndereco = new TelaEndereco();
		add(telaEndereco, BorderLayout.CENTER);
		
		telaTabela = new TelaTabela();
		add(telaTabela, BorderLayout.SOUTH);
				
	}
	


}
