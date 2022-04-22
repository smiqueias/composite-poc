package br.com.padroesdeprojetossingleton;

import br.com.padroesdeprojetossingleton.antecipada.SingletonAntecipada;
import br.com.padroesdeprojetossingleton.billpugh.Singleton;
import br.com.padroesdeprojetossingleton.blocoestatico.SingletonBlocoEstatico;
import br.com.padroesdeprojetossingleton.threadsafe.SingletonThreadSafe;

public class Cliente {
	
	SingletonAntecipada antecipada = SingletonAntecipada.getInstancia();
	SingletonBlocoEstatico blocoEstatico = SingletonBlocoEstatico.getInstancia();
	SingletonThreadSafe threadSafe = SingletonThreadSafe.getInstancia();
	Singleton billPugh = Singleton.getInstancia();	
}
