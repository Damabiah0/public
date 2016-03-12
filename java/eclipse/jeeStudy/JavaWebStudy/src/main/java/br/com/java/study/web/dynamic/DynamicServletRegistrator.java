package br.com.java.study.web.dynamic;

import java.io.IOException;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.java.study.web.dynamic.filter.ProgramaticFilter;

/**
 * Servlet implementation class DynamicServletRegistrator
 */
@ServletSecurity(@HttpConstraint(value=EmptyRoleSemantic.DENY,transportGuarantee=TransportGuarantee.CONFIDENTIAL))
public class DynamicServletRegistrator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DynamicServletRegistrator() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 session.setMaxInactiveInterval(-1);//eternal session!
		 request.getServletContext().getDefaultSessionTrackingModes();
	}


}
