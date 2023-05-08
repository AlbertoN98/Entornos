import java.util.HashMap;
import java.util.Map;
public class Passwd {
    public Map<Boolean, String> verificarPass(String contrasenya) {
        char caracter;
        int numDigit = 0;
        Map<Boolean, String> errorPass = new HashMap<>();
        boolean tieneMayus = false, tieneEspecial = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            caracter = contrasenya.charAt(i);
            if (Character.isDigit(caracter)) {
                numDigit++;
            }
            if (Character.isUpperCase(caracter)) {
                tieneMayus = true;
            }
            if (contrasenya.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
                tieneEspecial = true;
            }
        }
        if (numDigit >= 2 && tieneMayus && tieneEspecial && contrasenya.length() >= 8) {
            errorPass.put(true, "Contraseña válida.");
        } else {
            errorPass.put(false, "La contraseña es inválida");
        }
        return errorPass;
    }
}