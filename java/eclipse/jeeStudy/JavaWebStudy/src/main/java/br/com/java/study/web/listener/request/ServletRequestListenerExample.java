package br.com.java.study.web.listener.request;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.Cookie;

/**
 * Application Lifecycle Listener implementation class ServletRequestListenerExample
 *
 */
public class ServletRequestListenerExample implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public ServletRequestListenerExample() {
        // TODO Auto-generated constructor stub
    	
    	Cookie co =new Cookie("teste","teste");
    	
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }
	
}
