package org.webstories.web.api.exception;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.webstories.core.auth.AuthSession;
import org.webstories.core.auth.Logged;
import org.webstories.core.logging.LocalAppLogger;

public abstract class APIExceptionHandler<E extends Throwable> implements ExceptionMapper<E> {
	@Context
	private HttpServletRequest request;
	
	@EJB
	private LocalAppLogger logger;
	
	@Override
	public Response toResponse( E exception ) {
		Logged logged = AuthSession.from( request ).getLogged();
		logger.logAccess( logged, request, exception );
		return Response
			.status( getStatusCode() )
			.entity( ErrorObjectFactory.create( exception ) )
			.build();
	}
	
	/**
	 * Create the http status code that should be returned to the client
	 */
	protected abstract int getStatusCode();
}