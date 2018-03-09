/**
 * 
 */
package Inmueble;

/**
 * @author eps
 *
 */
public class Direccion {
	private String codigoPostal;
	private String localidad;
	private String calle;
	
	/**
	 * @param codigoPostal
	 * @param localidad
	 * @param calle
	 */
	public Direccion(String codigoPostal, String localidad, String calle) {
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.calle = calle;
	}
	
	public String getCP() {
		return codigoPostal;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public String getCalle() {
		return calle;
	}
	
}
