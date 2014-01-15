/*
 * Copyright Tidemark Systems, Inc. All rights reserved.
 * Tidemark Systems Confidential and Proprietary Information. Not for external distribution, use or sale.
 * Tidemark Systems software is exclusively licensed according to the terms of our Software License and Services Agreement.
 * My comments.....
 */
package app.tomcat.api;

import javax.ws.rs.FormParam;

/**
 * 
 * @author "Nick Hristov" <nhristov@tidemark.net>
 */
public class LoginForm {

    @FormParam("username")
    private String username;

    @FormParam("password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
