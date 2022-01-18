package org.pihotans.validations;

import org.pihotans.annotations.PasswordMatches;
import org.pihotans.payload.request.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {

        SignupRequest userSignupRequest = (SignupRequest) obj;
        return userSignupRequest.getPassword().equals(userSignupRequest.getConfirmPassword());
    }
}
