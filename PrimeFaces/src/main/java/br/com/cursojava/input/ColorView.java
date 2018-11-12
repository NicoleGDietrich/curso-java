package br.com.cursojava.input;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ColorView {
	
	private String colorInline;
    
    private String colorPopup;
 
    public String getColorInline() {
        return colorInline;
    }
 
    public void setColorInline(String colorInline) {
        this.colorInline = colorInline;
    }
 
    public String getColorPopup() {
        return colorPopup;
    }
 
    public void setColorPopup(String colorPopup) {
        this.colorPopup = colorPopup;
    } 


}
