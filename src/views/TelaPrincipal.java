package views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import util.Paleta;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	

	private void resolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimension = t.getScreenSize();
		setSize((dimension.width + 5), (dimension.height - 38));
	}	
    
	public TelaPrincipal() {
         
		Container telaPri = getContentPane();
		telaPri.setBackground(Paleta.cor_6);
		telaPri.setLayout(new BorderLayout());
		
		
		JPanel panelTop = new JPanel();	
		panelTop.setPreferredSize(new Dimension(30,100));
	    panelTop.setBackground(Paleta.cor_4); 
	    telaPri.add(panelTop, BorderLayout.NORTH);
	    
	    
	    
	    JPanel panelEsq = new JPanel();
		panelEsq.setPreferredSize(new Dimension(250,100));
		panelEsq.setBackground(Paleta.cor_2);
		telaPri.add(panelEsq, BorderLayout.WEST);
		
		
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
