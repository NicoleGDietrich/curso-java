package br.com.java.aula19;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Data {
	
	public static void main(String[] args) {
		String data = "31/10/2018 16:42:40"; //se tirar por ex: 21:19:50 dará java.text.ParseException
		DateFormat dataFormatada = DateFormat.getDateTimeInstance();  //HH:mm:ss
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.getDefault());
		Date recebeDataFormatada = null;  
		
		//Tratamento de exceção
		try{  
			System.out.println(df.format(new Date()));
			recebeDataFormatada = dataFormatada.parse(data);  
		}catch(ParseException e) {  
		    e.printStackTrace();  //imprimi a stack trace
		}  
		finally {
			
		}
		System.out.println(recebeDataFormatada);
	
	
       /*
        * Short
        * Medium
        * Long
        * Full
        */
	
	}
}
	


