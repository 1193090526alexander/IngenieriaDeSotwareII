package co.edu.org.cropscan.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "usuario")
public class UsuarioEntity {
	
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
	@ManyToOne
	@JoinColumn(name = "tipodocumento")
	private TipoDocumentoEntity tipodocumento;
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

}
