package padroes_de_projeto;

public interface Moeda {

	  String getSimbolo();
}

class Real implements Moeda {

	@Override
	public String getSimbolo() {
		
		return "RS";
		
	}
}

class USDolar implements Moeda {

	@Override
	public String getSimbolo() {
		// TODO Auto-generated method stub
		return "USD";
	}
	
}