package br.com.java.aula19;
import java.text.NumberFormat;
import java.util.Locale;
public class NumberFormat1 {
	

	  public static void main(String[] args) {
	    double value = 123456789.9876543;

	    // Default locale
	    printFormatted(Locale.getDefault(), value);

	    // Indian locale
	    Locale indianLocale = new Locale("en", "IN");
	    printFormatted(indianLocale, value);
	  }

	  public static void printFormatted(Locale locale, double value) {
	    // Get number and currency formatter
	    NumberFormat nf = NumberFormat.getInstance(locale);
	    NumberFormat cf = NumberFormat.getCurrencyInstance(locale);

	    System.out.println("Format value: " + value + "  for locale: " + locale);
	    System.out.println("Number: " + nf.format(value));
	    System.out.println("Currency: " + cf.format(value));
	  }

	
	}
	     
	         
	
	       
	
	 
	
	        


