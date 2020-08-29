package com.citi.cpb.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(FIELD)
public @interface NPII {
	public String value() default "NPII";
}
