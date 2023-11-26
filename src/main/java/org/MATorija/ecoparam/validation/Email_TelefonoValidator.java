package org.MATorija.ecoparam.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.MATorija.ecoparam.model.Formulario;

public class Email_TelefonoValidator implements ConstraintValidator<Email_Telefono, Formulario> {

    @Override
    public boolean isValid(Formulario formulario, ConstraintValidatorContext c) {
        String email = formulario.getEmail();
        String telefono = formulario.getTelefono();
        if (email.isEmpty() && telefono.isEmpty()){
            return false;
        }
        return true;
    }
}
