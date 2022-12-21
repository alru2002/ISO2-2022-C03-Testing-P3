package Testing.Trabajo_P3;

public class Cuenta {
	private Cliente propietario;
	private String tipo;
	private float saldo;

	public Cuenta(Cliente propietario, String tipo, float saldo) {
		this.propietario = propietario;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public Cliente getPropietario() {
		return propietario;
	}

	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
