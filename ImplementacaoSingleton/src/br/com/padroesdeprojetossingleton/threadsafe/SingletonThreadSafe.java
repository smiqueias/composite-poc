/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementa��o: Padr�o Singleton, Thread Safe.
 * 
 * 	Resumo: Essa alternativa foi criada para que a propiedade do Singleton seja mantida mesmo em um ambiente multithread.
 * 			Para isso � necess�rio sicronizar o m�todo getInstancia(). Assim, v�rios threads n�o podem acessa-lo sumultaneamente;
 * 	
 *  Pr�s: Inicializa��o lenta(Assim evita o disperd�cio de recursos)
 *  	  Thread Safe: Uma aplica��o multithread n�o quebra a propiedade do singleton
 *  Contras: Como o m�todo getInstancia � sicronizado, o desempenho cai pois varios threads n�o podem acessa-lo simultaneamente. 
 * */

package br.com.padroesdeprojetossingleton.threadsafe;

public class SingletonThreadSafe {
		private static SingletonThreadSafe instancia;
		
		
		private SingletonThreadSafe() {
			//Construtor privado para garantir a propiedade da inst�ncia
		}
		
		synchronized public static SingletonThreadSafe getInstancia() {
			if(instancia == null) {
				instancia = new SingletonThreadSafe();
			}
			
			return instancia;
		}
		
		
		
}
