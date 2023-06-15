package co.edu.org.cropscan.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class FincaDomain {
	
	@Id
	@NotBlank
	@NotNull
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String nit;
	@NotBlank
	@NotNull
	private UsuarioDomain usuario;
	@NotBlank
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$", message = "La cadena debe contener solo letras")
	@Column(name="nombre")
	private String nombre;
	@NotBlank
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$", message = "La cadena debe contener solo letras")
	@Column(name="direccion")
	private String direccion;
	
	private void setNit(String nit) {
		this.nit = nit;
	}
	private void setUsuario(UsuarioDomain usuario) {
		this.usuario = usuario;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNit() {
		return nit;
	}
	public UsuarioDomain getUsuario() {
		return usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	
	

}
