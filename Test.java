import lab.padroes.projeto.java.facade.Facade;
import lab.padroes.projeto.java.singleton.SingletonEager;
import lab.padroes.projeto.java.singleton.SingletonLazy;
import lab.padroes.projeto.java.singleton.SingletonLazyHolder;
import lab.padroes.projeto.java.strategy.Comportamento;
import lab.padroes.projeto.java.strategy.ComportamentoAgressivo;
import lab.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import lab.digitalinnovation.gof.strategy.ComportamentoNormal;
import lab.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}