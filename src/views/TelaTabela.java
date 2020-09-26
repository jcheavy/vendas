package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.UsuarioDAO;
import entities.Usuario;
import net.miginfocom.swing.MigLayout;

public class TelaTabela extends JPanel {

	private JPanel painelCentro;
	private JPanel paineltop;
	private JTable tabela;
	private JScrollPane scroll;
	GridBagConstraints gbc = null;

	public TelaTabela() {

		setLayout(new BorderLayout());
		painelCentro = new JPanel(new BorderLayout());
		painelCentro.setPreferredSize(new Dimension(1000, 400));
		painelCentro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tabela"));
		this.add(painelCentro, BorderLayout.CENTER);
	
		
		tabela = new JTable();
		scroll = new JScrollPane();
		tabela.setPreferredSize(new Dimension(900,400));
		scroll.setViewportView(tabela);
		listarTabela(tabela);
		painelCentro.add(scroll, BorderLayout.EAST);
	}

	public void listarTabela(JTable table) {
    	
    	UsuarioDAO dao = new UsuarioDAO();
    	DefaultTableModel defaultModel; 
    	String[] titulo = {"ID","Nome","Perfil"};
    	
    	defaultModel = new DefaultTableModel(null, titulo);
    	List<Usuario> usuarios = dao.findAll();
    	String [] list = new String[3];
    	
    	for (Usuario u : usuarios) {
			list[0] = u.getId().toString();
			list[1] = u.getNome().toString();
			list[2] = u.getPerfil().toString();
			defaultModel.addRow(list);
		}
    	
    	table.setModel(defaultModel);
    }

}
