import java.util.HashMap;
import java.util.Map;
public class Passwd {
    public Map<Boolean, String> verificarPass(String contrasenya) {
        Map<Boolean, String> errorPass = new HashMap<>();
        boolean tieneMayus = false, tieneEspecial = false, tieneOcho = false, tieneDosNumeros = false;

        if (contrasenya.length() < 8) {
            errorPass.put(false, "La contrasenya ha de tenir almenys 8 caràcters\n");
        } else {
            tieneOcho = true;
        }

        for (int i = 0; i < contrasenya.length(); i++) {
            char caracter = contrasenya.charAt(i);

            if (Character.isDigit(caracter)) {
                tieneDosNumeros = tieneDosNumeros || (contrasenya.replaceAll("[^0-9]", "").length() >= 2);
            }

            if (Character.isUpperCase(caracter)) {
                tieneMayus = true;
            }

            if (contrasenya.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
                tieneEspecial = true;
            }
        }

        if (!tieneDosNumeros) {
            errorPass.put(false, "La contrasenya ha de tenir almenys 2 números\n");
        }

        if (!tieneMayus) {
            errorPass.put(false, "La contrasenya ha de contenir almenys una lletra majúscula\n");
        }

        if (!tieneEspecial) {
            errorPass.put(false, "La contrasenya ha de contenir almenys un caràcter especial\n");
        }

        if (tieneOcho && tieneDosNumeros && tieneMayus && tieneEspecial) {
            errorPass.put(true, "");
        }

        return errorPass;
    }

}