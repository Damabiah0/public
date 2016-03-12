package br.com.java.study.web.listener.http.session.notforwebxml;

import javax.servlet.http.HttpSessionBindingEvent;

/**
 * This interface must be implemented by a object that like to keep track of session attributes in a specific session.
 * Application Lifecycle Listener implementation class HttpSessionBindingListener
 *
 */
public class HttpSessionBindingListenerExample implements javax.servlet.http.HttpSessionBindingListener {

    /**
     * Default constructor. 
     */
    public HttpSessionBindingListenerExample() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionBindingListenerExample#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent event)  {
    	//Activated when a attribute is added to the session
    }

	/**
     * @see HttpSessionBindingListenerExample#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }
	
}
