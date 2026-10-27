package com.josema.plataformastreaming.validation;

import java.time.LocalDate;
import java.time.Period;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MayorDeEdadValidator implements ConstraintValidator<MayorDeEdad,LocalDate> {

    @Override
    public boolean isValid(LocalDate fecha, ConstraintValidatorContext context) {
        if(fecha == null){
            return true;
        }

        return Period.between(fecha, LocalDate.now()).getYears() >= 18;
    }
    
}
