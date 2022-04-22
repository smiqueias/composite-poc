/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementa��o: Padr�o Singleton, Inicializa��o antecipada.
 * 
 * 	Resumo: Essa maneira de implementar � a mais simples, Pois autom�ticamente � criada a refer�ncia do objeto na memoria - 
 *          Assim que a JVM � iniciada.
 * 	
 *  Pr�s: Muito simples de implementar
 *  Contras: Desperdicio de recursos, pois a inst�ncia sempre � criada independente do uso ou necessidade.
 *  		 N�o � poss�vel tratar exce��es.
 * */

package br.com.padroesdeprojetossingleton.antecipada;

public class SingletonAntecipada {
	   private static final SingletonAntecipada instancia = new SingletonAntecipada();
	   
	   private SingletonAntecipada() {}  // Construtor Privado 
	   
	   //O met�do estatico, possibilita o acesso do recurso a partir de qualquer lugar do programa
	   public static SingletonAntecipada getInstancia() { 
		    return instancia;
	   }
}
