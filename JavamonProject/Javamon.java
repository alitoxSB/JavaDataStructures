package javamon;

public class Javamon {

	private String nombre;
	private int experiencia;
	private int ataqueSup;
	private int ataqueMid;
	private int ataqueLow;
	private int defSup;
	private int defMid;
	private int defLow;
	private int ataqueEsp;
	private TipoAtaque tipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getAtaqueSup() {
		return ataqueSup;
	}
	public void setAtaqueSup(int ataqueSup) {
		this.ataqueSup = ataqueSup;
	}
	public int getAtaqueMid() {
		return ataqueMid;
	}
	public void setAtaqueMid(int ataqueMid) {
		this.ataqueMid = ataqueMid;
	}
	public int getAtaqueLow() {
		return ataqueLow;
	}
	public void setAtaqueLow(int ataqueLow) {
		this.ataqueLow = ataqueLow;
	}
	public int getDefSup() {
		return defSup;
	}
	public void setDefSup(int defSup) {
		this.defSup = defSup;
	}
	public int getDefMid() {
		return defMid;
	}
	public void setDefMid(int defMid) {
		this.defMid = defMid;
	}
	public int getDefLow() {
		return defLow;
	}
	public void setDefLow(int defLow) {
		this.defLow = defLow;
	}
	public int getAtaqueEsp() {
		return ataqueEsp;
	}
	public void setAtaqueEsp(int ataqueEsp) {
		this.ataqueEsp = ataqueEsp;
	}
	
	public TipoAtaque getTipo() {
		return tipo;
	}
	public void setTipo(TipoAtaque tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "| Javamon [nombre=" + nombre + ", experiencia=" + experiencia + ", ataqueSup=" + ataqueSup
				+ ", ataqueMid=" + ataqueMid + ", ataqueLow=" + ataqueLow + ", defSup=" + defSup + ", defMid=" + defMid
				+ ", defLow=" + defLow + ", ataqueEsp=" + ataqueEsp + ", tipo=" + tipo + "]";
	}
	public String toCSVLine() {
		return " Javamon [nombre=" + nombre + ", experiencia=" + experiencia + ", ataqueSup=" + ataqueSup
				+ ", ataqueMid=" + ataqueMid + ", ataqueLow=" + ataqueLow + ", defSup=" + defSup + ", defMid=" + defMid
				+ ", defLow=" + defLow + ", ataqueEsp=" + ataqueEsp + ", tipo=" + tipo + "]";
	}
	
	
}
