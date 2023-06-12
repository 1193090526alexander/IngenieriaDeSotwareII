package co.edu.org.cropscan.service.domain;

public class UsuarioDomain {
	
	private String nombre;
	private String apellido;
	private TipoDocumentoDomain tipodocumento;
	private long documento;
	private long telefono;
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
