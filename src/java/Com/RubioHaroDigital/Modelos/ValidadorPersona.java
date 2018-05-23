package Com.RubioHaroDigital.Modelos;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ValidadorPersona implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Persona.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Persona p = (Persona) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Nombre", "required.Nombre","El campo es obligatorio.");
    }

}
