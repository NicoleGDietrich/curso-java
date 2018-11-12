package br.com.cursojava.input;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SignatureView {

	  private String value;
	  
	    public String getValue() {
	        return value;
	    }
	 
	    public void setValue(String value) {
	        this.value = value;
	    }
	
}