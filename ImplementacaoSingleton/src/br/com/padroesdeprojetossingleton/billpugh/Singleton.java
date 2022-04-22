/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementação: Padrão Singleton, Billpugh.
 * 
 * 	Resumo: Antes do Java5, o modelo de memória tinha muitos problemas e os métodos acima causavam falhas em certos cenários em ambiente multithread. 
 * 			Então, Bill Pugh sugeriu um conceito de classes estáticas internas para usar em singleton. 
 *
 *  Contras: Como o método getInstancia é sicronizado, o desempenho cai pois varios threads não podem acessa-lo simultaneamente. 
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
