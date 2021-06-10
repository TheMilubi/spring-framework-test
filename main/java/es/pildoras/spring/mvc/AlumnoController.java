package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder data) {
		StringTrimmerEditor trim = new StringTrimmerEditor(true);
		data.registerCustomEditor(String.class, trim);
	}
	
	@RequestMapping("formulario")
	public String muestraFormulario(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "AlumnoFormulario";
	}
	
	@RequestMapping("procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("alumno") Alumno alumno, 
			BindingResult resultadoValidacion) {
		if(resultadoValidacion.hasErrors()) {
			return "AlumnoFormulario";
		}else {			
			return "RegistroAlumno";
		}
	}

}
