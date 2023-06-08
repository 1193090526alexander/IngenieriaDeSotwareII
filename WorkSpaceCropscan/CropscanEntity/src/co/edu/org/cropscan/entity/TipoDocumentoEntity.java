package co.edu.org.cropscan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TipoDocumento")
public class TipoDocumentoEntity {
	
	@Id
	private Integer identificador;
	private String nombre;

}
