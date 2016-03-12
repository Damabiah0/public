package br.com.java.study.web.listener.http.session.notforwebxml;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * HttpSessionActivationListener should be implemented by classes that are being added to the session as attributes.
 * Application Lifecycle Listener implementation class HttpSessionActivationListenerExample
 *
 */
public class HttpSessionActivationListenerExample implements HttpSessionActivationListener {

    /**
     * Default constructor. 
     */
    public HttpSessionActivationListenerExample() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
    	//When the session is being activated from passivation
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
    	//This method is called before passivation by the container.
    	
    }
	
}
