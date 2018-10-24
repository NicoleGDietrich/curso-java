package br.com.java.aula18;

public class CalculadoraDesc {
	
	double numeroComDesconto;
	double aux; 
	
public double negativo(double numero) {
	if(numero < 0) {
	}
	return 0;
}

public double positivoAte1800(double numero) {
    if(numero <= 1800.0) {
		
	}
	return numero;
}

public double positivoEntre180001e2400(double numero) {
	if(numero >= 1800.01 && numero <= 2400) {
		aux = numero*0.05;
		numeroComDesconto = numero - aux;
	}
	return numeroComDesconto;
}

public double positivoEntre240001e359999(double numero) {
	if (numero >= 2400.01 && numero <= 3599.99) {
	 aux = numero * 0.22;
	 numeroComDesconto = numero - aux;
}
	return numeroComDesconto;
}


public double positivoAcimaDe3600(double numero) {
	if(numero >= 3600) {
		aux = numero * 0.32;
		numeroComDesconto = numero - aux;
		
	}
	return numeroComDesconto;
}
}
