package org.computer.knauss.reqtDiscussion.io.sql;

public class DAOException extends Exception {

	private static final long serialVersionUID = 1L;

	DAOException(Exception cause) {
		super(cause);
	}

	public DAOException(String string) {
		super(string);
	}
}
