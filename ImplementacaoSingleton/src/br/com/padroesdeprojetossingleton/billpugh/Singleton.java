/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementa��o: Padr�o Singleton, Billpugh.
 * 
 * 	Resumo: Antes do Java5, o modelo de mem�ria tinha muitos problemas e os m�todos acima causavam falhas em certos cen�rios em ambiente multithread. 
 * 			Ent�o, Bill Pugh sugeriu um conceito de classes est�ticas internas para usar em singleton. 
 *
 *  Contras: Como o m�todo getInstancia � sicronizado, o desempenho cai pois varios threads n�o podem acessa-lo simultaneamente. 
 * */

package br.com.padroesdeprojetossingleton.billpugh;

public class Singleton {
	 
	 private Singleton() {};
	 
	 private static class SingletonStatic{
		 private static final Singleton instancia = new Singleton();
	 }
	 
	 public static Singleton getInstancia() {
		 return SingletonStatic.instancia;
	 }
	 
}
