public enum Token implements Comparable<Token> {

		// LBRACE, RBRACE, ADD, MUL, SUB, DIV

		LBRACE("("), RBRACE(")"), ADD("+"), SUB("-"), MUL("*"), DIV("/"), IDENTIFIER("name");

		}

		
		public class Token {
	private TokenKind token;
	private String name;
	
	public Token(final TokenKind kind, final String name) {
		this.token = kind;
		this.name = name;
	}
	

	/**
	 * @return the token
	 */
	public Token getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(Token token) {
		this.token = token;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TokenKind [token=" + token + ", name=" + name + "]";
	}

}




while (rowCounter < characters.length) {
			System.out.println(rowCounter + "<" + characters.length);
			System.out.println("CHARS:" + characters[rowCounter]);
			System.out.println(rowCounter);
			int ord = characters[rowCounter];

			switch (ord) {
			case '(':
				tokenQueue.insert(new Token(TokenKind.LBRACE, "("));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: (");
				// System.out.println(Token.LBRACE.toString());
				rowCounter++;
				break;

			case ')':
				tokenQueue.insert(new Token(TokenKind.RBRACE, ")"));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: )");
				
				rowCounter++;
				break;

			case '+':
				tokenQueue.insert(new Token(TokenKind.ADD, "+"));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: +");
				
				rowCounter++;
				break;

			case '-':
				tokenQueue.insert(new Token(TokenKind.SUB, "-"));
				// builtTokenList(symbole.substring(rowCounter++));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: -");

				rowCounter++;
				break;

			case '*':
				tokenQueue.insert(new Token(TokenKind.MUL, "*"));
				// builtTokenList(symbole.substring(rowCounter++));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: *");

				rowCounter++;
				break;

			case '/':
				tokenQueue
						.insert(new Token(TokenKind.DIV, TokenKind.DIV.name()));
				// builtTokenList(symbole.substring(rowCounter++));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: /");

				rowCounter++;
				break;

			case ' ':
				// builtTokenList(symbole.substring(rowCounter));
				System.out.println(tokenQueue.size());

				System.out.println("Fall: ' '");

				rowCounter++;
				break;

			default:
				// Character character = new Character(characters[rowCounter]);
				boolean isLetter = Character.isLetter(characters[rowCounter]);
				System.out.println(tokenQueue.size());

				System.out.println("Fall: default");

				if (isLetter) {
					while (isLetter) {
						ident.append(characters[rowCounter]);
						rowCounter++;
						isLetter = Character.isLetter(characters[rowCounter]);
						System.out.println(isLetter);
					}
					System.out.println(ident.toString());
					Token token = new Token(TokenKind.IDENTIFIER,
							ident.toString());
					tokenQueue.insert(token);
				} else {
					// System.out.println(Token.IDENTIFIER);
				}

			}
