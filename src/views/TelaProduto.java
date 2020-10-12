package views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Comp;
import util.DocumentLetras;
import util.Paleta;
import util.Utils;

public class TelaProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel lbNome;
	private JLabel lbPreco; 
	private JLabel lbCodigo;
	private JLabel lbMarca; 
	private JLabel lbQuantidade;
	
	
	private JTextField txNome;
	private JTextField txPreco;	
	private JTextField txCodigo;
	private JTextField txQuantidade;

	private JComboBox<?> cbMarca;
	private JPanel painelCentro;
	private TelaEndereco telaEndereco;
	private TelaTabela telaTabela;
	
	// Integer id, String nome, String cpfCnpj, String email, TipoCliente tipo,
	// Endereco endereco
   
	int col1 = 10;
	int w = 60;
	int h = 20;			   
	
	public TelaProduto() {
        
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
		
		lbMarca =  Comp.label("Marca :");
        lbMarca.setBounds(780,h,100,h);
		painelCentro.add(lbMarca);

		cbMarca = new JComboBox(tipo);
		cbMarca.setFont(Utils.gramond_13);
		cbMarca.setBounds(830,h,150,h);
		painelCentro.add(cbMarca, "wrap");
		
		lbCodigo =  Comp.label("Código:");
		lbCodigo.setBounds(col1,50,w,h);
		painelCentro.add(lbCodigo);

		txCodigo = new JTextField(65);
		txCodigo.setFont(Utils.gramond_13);
		txCodigo.setBounds(70,50,450,h);
		painelCentro.add(txCodigo);	

		lbPreco =  Comp.label("Preço :");
		lbPreco.setBounds(535,50,w,h);
		painelCentro.add(lbPreco);

		txPreco = Comp.mascaras("###.###.###-##");
		txPreco.setBounds(585,50,150,h);
		painelCentro.add(txPreco);
		
		
		lbQuantidade = Comp.label("Quantidade:");
		lbQuantidade.setBounds(748,50,80,20);
		painelCentro.add(lbQuantidade);
		
		txQuantidade = Comp.txfield();
		txQuantidade.setBounds(830,50,150,20);
		painelCentro.add(txQuantidade);
		
		telaEndereco = new TelaEndereco();
		add(telaEndereco, BorderLayout.CENTER);
		
		telaTabela = new TelaTabela();
		add(telaTabela, BorderLayout.SOUTH);
				
	}

}
