package br.com.java.aula19;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplos {
	
	//DATE
	
	public static void main (String [] args) {
	      Date agora = new Date ();
	      System.out.println ("toString ():" + agora);  // dow mon dd hh: mm: ss zzz aaaa
	      
	      // SimpleDateFormat pode ser usado para controlar o formato de exibição de data / hora:
	      // E (dia da semana): 3E ou menos (no texto xxx),> 3E (em texto completo)
	      // M (mês): M (em número), MM (em número com zero à esquerda)
	      // 3M: (no texto xxx),> 3M: (no texto integral completo)
	      // h (hora): h, hh (com zero à esquerda)
	      // m (minuto)
	      // s (segundo)
	      // a (AM / PM)
	      // H (hora entre 0 e 23)
	      // z (fuso horário)
	      SimpleDateFormat dateFormatter = new SimpleDateFormat ("E, yMd 'em' h: m: sa z");
	      System.out.println ("Formato 1:" + dateFormatter.format (agora));

	      dateFormatter = new SimpleDateFormat ("E aaaa.MM.dd 'em' hh: mm: ss a zzz");
	      System.out.println ("Format 2:" + dateFormatter.format (agora));
	      
	      dateFormatter = new SimpleDateFormat ("EEEE, MMMM d, aaaa");
	      System.out.println ("Formato 3:" + dateFormatter.format (agora));
	   }
	}



