package co.edu.org.cropscan.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "usuario")
public class UsuarioEntity {
	
	private String nombre;
	private String apellido;
	@ManyToOne
	@JoinColumn(name = "tipodocumento")
	private TipoDocumentoEntity tipodocumento;
	@Id
	private long documento;
	private long telefono;
	@Email
	private String correo;
	private String contrasena;

}
