package com.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    private String name;
    private String email;
    private String password;
    private String bloodGroup;
    private String[] language;
    private String os;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = new String[]{language};
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
