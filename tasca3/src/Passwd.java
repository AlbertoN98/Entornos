import java.util.HashMap;
import java.util.Map;
public class Passwd {
    public Map<Boolean, String> verificarPass(String contrasenya) {
        char caracter;
        int numDigit = 0;
        Map<Boolean, String> errorPass = new HashMap<>();
        boolean tieneMayus = false, tieneEspecial = false, tieneOcho = false;
        boolean errorOcho = false, errorDigitos = false, errorMayus = false, errorEspecial = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            caracter = contrasenya.charAt(i);
            if (contrasenya.length() >= 8) {
                tieneOcho = true;
            } else {
                errorOcho = true;
            }
            if (Character.isDigit(caracter)) {
                numDigit++;
            } else {
                errorDigitos = true;
            }
            if (Character.isUpperCase(caracter)) {
                tieneMayus = true;
            } else {
                errorMayus = true;
            }
            if (contrasenya.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
                tieneEspecial = true;
            } else {
                errorEspecial = true;
            }
        }
        if (numDigit >= 2 && tieneMayus && tieneEspecial && tieneOcho) {
            errorPass.put(true, "");
        } else {
            if (errorOcho) {
                errorPass.put(false, "La contraseña debe tener al menos 8 caracteres");
            }
            if (errorDigitos) {
                errorPass.put(false, "La contraseña debe tener al menos 2 dígitos");
            }
            if (errorMayus) {
                errorPass.put(false, "La contraseña debe tener al menos una letra mayúscula");
            }
            if (errorEspecial) {
                errorPass.put(false, "La contraseña debe tener al menos un carácter especial");
            }
        }
        return errorPass;
    }

}