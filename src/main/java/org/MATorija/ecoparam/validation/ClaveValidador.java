package org.MATorija.ecoparam.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.MATorija.ecoparam.model.Formulario;

public class ClaveValidador implements ConstraintValidator<CoincidenciaClaves, Formulario> {

    @Override
    public boolean isValid(Formulario formulario, ConstraintValidatorContext c){
        String clave = formulario.getClave();
        String confirmarClave = formulario.getConfirmarClave();
        return clave.equals(confirmarClave);
    }
}
