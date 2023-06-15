package co.edu.org.cropscan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "finca")
public class FincaEntity {

	@Id
	@Column(name = "nit", unique = true)
	private String nit;
	
	@NotBlank
	@NotNull
	@ManyToOne
	@JoinColumn(name = "usuario")
	private UsuarioEntity usuario;
	
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
}
