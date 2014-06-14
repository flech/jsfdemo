package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;

import com.example.jsfdemo.domain.Administator;
import com.example.jsfdemo.domain.Entry;
@ManagedBean
@Dependent

public class Manager {

	public List<Entry> db1 = new ArrayList<Entry>();
    
    
 int i = 0;
	public String addEntry(String nick, String wpis ){
Entry newEntry = new Entry();
newEntry.setNick(i+"." +nick);
i++;
newEntry.setWpis(wpis);
db1.add(newEntry);
return "home?faces-redirect=true";

}	
	public void deleteEntry(int numer){
	
		db1.remove(numer);
		
	}
	

	
	public List<Entry> getAllEntries() {
		return db1;
	}
	public List<Entry> getdb1() {
return db1;
}
	public void setdb1(List<Entry> db1){
		this.db1 = db1;
	}
	

	
}
