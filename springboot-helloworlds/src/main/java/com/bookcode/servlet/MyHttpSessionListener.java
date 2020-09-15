package com.bookcode.servlet;

import ch.qos.logback.core.net.SyslogOutputStream;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session has been created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("SevletContext is being initializing");

    }
}
