package co.edu.org.cropscan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "finca")
public class FincaEntity {

	@Id
	private String nit;
	@ManyToOne
	@JoinColumn(name = "usuario")
	private UsuarioEntity usuario;
	private String nombre;
	private String direccion;
}
