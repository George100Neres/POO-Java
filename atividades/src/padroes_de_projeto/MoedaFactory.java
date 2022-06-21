package padroes_de_projeto;

public class MoedaFactory {
  public static Moeda criarMoeda(Pais pais) {
	
	  if(pais.equals(pais.BRASIL)) {
		  return new Real();
	  }else if(pais.equals(Pais.EUA)) {
		  return new USDolar();
	  }
	  throw new IllegalArgumentException("Nao existe esse pais");
  }
}
