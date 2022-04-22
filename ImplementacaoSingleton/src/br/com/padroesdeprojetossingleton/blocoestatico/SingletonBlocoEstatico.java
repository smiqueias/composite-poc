/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementa��o: Padr�o Singleton, Inicializa��o Lenta.
 * 
 * 	Resumo: O objeto � criado apenas se necess�rio. Isso evita o desperd�cio de recursos, � recomend�vel o uso apenas
 * 			em ambientes de thread �nica.
 * 	
 *  Pr�s: Evita o desperd�cio de recursos, � poss�vel tratar exce��es, n�o pode acessar a inst�ncia diretamente.
 *  Contras: N�o recomend�vel o uso em ambientes multithread, pois pode quebrar a propiedade do Singleton. 
 *  		 Verifica��o da condi��o de nulo toda vez, 
 * */


package br.com.padroesdeprojetossingleton.blocoestatico;

public class SingletonBlocoEstatico {
	private static SingletonBlocoEstatico instancia;
	
	
	private SingletonBlocoEstatico() {
		//Construtor privado para garantir a propiedade da inst�ncia
	}
	
	//m�todo est�tico para refer�ncia a instancia em toda a aplica��o
	public static SingletonBlocoEstatico getInstancia() {
		 if(instancia == null) {
			 instancia = new SingletonBlocoEstatico();
		 }
		 
		 return instancia;
		 
	}
	
}
