package com.laptrinhjavaweb.utils.message;

import javax.servlet.http.HttpServletRequest;

public interface MessageUtil {

    void buildMessage(HttpServletRequest request);

    static MessageUtil of (String message, String alert) {
        return new MessageUtilImpl(message, alert);
    }
}
