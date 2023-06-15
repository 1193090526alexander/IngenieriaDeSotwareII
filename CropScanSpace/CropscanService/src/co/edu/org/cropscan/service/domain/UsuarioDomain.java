package co.edu.org.cropscan.service.domain;

import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Component
public class UsuarioDomain {
	
	@NotBlank
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$", message = "La cadena debe contener solo letras")
	private String nombre;
	@NotBlank
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]+$", message = "La cadena debe contener solo letras")
	private String apellido;
	@NotBlank
	@NotNull
	private TipoDocumentoDomain tipodocumento;
	@Id
	@Column(name="documento", unique = true)
    @Pattern(regexp = "^[0-9]+$", message = "La cadena debe contener solo números")
	private long documento;
    @Pattern(regexp = "^[0-9]+$", message = "La cadena debe contener solo números")
	private long telefono;
	@Email
	@Column(unique = true, name="correo")
	private String correo;
	private String contrasena;
	
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private void setTipodocumento(TipoDocumentoDomain tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	private void setDocumento(long documento) {
		this.documento = documento;
	}
	private void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	private void setCorreo(String correo) {
		this.correo = correo;
	}
	private void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public TipoDocumentoDomain getTipodocumento() {
		return tipodocumento;
	}
	public long getDocumento() {
		return documento;
	}
	public long getTelefono() {
		return telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public String getContrasena() {
		return contrasena;
	}

	
}
