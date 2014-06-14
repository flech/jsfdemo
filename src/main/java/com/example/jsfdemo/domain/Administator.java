package com.example.jsfdemo.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Administator {
	
	public String name;
	public String password;
	public boolean logedIn=false;
	
	public Administator(){}
	public void logIn(){logedIn=true;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setLogedIn(boolean logedIn) {
this.logedIn = logedIn;
}
	public boolean isLogedIn() {
return logedIn;
}


	
	
	public String CheckLogin(Administator admini)
{

if(admini.getName().equals("admin1") && admini.getPassword().equals("haslo"))
{
admini.setLogedIn(true);
return "longin.jsp";
}
else	return "index.jsp";
}
	public String logOut(Administator admini){
		admini.setLogedIn(false);
		return "index.jsp";
	}

}
	


