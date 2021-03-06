package com.aungmyohtet.pm.event;

import java.util.Locale;
import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class RegistrationCompleteEvent extends ApplicationEvent {

    private final String appUrl;
    private final Locale locale;
    private final String email;
    private final String token;

    public RegistrationCompleteEvent(final String email, final String token, final Locale locale, final String appUrl) {
        super(email);
        this.email = email;
        this.locale = locale;
        this.appUrl = appUrl;
        this.token = token;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public Locale getLocale() {
        return locale;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }

}

