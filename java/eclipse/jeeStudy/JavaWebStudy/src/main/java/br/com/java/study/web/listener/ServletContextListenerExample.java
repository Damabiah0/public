package br.com.java.study.web.listener;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;

import br.com.java.study.web.dynamic.filter.ProgramaticFilter;

/**
 * Application Lifecycle Listener implementation class
 * ServletContextListenerExample
 *
 */
public class ServletContextListenerExample implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ServletContextListenerExample() {
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		ProgramaticFilter programaticFilter;
		try {
			programaticFilter = sce.getServletContext().createFilter(
					ProgramaticFilter.class);
			sce.getServletContext().addFilter("programaticFilter",
					programaticFilter);
		} catch (ServletException e) {
			e.printStackTrace();
		}

		FilterRegistration.Dynamic dynamic = sce.getServletContext().addFilter(
				"programaticFilter1", ProgramaticFilter.class);
		dynamic.setInitParameter("Teste", "Teste");
	}

}
