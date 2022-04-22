/*
 * 	@Author: Gabriel Siqueira Dos Santos
 *  Implementação: Padrão Singleton, Inicialização Lenta.
 * 
 * 	Resumo: O objeto é criado apenas se necessário. Isso evita o desperdício de recursos, é recomendável o uso apenas
 * 			em ambientes de thread única.
 * 	
 *  Prós: Evita o desperdício de recursos, é possível tratar exceções, não pode acessar a instância diretamente.
 *  Contras: Não recomendável o uso em ambientes multithread, pois pode quebrar a propiedade do Singleton. 
 *  		 Verificação da condição de nulo toda vez, 
 * */


package br.com.padroesdeprojetossingleton.blocoestatico;

public class SingletonBlocoEstatico {
	private static SingletonBlocoEstatico instancia;
	
	
	private SingletonBlocoEstatico() {
		//Construtor privado para garantir a propiedade da instância
	}
	
	//método estático para referência a instancia em toda a aplicação
	public static SingletonBlocoEstatico getInstancia() {
		 if(instancia == null) {
			 instancia = new SingletonBlocoEstatico();
		 }
		 
		 return instancia;
		 
	}
	
}
