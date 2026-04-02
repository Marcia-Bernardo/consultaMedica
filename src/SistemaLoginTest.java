import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaLoginTest {
    //Baby step

    @Test
    public void deveAutenticarUtilizadorValido(){
        SistemaLogin login = new SistemaLogin();

        boolean resultado = login.autenticar("admin","8976");
        assertTrue(resultado);
    }

    @Test
    public void deveRejeitarUtilizadorInvalidor(){
        SistemaLogin login = new SistemaLogin();

        boolean resultado= login.autenticar("user","9999");
        assertFalse(resultado);
    }

}
