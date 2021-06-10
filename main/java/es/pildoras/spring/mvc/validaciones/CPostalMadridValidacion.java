package es.pildoras.spring.mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

	
	@Override
	public void initialize(CPostalMadrid constraintAnnotation) {
		prefijoCPMadrid = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean valido;
		
		if(arg0!=null) valido = arg0.startsWith(prefijoCPMadrid);
		else valido=true;
		return valido;
	}
	
	private String prefijoCPMadrid;
}
