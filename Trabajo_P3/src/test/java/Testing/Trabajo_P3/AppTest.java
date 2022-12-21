package Testing.Trabajo_P3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
    
  @Test
  public void eachUse1() {
    assertThrows(EdadNoValidaException.class,() -> new Cliente("Paco",-5,true,true,true));
    
}
}