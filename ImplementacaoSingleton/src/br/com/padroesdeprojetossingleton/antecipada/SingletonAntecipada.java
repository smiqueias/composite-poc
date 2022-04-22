/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementação: Padrão Singleton, Inicialização antecipada.
 * 
 * 	Resumo: Essa maneira de implementar é a mais simples, Pois automáticamente é criada a referência do objeto na memoria - 
 *          Assim que a JVM é iniciada.
 * 	
 *  Prós: Muito simples de implementar
 *  Contras: Desperdicio de recursos, pois a instância sempre é criada independente do uso ou necessidade.
 *  		 Não é possível tratar exceções.
 * */

package br.com.padroesdeprojetossingleton.antecipada;

public class SingletonAntecipada {
	   private static final SingletonAntecipada instancia = new SingletonAntecipada();
	   
	   private SingletonAntecipada() {}  // Construtor Privado 
	   
	   //O metódo estatico, possibilita o acesso do recurso a partir de qualquer lugar do programa
	   public static SingletonAntecipada getInstancia() { 
		    return instancia;
	   }
}
