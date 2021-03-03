package computer;

// criação da classe computador e de seus atributos;
public class Computer {

	String fabricante;
	String modelo;
	int qntdMemoria;
	int qntdHD;
	String processador;
	
	// método construtor padrão
	
	public Computer () {
	
	}
	
	// método construtor com parâmetros
	
	public Computer (String fab, String model, int ram, int hd, String pr) {
		
		setFabricante(fab);
		setModelo(model);
		setQntdMemoria(ram);
		setQntdHD(hd);
		setProcessador(pr);
		
	}
	
	//Método imprimir
	
	public void imprimir() {
				
		System.out.println( this.fabricante);
		System.out.println( this.modelo);
		System.out.println( this.qntdMemoria + " gb de RAM.");
		System.out.println( this.qntdHD + "Gb");
		System.out.println( this.processador);
		System.out.println( "****************");
	}

	//Métodos Getters
	public String getModelo () {
		return this.modelo;
	}

	public String getFabricante () {
		return this.fabricante;
	}

	public int getQntdMemoria () {
		return this.qntdMemoria;
	}

	public int getQntdHD () {
		return this.qntdHD;
	}
	
	public String getProcessador () {
		return this.processador;
	}
	
	// métodos Setters
	public void setFabricante (String f) {
		
		this.fabricante = f;
	}
	
	public void setModelo (String m) {
		
		this.modelo = m;
	}
	
	public void setQntdMemoria (int r) {
	
		this.qntdMemoria = r;
	}
	
	public void setQntdHD (int qnthd) {
		
		this.qntdHD = qnthd;
	}
	
	public void setProcessador (String p) {
		
		this.processador = p;
	}
}


