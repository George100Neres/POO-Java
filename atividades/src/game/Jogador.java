package game;

public class Jogador {
	
	int vida = 100;
	int y;
	int x;
	
	  boolean atacar(Jogador oponente) {
		  
		  int deltaX = Math.abs(x - oponente.x);
		  int deltaY = Math.abs(y - oponente.y);
		  
		  //Se o Jogador delta X estiber perto do delta Y,eles atacam
		    if(deltaX == 0 && deltaY == 1) {
		    	oponente.vida -= 10;
		    } else if(deltaX == 1 && deltaY == 0) {
		    	oponente.vida -= 10;
		    	return true;
		    } else {
		    	return false;
		    } 
		  
		  return true;
	  }
	 // Se a chamda for direção norte,ira incrementar
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			 x++;
			 break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		
		
		}
		if(direcao == Direcao.NORTE) {
			y++;
		}
		return true;
	}
}
