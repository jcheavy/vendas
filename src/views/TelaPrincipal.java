package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import util.Paleta;
import util.Utils;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelTop;
	private JPanel panelEsq;
	private JPanel panelCentral;
	private JPanel panelVendas;
	private JPanel panelProduto;
	private JPanel panelWhite;
	private JPanel panelDefUser;
	private JPanel panelData, panelPesquisa;
	
	private JButton btpesquisar;
	private JTextField txpesquisar;
	private JTabbedPane abas;
	
	private TelaCliente telaCliente;
	private TelaUsuario telaUsuario;
	private TelaVendas telaVendas;
    private TelaProduto telaProduto;
    
    Date data = new Date();
	DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT);
	
	private JLabel lbData;
	
	private void resolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimension = t.getScreenSize();
		setSize((dimension.width + 5), (dimension.height - 38));
	}

	public TelaPrincipal() {

		Container telaPri = getContentPane();
		telaPri.setBackground(Paleta.cor_6);
		telaPri.setLayout(new BorderLayout());

		panelTop = new JPanel(new BorderLayout());
		panelTop.setPreferredSize(new Dimension(30, 40));
		panelTop.setBackground(Paleta.cor_4);
		telaPri.add(panelTop, BorderLayout.NORTH);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(3, 1, 3, 1);

		panelData = new JPanel();
		panelData.setBackground(Paleta.cor_4);
		panelData.setPreferredSize(new Dimension(250, 100));		
		panelTop.add(panelData, BorderLayout.WEST);
		

		panelPesquisa = new JPanel(new GridBagLayout());
		panelPesquisa.setBackground(Paleta.cor_4);
		constraints.gridx = 1;
		constraints.gridy = 0;
		panelTop.add(panelPesquisa, BorderLayout.CENTER);
	
		
		
		btpesquisar = new JButton("Pesquisar");
		txpesquisar = new JTextField(10);

	
		constraints.gridx = 0;
		constraints.gridy = 0;
		panelPesquisa.add(btpesquisar, constraints);

		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.gridx = 1;
		constraints.gridy = 0;
		panelPesquisa.add(txpesquisar, constraints);

		panelEsq = new JPanel();
		panelEsq.setPreferredSize(new Dimension(250, 100));
		panelEsq.setBackground(Paleta.cor_2);
		telaPri.add(panelEsq, BorderLayout.WEST);
		
		panelDefUser = new JPanel(new BorderLayout());
		panelDefUser.setBackground(Paleta.cor_2);
		panelDefUser.setPreferredSize(new Dimension(240, 100));
		panelDefUser.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		
		lbData = new JLabel("Data :    "+dataFormatada.format(data));
		lbData.setFont(Utils.gramond_20);
		lbData.setForeground(Color.white);
	   
		panelDefUser.add(lbData, BorderLayout.BEFORE_FIRST_LINE);
		panelEsq.add(panelDefUser);
		
		
		
		
		panelCentral = new JPanel(new BorderLayout());
		panelCentral.setBackground(Paleta.cor_3);
		
		telaCliente = new TelaCliente();			
		panelCentral.add(telaCliente, BorderLayout.NORTH);
		
		panelWhite = new JPanel();
		panelWhite.setBackground(Paleta.cor_5);
		
		telaUsuario = new TelaUsuario();
		panelWhite.add(telaUsuario);
		
		panelVendas = new JPanel();
		panelVendas.setBackground(Paleta.cor_4);
		
		telaVendas = new TelaVendas();
		panelVendas.add(telaVendas);
		
		panelProduto = new JPanel();
				
		telaProduto = new TelaProduto();
		panelProduto.add(telaProduto);
		
		abas = new JTabbedPane();		
	    telaPri.add(abas, BorderLayout.CENTER);
	    
	    abas.add("Painel Cliente",panelCentral);
	    abas.add("Painel Usuário",panelWhite);
	    abas.add("Painel Produto", panelProduto);
	    abas.add("Painel Vendas", panelVendas);
	    
	   

		setResizable(true);
		resolucao();
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}

}
