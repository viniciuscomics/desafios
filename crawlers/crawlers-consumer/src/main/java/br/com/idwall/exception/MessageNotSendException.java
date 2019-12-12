package br.com.idwall.exception;

public class MessageNotSendException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MessageNotSendException(String msg) {
		super(msg);
	}
}
