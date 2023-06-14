package co.edu.org.cropscan.entity;


import jakarta.persistence.Entity;
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
@Table(name = "TipoDocumento")
public class TipoDocumentoEntity {
	
	@Id
	@NotNull
	@NotBlank
	private Integer identificador;
	@NotBlank
	@NotNull
	@Pattern
	private String nombre;

}
