package com.javaSenior.Day36;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD,TYPE,CONSTRUCTOR})
public @interface MyAnnotation {
    String value() default "hello";
}
