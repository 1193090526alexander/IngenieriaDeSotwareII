package co.edu.org.cropscan.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class TipoDocumentoDomain {

	private Integer identificador;
	private String nombre;
	
	
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public String getNombre() {
		return nombre;
	}
	
}
