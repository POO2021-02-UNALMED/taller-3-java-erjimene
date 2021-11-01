package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		setNumTV(getNumTV()+1);
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
		if (estado == true && canal>=1 && canal<=120) {			
			this.canal = canal;
		}
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
		if (estado == true && volumen>=0 && volumen<=7){
			this.volumen = volumen;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		if (estado == false) {
			this.estado = true;
		}
	}
	
	public void turnOff() {
		if (estado == true) {
			this.estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (this.estado == true) {
			if (this.canal>0 && this.canal<120) {
				this.canal ++;
			}					
		}/*
		else {
			this.estado = true;
			if (this.canal>0 && this.canal<120) {
				this.canal ++;
			}
		}*/		
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public void canalDown() {
		if (this.estado == true) {
			if (this.canal>1 && this.canal<=120) {
				this.canal --;
			}					
		}/*
		else {
			this.estado = true;
			if (this.canal>1 && this.canal<=120) {
				this.canal --;
			}
		}*/
		
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
