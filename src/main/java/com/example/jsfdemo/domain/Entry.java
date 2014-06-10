package com.example.jsfdemo.domain;




import javax.validation.constraints.Size;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
	public class Entry {
		private String nick = "niezalogowany";
		private String wpis = "";
		
		
		
		
		@Size(min = 2, max = 20)
		public String getNick() {
			return nick;
		}
		public void setNick(String firstName) {
			this.nick = firstName;
		}
		@Size(min = 2, max= 255)
		public String getWpis() {
			return wpis;
		}
		public void setWpis(String wpis) {
			this.wpis = wpis;
		}
		
	}

