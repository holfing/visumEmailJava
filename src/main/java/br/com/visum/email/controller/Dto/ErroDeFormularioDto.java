package br.com.visum.email.controller.Dto;

/**
 * @author visum
 *
 */
public class ErroDeFormularioDto {
	
	private String campo;
	private String error;
	
	
	public ErroDeFormularioDto(String campo, String error) {
		super();
		this.campo = campo;
		this.error = error;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
	

}
