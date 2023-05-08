import java.util.HashMap;
import java.util.Map;
public class Passwd {
    public Map<Boolean, String> verificarPass(String contrasenya) {
        char caracter;
        int numDigit = 0;
        Map<Boolean, String> errorPass = new HashMap<>();
        boolean tieneMayus = false, tieneEspecial = false, tieneOcho = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            caracter = contrasenya.charAt(i);
            if (contrasenya.length() >= 8) {
                tieneOcho = true;
            } else {
                errorPass.put(false, "La contrasenya ha de tenir almenys 8 caràcters");
            }
            if (Character.isDigit(caracter)) {
                numDigit++;
            } else {
                errorPass.put(false, "La contasenya ha de tenir almenys 2 números");
            }
            if (Character.isUpperCase(caracter)) {
                tieneMayus = true;
            } else {
                errorPass.put(false, "La contrasenya ha de contenir almenys una lletra majúscula");
            }
            if (contrasenya.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
                tieneEspecial = true;
            } else {
                errorPass.put(false, "La contrasenya ha de contenir almenys un caràcter especial");
            }
        }
        if (numDigit >= 2 && tieneMayus && tieneEspecial && tieneOcho) {
            errorPass.put(true, "Contraseña válida.");
        } else {
            errorPass.put(false, "La contraseña es inválida");
        }
        return errorPass;
    }
}