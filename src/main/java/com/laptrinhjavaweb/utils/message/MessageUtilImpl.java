package com.laptrinhjavaweb.utils.message;

import javax.servlet.http.HttpServletRequest;

public class MessageUtilImpl implements MessageUtil {

    private String message;
    private String alert;

    public MessageUtilImpl (String message, String alert) {
        this.message = message;
        this.alert = alert;
    }

    @Override
    public void buildMessage(HttpServletRequest request) {
        request.setAttribute("message", this.message);
        request.setAttribute("alert", this.alert);
    }
}
