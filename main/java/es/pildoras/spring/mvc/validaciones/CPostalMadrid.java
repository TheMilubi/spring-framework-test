package es.pildoras.spring.mvc.validaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPostalMadridValidacion.class)//Futura clase que contendr� la l�gica de la validaci�n
@Target({ElementType.METHOD, ElementType.FIELD})//Destino de anotacion es metodo o campo
@Retention(RetentionPolicy.RUNTIME)//Tiempo de comprobaci�n: en ejecuci�n
public @interface CPostalMadrid {
	
	public String value() default "28";
	
	public String message() default "Debe comenzar por 28";
	
	Class<?> [] groups() default {};
	
	Class<? extends Payload> [] payload() default {};

}
