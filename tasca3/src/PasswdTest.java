import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PasswdTest {

    @Test
    public void testVerificarPass1() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("");

        assertEquals(null, result.get(true));
    }
    @Test
    public void test2(){
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("hola");

        assertEquals(null, result.get(true));
    }
    @Test
    public void test3(){
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("holacaracola");

        assertEquals(null, result.get(true));
    }
    @Test
    public void test4(){
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, " La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("hola12");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass5() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("holA");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass6() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys una lletra majúscula");

        Map<Boolean, String> result = test.verificarPass ("hola!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass7() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números");

        Map<Boolean, String> result = test.verificarPass ("holaA!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass8() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys una lletra majúscula");

        Map<Boolean, String> result = test.verificarPass ("hola12!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass9() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("hola12A");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass10() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("holacaracola12");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass11() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys una lletra majúscula");

        Map<Boolean, String> result = test.verificarPass ("holacaracola!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass12() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys 2 números\nLa contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("holacaracolA");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass13() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de tenir almenys 8 caràcters");

        Map<Boolean, String> result = test.verificarPass ("ho12A!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass14() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys 2 números");

        Map<Boolean, String> result = test.verificarPass ("holacaracolaA!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass15() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys una lletra majúscula");

        Map<Boolean, String> result = test.verificarPass ("holacaracola12!");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass16() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(false, "La contrasenya ha de contenir almenys un caràcter especial");

        Map<Boolean, String> result = test.verificarPass ("holacaracola12A");

        assertEquals(null, result.get(true));
    }
    @Test
    public void testVerificarPass17() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(true, "");

        Map<Boolean, String> result = test.verificarPass ("holacaracola12A!");

        assertEquals("", result.get(true));
    }
    @Test
    public void testVerificarPass18() {
        Passwd test = new Passwd();
        Map<Boolean, String> expected = new HashMap<>();
        expected.put(true, "");

        Map<Boolean, String> result = test.verificarPass ("#P4blit0cl4v0uncl4vit0#");

        assertEquals("", result.get(true));
    }

}