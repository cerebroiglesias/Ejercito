
public class Soldados{
	
	private int rango;
	TipoSoldado tipo;
	private double velocidad;
	
	public Soldados(int rango,TipoSoldado tipo, double velocidad){
		this.rango = rango;
		this.tipo = tipo;
		this.velocidad = velocidad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public TipoSoldado getTipo() {
		return tipo;
	}

	public void setTipo(TipoSoldado tipo) {
		this.tipo = tipo;
	}
	
}
