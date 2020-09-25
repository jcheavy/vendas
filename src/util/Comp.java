package util;

import java.awt.Dimension;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Comp {

	public static JButton botao(String desc) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(70, 20));
		but.setFont(Utils.gramond_13);
		return but;
	}

	public static JLabel label(String desc) {
		JLabel labl = new JLabel(desc);
		labl.setFont(Utils.gramond_13);
		// labl.setPreferredSize(new Dimension(100, 20));
		return labl;
	}

	public static JTextField txfield() {
		JTextField txtfield = new JTextField();
		txtfield.setPreferredSize(new Dimension(420, 20));
		txtfield.setFont(Utils.gramond_13);
		return txtfield;

	}

	public static JTextField txfield(int tam) {
		JTextField txtfield = new JTextField(tam);
		txtfield.setFont(Utils.gramond_13);
		return txtfield;
	}

	// new dimension
	/**
	 * 
	 * @param w
	 * @param h
	 * @return new dimension
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
	public static JLabel label(String desc, int w, int h) {
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

	public static JFormattedTextField mascaras(String masc) {
		JFormattedTextField formater = null;
		try {
			MaskFormatter mascfor = new MaskFormatter(masc);
			formater = new JFormattedTextField(mascfor);
			formater.setPreferredSize(new Dimension(100,20));
			formater.setFont(Utils.gramond_13);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return formater;
	}
}
