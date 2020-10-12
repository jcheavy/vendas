package util;

import java.awt.Color;
import java.awt.Font;

public class Utils {

	/**
	 * classe de utilidades fontes.
	 */
	public static Font taoma_14 = new Font("Taoma", Font.PLAIN, 14);
	public static Font jokerman_20 = new Font("Jokerman", Font.PLAIN, 20);
	static int style = Font.BOLD | Font.ITALIC;

	public static Font gramond_30 = new Font("Garamond", style, 30);
	public static Font gramond_20 = new Font("Garamond", style, 20);
	public static Font gramond_15 = new Font("Garamond", style, 15);
	public static Font gramond_14 = new Font("Garamond", Font.BOLD, 14);
	public static Font gramond_13 = new Font("Garamond", Font.BOLD, 15);

	/**
	 * Paleta de Cores
	 * 
	 */

	public static Color bege = new Color(231, 223, 213);
	public static Color verde = new Color(132, 169, 172);
	public static Color azul = new Color(59, 105, 120);
	public static Color azul_esc = new Color(32, 64, 81);

	/**
	 * Remove os caracteres inv�lidos para serem inseridos no banco de dados,
	 * alterando-os com seu respectivo caracter de escape
	 * 
	 * @param texto String
	 * @return String
	 */

	public static String textoDB(String texto) {
		StringBuilder bui = new StringBuilder();

		if (texto != null) {
			for (int i = 0; i < texto.length(); i++) {
				// substitui a aspas qdo se copia textos com CTRL+C no windows
				// as aspas tem codigo 146 no linux e 8217 no windows qdo copiados no Adobe
				// Acrobat
				// troca acentos grave e agudo quando est�o sem nenhuma letra
				if (texto.charAt(i) == '\'' || (int) texto.charAt(i) == 146 || (int) texto.charAt(i) == 8217
						|| texto.charAt(i) == '`' || texto.charAt(i) == '�')
					bui.append("''");
				else if ((int) texto.charAt(i) == 8220 || (int) texto.charAt(i) == 8221 || texto.charAt(i) == 0xe2809d
						|| texto.charAt(i) == 0xe2809c)
					bui.append("\"");
				else if (texto.charAt(i) == '\u221e' || texto.charAt(i) == '\u2013' || texto.charAt(i) == '\u25ba')
					bui.append(" ");
				else if (texto.charAt(i) == '\\')
					bui.append("\\").append(texto.charAt(i));
				else if (texto.charAt(i) == '\u00e2')
					bui.append("�");
				else if (texto.charAt(i) == '\u0161')
					bui.append("s");
				else if (texto.charAt(i) == '\u00ef')
					bui.append("i");
				else if (texto.charAt(i) == '\u00e1')
					bui.append("�");
				else if (texto.charAt(i) == '\uFF7D')
					bui.append("�");
				else if (texto.charAt(i) == 0xe280a2 || (int) texto.charAt(i) == 8226)
					bui.append(".");
				else if (texto.charAt(i) == '\uFFFD' || texto.charAt(i) == 0xe282ac || texto.charAt(i) == 0xc595
						|| texto.charAt(i) == 0xc594 || texto.charAt(i) == 0xc4b9 || texto.charAt(i) == 0xc692
						|| texto.charAt(i) == 0xefbfbd || texto.charAt(i) == 0xc59b || texto.charAt(i) == 0xe1b994
						|| texto.charAt(i) == 0xe2889e || texto.charAt(i) == 0xe1b995 || texto.charAt(i) == 0xe1b98d
						|| texto.charAt(i) == 0xe28093 || texto.charAt(i) == 0xc4ba || texto.charAt(i) == 0xc59a
						|| texto.charAt(i) == 0xefbdbd || texto.charAt(i) == 0xefbfbd || texto.charAt(i) == 0xe296ba
						|| texto.charAt(i) == 0xcebc || texto.charAt(i) == 0xd8b2 || texto.charAt(i) == 0xd8b5
						|| texto.charAt(i) == 0xe2808e || (int) texto.charAt(i) == 8364 || (int) texto.charAt(i) == 8206
						|| (int) texto.charAt(i) == 50361 || (int) texto.charAt(i) == 50362
						|| (int) texto.charAt(i) == 50580 || (int) texto.charAt(i) == 50581
						|| (int) texto.charAt(i) == 50586 || (int) texto.charAt(i) == 50587
						|| (int) texto.charAt(i) == 50834 || (int) texto.charAt(i) == 52924
						|| (int) texto.charAt(i) == 55474 || (int) texto.charAt(i) == 55477
						|| (int) texto.charAt(i) == 57785 || (int) texto.charAt(i) == 57984
						|| (int) texto.charAt(i) == 57992 || (int) texto.charAt(i) == 58006
						|| (int) texto.charAt(i) == 61373 || (int) texto.charAt(i) == 61375)
					bui.append(" ");
				else
					bui.append(texto.charAt(i));
			}
		}

		return bui.toString();
	}

}
