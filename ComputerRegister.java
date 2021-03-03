package computer;

public class ComputerRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Instanciamento dos 4 objetos do requisito.
	
	Computer pc1 = new Computer();
	Computer pc2 = new Computer();
	Computer pc3 = new Computer("HP", "XPT01", 8, 1024, "Core i5 Geração 10");
	Computer pc4 = new Computer("ASUS", "AS45XL", 16, 1024, "Core i7 Geração 10");
	
	// cadastro de itens a partir de construtor sem parâmetro
	pc1.fabricante = "DELL";
	pc1.modelo = "STANDARD";
	pc1.qntdHD = 500;
	pc1.qntdMemoria = 4;
	pc1.processador = "Celeron 2.0 ghZ";
	
	pc2.fabricante = "HP";
	pc2.modelo = "STANDARD";
	pc2.qntdHD = 500;
	pc2.qntdMemoria = 4;
	pc2.processador = "Core I3 Geração 7";
	
			
	// chamando o método impressao
	pc1.imprimir();
	pc2.imprimir();
	pc3.imprimir();
	pc4.imprimir();

	}
}