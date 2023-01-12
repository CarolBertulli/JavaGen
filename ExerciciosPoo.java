package POO;

public class ExerciciosPoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// primeiro exercicio



public class Funcionario {
// Atributos funcionario
private String nome; 
private String cargo;
private int idade;
private float salario;
private int bancoHoras;

// Metodo construtor 

public Funcionario(String nome, String cargo, int idade, float salario, int bancoHoras) {
	super();
	this.nome = nome;
	this.cargo = cargo;
	this.idade = idade;
	this.salario = salario;
	this.bancoHoras = bancoHoras;
	
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public int getidade() {
	return idade;
}

public void setidade(int idade) {
	this.idade = idade;
}

public double getSalario() {
	return salario;
}

public void setSalario(float salario) {
	this.salario = salario;
}

public int getBancoHoras() {
	return bancoHoras;
}

public void setBancoHoras(int bancoHoras) {
	this.bancoHoras = bancoHoras;
}
 public void vizualizar() {
	System.out.println("Nome da contratada: " +getNome());
	 
	System.out.println("Cargo da contratada: " +getCargo());
	
	System.out.println("Idade da contratada: " +getidade());
	
	System.out.println("Salario da contratada: " +getSalario());
	
	System.out.println("Horas semanais: " +getBancoHoras());
	
	
	

}



public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario Fun = new Funcionario("Paula","Secretaria",26,2100,44); 
		
		System.out.println("***Novo contrato***");
		
		Fun.vizualizar();
		
		
		
		
		

	}

}


// segundo exercicio





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

public class testeFarmacia {

	public static void main(String[] args) {
	
		Farmacia far = new Farmacia("Dorflex", "Kaiak","Dove","Vult","Whey");
		
		System.out.println("***Novos produtos***");
		
		far.vizualizar();
		
	}

}


