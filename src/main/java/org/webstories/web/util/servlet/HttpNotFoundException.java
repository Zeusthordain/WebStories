package org.webstories.web.util.servlet;

import javax.servlet.ServletException;

public class HttpNotFoundException extends ServletException {
	private static final long serialVersionUID = 1;
	public HttpNotFoundException( Throwable cause ) {
		super( cause );
	}
}