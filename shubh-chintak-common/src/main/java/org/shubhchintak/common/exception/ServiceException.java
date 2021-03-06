/**
 * 
 */
package org.shubhchintak.common.exception;

/**
 * @author sudhanshusharma
 *
 */
public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 336825321462727157L;

	/**
	 * Constructs an {@code ApiException} with the specified message and root cause.
	 *
	 * @param msg the detail message
	 * @param t   the root cause
	 */
	public ServiceException(String msg, Throwable t) {
		super(msg, t);
	}

	/**
	 * Constructs an {@code ApiException} with the specified message and no root
	 * cause.
	 *
	 * @param msg the detail message
	 */
	public ServiceException(String msg) {
		super(msg);
	}
}
