package co.edu.org.cropscan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name = "tipodocumento")
public class TipoDocumentoEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="identificador", unique = true)
	private Integer identificador;
	
	@NotBlank(message="el nombre no debe estar vacio en este campo")
	@NotNull(message="el nombre no debe ser null en este campo")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "La cadena debe contener solo letras")
	@Column(unique = true, name="nombre")
	private String nombre;

}
