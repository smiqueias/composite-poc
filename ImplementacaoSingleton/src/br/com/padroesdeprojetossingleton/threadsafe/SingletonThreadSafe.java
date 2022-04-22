/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementação: Padrão Singleton, Thread Safe.
 * 
 * 	Resumo: Essa alternativa foi criada para que a propiedade do Singleton seja mantida mesmo em um ambiente multithread.
 * 			Para isso é necessário sicronizar o método getInstancia(). Assim, vários threads não podem acessa-lo sumultaneamente;
 * 	
 *  Prós: Inicialização lenta(Assim evita o disperdício de recursos)
 *  	  Thread Safe: Uma aplicação multithread não quebra a propiedade do singleton
 *  Contras: Como o método getInstancia é sicronizado, o desempenho cai pois varios threads não podem acessa-lo simultaneamente. 
 * */

package br.com.padroesdeprojetossingleton.threadsafe;

public class SingletonThreadSafe {
		private static SingletonThreadSafe instancia;
		
		
		private SingletonThreadSafe() {
			//Construtor privado para garantir a propiedade da instância
		}
		
		synchronized public static SingletonThreadSafe getInstancia() {
			if(instancia == null) {
				instancia = new SingletonThreadSafe();
			}
			
			return instancia;
		}
		
		
		
}
