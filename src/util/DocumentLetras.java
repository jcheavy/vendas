package util;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * 
 * @author Jean Filtro s� letras no JTextField
 */
public class DocumentLetras extends PlainDocument {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
		super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ ]", ""), attr);// ACEITA SOMENTE LETRAS
	}
}