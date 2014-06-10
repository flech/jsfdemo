package com.example.jsfdemo.domain;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Admin implements Serializable{

private static final long serialVersionUID = 1L;

private String name="";
private String password="";
private boolean admin=true;
public boolean logedIn=false;

public boolean isLogedIn() {
return logedIn;
}
public void setLogedIn(boolean logedIn) {
this.logedIn = logedIn;
}


public void logIn(){logedIn=true;}
public String logOut(){logedIn=false; return "home?faces-redirect=true";}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public boolean isAdmin() {
return admin;
}
public void setAdmin(boolean admin) {
this.admin = admin;
}
}