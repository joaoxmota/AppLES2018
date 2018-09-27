package ipro.les2018.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {


    public boolean validaEmail(String email){
        String emailRegex = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        Pattern pattern = Pattern.compile ( emailRegex, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher ( email );
        return matcher.find ();
    }

    public boolean validaSenha(String senha){
        String passwordRegex = "((?=.*[a-z].{6,20}))";
        Pattern pattern = Pattern.compile ( passwordRegex, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher ( senha );
        return matcher.find ();
    }
}
