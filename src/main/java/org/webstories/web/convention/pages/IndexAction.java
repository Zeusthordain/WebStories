package org.webstories.web.convention.pages;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.webstories.core.invitation.LocalInviteAuthorization;
import org.webstories.web.util.params.RequestParams;
import org.webstories.web.util.servlet.BaseServlet;

import com.fagnerbrack.servlet.convention.ConventionServlet;

@WebServlet
@ConventionServlet
public class IndexAction extends BaseServlet {
	private static final long serialVersionUID = 1;
	
	@EJB
	LocalInviteAuthorization inviteAuthorization;
	
	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) {
		boolean isLogged = isLogged( request );
		boolean isInvited = isInvited( request );
		request.setAttribute( "canPublish", isLogged || isInvited );
	}
	
	private boolean isInvited( HttpServletRequest request ) {
		RequestParams params = RequestParams.from( request );
		String inviteCode = params.get( "invite" ).toString();
		if ( inviteCode == null ) {
			return false;
		}
		return inviteAuthorization.isValidInvitation( inviteCode );
	}
}
