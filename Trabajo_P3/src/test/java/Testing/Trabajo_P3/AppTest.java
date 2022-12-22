package Testing.Trabajo_P3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

	@Test()
	public void eachUse1() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", -5, true, true, true));

	}

	@Test()
	public void eachUse2() {
		assertThrows(IndependenciaNoValidaException.class, () -> new Cliente("Paco", 15, false, true, true));

	}

	@Test()
	public void eachUse3() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 18, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test()
	public void eachUse4() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test()
	public void eachUse5() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 25, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test()
	public void eachUse6() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 65, false, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test()
	public void eachUse7() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", 234, true, false, true));
	}

	@Test()
	public void PairWise1() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", -5, true, true, true));

	}

	@Test()
	public void PairWise2() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", -5, false, false, false));

	}

	@Test()
	public void PairWise3() {
		assertThrows(IndependenciaNoValidaException.class, () -> new Cliente("Paco", 15, true, true, true));
	}

	@Test()
	public void PairWise4() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 15, false, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test()
	public void PairWise5() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 18, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Vamos que tu puedes", cuent.getTipo());
	}

	@Test()
	public void PairWise6() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 18, false, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test()
	public void PairWise7() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 18, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Vamos que tu puedes", cuent.getTipo());
	}

	@Test
	public void pairwise8() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test
	public void pairwise9() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 25, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test
	public void pairwise10() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 25, false, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test
	public void pairwise11() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 65, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}

	@Test
	public void pairwise12() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 65, false, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("ordinaria", cuent.getTipo());
	}

	@Test
	public void pairwise13() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", 234, true, true, true));
	}

	@Test
	public void pairwise14() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", 234, false, false, false));
	}

	@Test
	public void Decisiones1() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Confort", cuent.getTipo());
	}

	@Test
	public void Decisiones3() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 17, false, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Vamos que tu puedes", cuent.getTipo());
	}

	@Test
	public void Decisiones5() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 17, false, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Ahorra ahora que puedes", cuent.getTipo());
	}

	@Test
	public void Decisiones7() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Saltando del nido", cuent.getTipo());
	}

	@Test
	public void Decisiones9() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Independizate que va siendo hora", cuent.getTipo());
	}
	
	@Test
	public void Decisiones11() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}
	@Test
	public void decisiones13() {
		assertDoesNotThrow(() -> new Cliente("Paco", 20, true, true, true));
	}
	@Test
	public void decisiones15() {
		assertDoesNotThrow(() -> new Cliente("Paco", 20, true, false, true));
	}

	@Test
	public void decisiones2() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 15, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Confort", cuent.getTipo());
	}

	@Test
	public void decisiones4() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, true, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Vamos que tu puedes", cuent.getTipo());
	}

	@Test
	public void decisiones6() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Ahorra ahora que puedes", cuent.getTipo());
	}

	@Test
	public void decisiones8() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 20, false, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Saltando del nido", cuent.getTipo());
	}

	@Test
	public void decisiones10() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 65, false, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Independizate que va siendo hora", cuent.getTipo());
	}

	@Test
	public void decisiones12() throws IndependenciaNoValidaException, EdadNoValidaException {
		Cliente client = new Cliente("Paco", 65, false, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}

	@Test
	public void decisiones14() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", 234, true, true, true));
	}

	@Test
	public void decisiones16() {
		assertThrows(IndependenciaNoValidaException.class, () -> new Cliente("Paco", 15, false, true, false));
	}
	@Test
	public void McDc1() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Confort", cuent.getTipo());
	}
	@Test
	public void McDc2() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 15, false, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Confort", cuent.getTipo());
	}
	@Test
	public void McDc3() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 17, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Confort", cuent.getTipo());
	}
	
	@Test
	public void McDc4() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 15, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Confort", cuent.getTipo());
	}
	@Test
	public void McDc5() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Vamos que tu puedes", cuent.getTipo());
	}
	@Test
	public void McDc6() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, false, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Vamos que tu puedes", cuent.getTipo());
	}
	@Test
	public void McDc7() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Vamos que tu puedes", cuent.getTipo());
	}
	@Test
	public void McDc8() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Vamos que tu puedes", cuent.getTipo());
	}
	@Test
	public void McDc9() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 17, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Ahorra ahora que puedes", cuent.getTipo());
	}
	@Test
	public void McDc10() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Ahorra ahora que puedes", cuent.getTipo());
	}
	@Test
	public void McDc11() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Ahorra ahora que puedes", cuent.getTipo());
	}
	@Test
	public void McDc12() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Ahorra ahora que puedes", cuent.getTipo());
	}
	
	@Test
	public void McDc13() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 17, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Saltando del nido", cuent.getTipo());
	}
	@Test
	public void McDc14() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Saltando del nido", cuent.getTipo());
	}
	
	@Test
	public void McDc15() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Saltando del nido", cuent.getTipo());
	}
	@Test
	public void McDc16() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, false, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Saltando del nido", cuent.getTipo());
	}
	@Test
	public void McDc17() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 15, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Independizate que va siendo hora", cuent.getTipo());
	}
	@Test
	public void McDc18() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, false, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Independizate que va siendo hora", cuent.getTipo());
	}
	@Test
	public void McDc19() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Independizate que va siendo hora", cuent.getTipo());
	}
	@Test
	public void McDc20() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Independizate que va siendo hora", cuent.getTipo());
	}
	
	@Test
	public void McDc21() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 20, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}
	@Test
	public void McDc22() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, true, false);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}
	@Test
	public void McDc23() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, false, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertNotEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}
	@Test
	public void McDc24() throws IndependenciaNoValidaException, EdadNoValidaException{
		Cliente client = new Cliente("Paco", 65, true, true, true);
		GestorCuentas g = new GestorCuentas();
		Cuenta cuent = g.NewCuenta(client);
		assertEquals("Bienvenido a la vida adulta", cuent.getTipo());
	}
	@Test
	public void McDc25() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", -5, true, true, true));
	}
	@Test
	public void McDc26() {
		assertThrows(EdadNoValidaException.class, () -> new Cliente("Paco", 234, true, true, true));
	}
	@Test
	public void McDc27() {
	assertDoesNotThrow(() -> new Cliente("Paco", 15, true, false, true));
	}
	@Test
	public void McDc28() {
	assertDoesNotThrow(() -> new Cliente("Paco", 15, false, false, false));
	}
	
	@Test
	public void McDc29() {
		assertThrows(IndependenciaNoValidaException.class, () -> new Cliente("Paco", 15, false, true, false));
	}

	
}