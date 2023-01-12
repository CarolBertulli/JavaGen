package POO;

public class Farmacia {

	
	private String remedios;
	private String cosmeticos;
	private String higiene;
	private String maquiagem;
	private String vitaminasSuplementos;
	public Farmacia(String remedios, String cosmeticos, String higiene, String maquiagem, String vitaminasSuplementos) {
		
		
		this.remedios = remedios;
		this.cosmeticos = cosmeticos;
		this.higiene = higiene;
		this.maquiagem = maquiagem;
		this.vitaminasSuplementos = vitaminasSuplementos;
		
		
	}
	public String getRemedios() {
		return remedios;
	}
	public void setRemedios(String remedios) {
		this.remedios = remedios;
	}
	public String getCosmeticos() {
		return cosmeticos;
	}
	public void setCosmeticos(String cosmeticos) {
		this.cosmeticos = cosmeticos;
	}
	public String getHigiene() {
		return higiene;
	}
	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}
	public String getMaquiagem() {
		return maquiagem;
	}
	public void setMaquiagem(String maquiagem) {
		this.maquiagem = maquiagem;
	}
	public String getVitaminasSuplementos() {
		return vitaminasSuplementos;
	}
	public void setVitaminasSuplementos(String vitaminasSuplementos) {
		this.vitaminasSuplementos = vitaminasSuplementos;
	}
	public void vizualizar() {
		
	System.out.println("Remedios: " +getRemedios() );
	System.out.println("Cosmeticos: " +getCosmeticos());
	System.out.println("Higiene: " +getHigiene());
	System.out.println("Maquiagem: " +getMaquiagem());
	System.out.println("Vitaminas e Suplimentos: " +getVitaminasSuplementos());
	
	}
}

