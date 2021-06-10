package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import es.pildoras.spring.mvc.validaciones.CPostalMadrid;

public class Alumno {
	
	@NotNull
	@Size(min=2, message="Campo requerido")
	private String nombre;
	
	@Min(value=10, message="No se permiten edades menores que 10.")
	@Max(value=100, message="No se permiten edades mayores que 100")
	private int edad;
	
	@Email
	private String email;
	
	private String apellido;
	
	private String optativa;
	
	private String ciudadEstudios;
	
	private String idiomas;
	
	//@Pattern(regexp="[0-9]{5}", message="Formato de c�dgio postal no v�lido")
	@CPostalMadrid
	private String codigoPostal;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
		
	}
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}
