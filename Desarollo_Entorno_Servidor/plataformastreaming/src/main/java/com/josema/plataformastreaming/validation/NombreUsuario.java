package com.josema.plataformastreaming.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NombreUsuarioValidator.class)
public  @interface NombreUsuario {
    String message() default "No puede estar duplicado";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
