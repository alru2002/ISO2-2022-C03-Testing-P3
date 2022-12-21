package Testing.Trabajo_P3;

public class Cliente {
	private String nombre;
	private int edad;
	private boolean estudia;
	private boolean independizado;
	private boolean trabaja;

	public Cliente(String nombre, int edad, boolean estudia, boolean independizado, boolean trabaja)
			throws EdadNoValidaException {
		if (edad < 0 || edad > 127)
			throw new EdadNoValidaException("Edad no valida");
		this.edad = edad;
		this.estudia = estudia;
		this.independizado = independizado;
		this.trabaja = trabaja;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws EdadNoValidaException {
		if (edad < 0 || edad > 127)
			throw new EdadNoValidaException("Edad no valida");
		this.edad = edad;
	}

	public boolean isEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

	public boolean isIndependizado() {
		return independizado;
	}

	public void setIndependizado(boolean independizado) {
		this.independizado = independizado;
	}

	public boolean isTrabaja() {
		return trabaja;
	}

	public void setTrabaja(boolean trabaja) {
		this.trabaja = trabaja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
