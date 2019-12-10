package idwall.desafio.string;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public class IdwallFormatter extends StringFormatter {

	private int SALTO_LINHA = 0x0A;
	
	public IdwallFormatter(Integer limit, boolean justify) {
		super(limit, justify);
	}

	/**
	 * Should format as described in the challenge
	 *
	 * @param text
	 * @return
	 * @throws Exception
	 */
	@Override
	public String format(String text) throws Exception {

		if (text == null || text.isEmpty()) {
			throw new Exception("O texto veio vazio. Informe um texto.");
		}

		StringBuilder textFormated = new StringBuilder();

		formatText(text, textFormated);

		return textFormated.toString();

	}

	private void formatText(String text, StringBuilder textFormated) {

		text = text.trim();

		if (text.length() > getLimit()) {

			String str = text.substring(0, getLimit());

			if (!Character.isWhitespace(text.charAt(getLimit()))) {

				
				int idx = str.lastIndexOf(SALTO_LINHA);

				if (idx < 0) {
					idx = str.lastIndexOf(" ");
				}

				if (idx > -1) {
					str = str.substring(0, idx);
				}
			}

			int size = str.length();

			str = justifyText(str);

			textFormated.append(str).append("\n");
			text = text.substring(size);

			formatText(text, textFormated);

		} else {
			text = justifyText(text);
			textFormated.append(text + "\n");
		}
	}

	private String justifyText(String text) {

		if (isJustify()) {
			if (text != null && getLimit().equals(text.length())) {
				return text;
			}

			if (text.indexOf(" ") < 0) {
				return String.format("%" + getLimit() + "s", text);
			}

			StringBuilder str = new StringBuilder();

			int space = getLimit() - text.length();
			
			if(text.indexOf(SALTO_LINHA) > 0) {				
				space += getNumOcorrecia(text, (char) SALTO_LINHA);				
			}				
			
			for (; space > 0;space--) {
				
				int idx = text.indexOf(" ");			

				if (idx < 0) {
					str.append(text);

					if (getLimit().equals(str.length())) {
						return str.toString();
					}

					text = str.toString();
					str = new StringBuilder();
					space = getLimit() - text.length();
					
					idx = text.indexOf(" ");			
					
				}				
				
				String aux = text.substring(0, idx + 1) + " ";

				str.append(aux);

				text = text.substring(aux.length() - 1);
				
			}
			str.append(text);
			return str.toString();
		} else {
			return text;
		}
	}
	
	private int getNumOcorrecia(String text, char str) {
		
		int ocorrencia = 0;
		
		for(int i = 0; i < text.length(); i++) {
			
			if(text.charAt(i) == str) {
				ocorrencia++;
			}
			
		}
		
		return ocorrencia;
	}

}
