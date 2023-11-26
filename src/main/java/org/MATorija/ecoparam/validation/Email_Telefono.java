package org.MATorija.ecoparam.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = Email_TelefonoValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Email_Telefono {
    String message() default "{Email_Telefono.formulario.email}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
