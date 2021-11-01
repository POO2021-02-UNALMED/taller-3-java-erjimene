package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV = 0;
	
	TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;		
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.estado == true) {
			if (this.canal>0 && this.canal<120) {
				this.canal ++;
			}					
		}
		else {
			this.estado = true;
			if (this.canal>0 && this.canal<120) {
				this.canal ++;
			}
		}		
	}
	
	public void canalDown() {
		if (this.estado == true) {
			if (this.canal>1 && this.canal<=120) {
				this.canal --;
			}					
		}
		else {
			this.estado = true;
			if (this.canal>1 && this.canal<=120) {
				this.canal --;
			}
		}
		
	}
	
	public void volumenUp() {
		if (this.estado == true) {
			if (this.volumen>=0 && this.volumen<7) {
				this.volumen ++;
			}					
		}/*
		else {
			this.estado = true;
			if (this.volumen>=0 && this.volumen<7) {
				this.volumen ++;
			}
		}*/
		
	}
	
	public void volumenDown() {
		if (this.estado == true) {
			if (this.volumen>1 && this.volumen<=7) {
				this.volumen --;
			}					
		}/*
		else {
			this.estado = true;
			if (this.volumen>1 && this.volumen<07) {
				this.volumen --;
			}
		}*/
	}

}
