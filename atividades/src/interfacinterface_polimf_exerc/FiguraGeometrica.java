package interfacinterface_polimf_exerc;

/* 1) Escreva uma classe FiguraGeometrica com atributos nome e cor,Escreva uma classe
 * Figura 2D e uma classe Figura 3D.Ambas classes Figura 2D e FIgura 3D são subclasses
 * da classe FiguraGeometrica.Crie ainda as classes Circulo, QUadrado e Triangulo que estendem
 * a classe Figura2D e cire também as classes Cubo e Cilindro e Piramide que estendem a classe Figura 3D.
 * 
 * 
 *2)Escreva a Interface Dimensao Superficial que contém o método calcularArea.
 *Escreva a interface DimensaoVolumetrica que contém o método
 *calcularVolume.Aplique a interface DimensaoSuperficial em todas as subclasses
 *de Figura2D e Figura3D e aplique a interface DimensaoVolumetrica nas subclassses
 *de Figura3D, implementando seus métodos de acordo com as regras de cada figura
 *geométrica(crei os atributos necessários.) 
 */
public class FiguraGeometrica {
	
	private String nome;
	private String cor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
