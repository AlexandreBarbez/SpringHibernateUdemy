package com.halx.springmvc.model.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Class used for validation, will hold the logic
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//This annotation can be applied to FIELD and METHOD
@Target({ElementType.FIELD, ElementType.METHOD})
//Tell the compiler to keep this on the bytecode so we can use it at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //Allow to group validation together
    Class<?>[] groups() default {};
    //allow to add some info about the valdiation error
    Class<? extends Payload>[] payload() default {};

    // define default course code
    public String value() default "LUV";

    public String message() default "must start with LUV";
}
