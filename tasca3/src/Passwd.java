import java.util.HashMap;
import java.util.Map;
public class Passwd {
    public Map<Boolean, String> verificarPass(String contrasenya) {
        char caracter;
        int numDigit = 0;
        Map<Boolean, String> errorPass = new HashMap<>();
        boolean tieneNumeros = false, tieneMayus = false, tieneEspecial = false,
                tieneOcho = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            caracter = contrasenya.charAt(i);
            if (contrasenya.length() == 8) {
                tieneOcho = true;
            } else {
                errorPass.put(false, "Debe de ser mayor de 8 carácteres.");
                return errorPass;
            }
            if (Character.isDigit(caracter)) {
                numDigit++;
                if (numDigit == 2) {
                    tieneNumeros = true;
                }
            } else {
                errorPass.put(false, "Debe de contener 2 números como minimo.");
                return errorPass;
            }
            if (Character.isUpperCase(caracter)) {
                tieneMayus = true;
            } else {
                errorPass.put(false, "Debe de contener una mayúscula como minimo.");
                return errorPass;
            }
            if (contrasenya.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
                tieneEspecial = true;
            } else {
                errorPass.put(false, "Debe de contener algún caracter especial.");
                return errorPass;
            }
        }
        if (tieneNumeros == true && tieneMayus == true && tieneOcho == true && tieneEspecial == true) {
            errorPass.put(true, "Contraseña válida.");
            return errorPass;
        } else {
            errorPass.put(false, "La contraseña es inválida.");
            return errorPass;
        }
    }
}