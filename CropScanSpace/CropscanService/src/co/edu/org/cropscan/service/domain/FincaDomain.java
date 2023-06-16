package co.edu.org.cropscan.service.domain;

public class FincaDomain {
	
	private String nit;
	private UsuarioDomain usuario;
	private String nombre;
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
	public  UsuarioDomain getUsuario() {
		return usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	
	

}
