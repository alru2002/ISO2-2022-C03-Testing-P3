package Testing.Trabajo_P3;

import java.util.ArrayList;

public class GestorCuentas {
private ArrayList<Cuenta>cuentas = new ArrayList<Cuenta>();

public GestorCuentas() {
}

public ArrayList<Cuenta> getCuentas() {
	return cuentas;
}

public void NewCuenta(Cliente client) {
	Cuenta cuenta = new Cuenta(client, "",0);
	if(client.getEdad()<18 && client.isEstudia() && !client.isIndependizado()) {
		cuenta.setTipo("Confort");
	}
	else if(client.getEdad()<25 && client.isEstudia() && client.isIndependizado()) {
		cuenta.setTipo("Vamos que tu puedes");
	}
	else if(client.getEdad()>18 && client.isTrabaja() && !client.isIndependizado()) {
		cuenta.setTipo("Ahorra ahora que puedes");
	}
	else if(client.getEdad()>18 && client.isTrabaja() && client.isIndependizado()) {
		cuenta.setTipo("Saltando del nido");
	}
	else if(client.getEdad()>25 && client.isTrabaja() && !client.isIndependizado()) {
		cuenta.setTipo("Independizate que va siendo hora");
	}
	else if(client.getEdad()>25 && client.isTrabaja() && client.isIndependizado()) {
		cuenta.setTipo("Bienvenido a la vida adulta");
	}
	else {
		cuenta.setTipo("25 primaveras");
	}
	cuentas.add(cuenta);
}

}
