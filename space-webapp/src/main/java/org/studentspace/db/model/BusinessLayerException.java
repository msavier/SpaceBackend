package org.studentspace.db.model;

public class BusinessLayerException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessLayerException() {
    }

    public BusinessLayerException(String message) {
        super(message);
    }

    public BusinessLayerException(Throwable cause) {
        super(cause);
    }

    public BusinessLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}


