package views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import net.miginfocom.swing.MigLayout;
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
	private JTextField txSenha;
	private JPasswordField txPassword;

	private JComboBox<?> cbTipo;
	private JPanel painelCentro;
	private TelaEndereco telaEndereco;
	private TelaTabela telaTabela;


	public TelaUsuario() {
        
		setBackground(Paleta.cor_4);
		setLayout(new BorderLayout());
		
		String[] tipo = {"USUÁRIO", "ADMIN"};		
		
        
		painelCentro = new JPanel(new MigLayout("insets 5"));
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cliente"));
		painelCentro.setPreferredSize(new Dimension(1000, 100));
		
		add(painelCentro, BorderLayout.NORTH);
       
		lbNome = Comp.label("Nome :");
		painelCentro.add(lbNome);
     
		txNome = Comp.txfield(65);
		txNome.setDocument(new DocumentLetras());
		painelCentro.add(txNome);
		
		lbTipo =  Comp.label("Tipo :");
		painelCentro.add(lbTipo);

		cbTipo = new JComboBox(tipo);
		cbTipo.setFont(Utils.gramond_13);
		cbTipo.setPreferredSize(new Dimension(40,20));
		painelCentro.add(cbTipo, "wrap");
		
		lbSenha =  Comp.label("Senha :");
		painelCentro.add(lbSenha);

		txPassword = new JPasswordField(40);
		painelCentro.add(txPassword);	

		lbCpf =  Comp.label("Cpf :");
		painelCentro.add(lbCpf);

		txCpf = Comp.mascaras("###.###.###-##");
		painelCentro.add(txCpf, "wrap");
		
		telaEndereco = new TelaEndereco();
		add(telaEndereco, BorderLayout.CENTER);
		
		telaTabela = new TelaTabela();
		add(telaTabela, BorderLayout.SOUTH);
				
	}
	


}
