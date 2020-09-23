package util;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Comp {


	public static JButton botao(String desc) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(70, 20));
		but.setFont(Utils.gramond_14);
		return but;
	}

	public static JLabel label(String desc) {
		JLabel labl = new JLabel(desc);
		labl.setFont(Utils.gramond_13);
		//labl.setPreferredSize(new Dimension(100, 20));
		return labl;
	}

	public static  JTextField txfield() {
		JTextField txtfield = new JTextField();
		txtfield.setPreferredSize(new Dimension(100, 20));
		return txtfield;

	}
	
	
	// new dimension
	/**
	 * 
	 * @param w
	 * @param h
	 * @return  new dimension
	 */
	public static JTextField txfield(int w, int h) {
		JTextField txtfield = new JTextField();
		txtfield.setPreferredSize(new Dimension(w, h));
		return txtfield;

	}
	
	/**
	 * 
	 * @param desc
	 * @param w
	 * @param h
	 * @return new dimension
	 */
	public static  JLabel label(String desc,int w, int h ) {
		JLabel labl = new JLabel(desc);
		labl.setFont(Utils.gramond_14);
		labl.setPreferredSize(new Dimension(w, h));
		return labl;
	}
	
	/**
	 * 
	 * @param desc
	 * @param w
	 * @param h
	 * @return new dimension
	 */
	public static JButton botao(String desc, int w, int h) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(w, h));
		but.setFont(Utils.gramond_14);
		return but;
	}

}
