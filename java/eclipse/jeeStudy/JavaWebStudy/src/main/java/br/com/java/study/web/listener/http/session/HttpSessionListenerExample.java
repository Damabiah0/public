package br.com.java.study.web.listener.http.session;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * Application Lifecycle Listener implementation class HttpSessionListenerExample
 *
 */
public class HttpSessionListenerExample implements HttpSessionListener {
       
    /**
     * @see HttpSessionListener#HttpSessionListener()
     */
    public HttpSessionListenerExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    }
	
}
