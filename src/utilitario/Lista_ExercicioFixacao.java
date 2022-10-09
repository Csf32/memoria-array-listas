package utilitario;

public class Lista_ExercicioFixacao {

	Integer id;
	String nome;
	Double salario;
	
	
	public Lista_ExercicioFixacao() {
		
	}

	public Lista_ExercicioFixacao(Integer id, String nome, Double salario) {
	
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
		
	}
	
	public void aumentarsalario(double aumento) {
		salario = salario + salario * aumento /100;
		
	}
	
	public String toString() {
		return nome
			+ "" + "," +" " + "Id" + ":" + id  + ": " + "Nome" + ": "
			+ nome
			+ " "
			+ "Salario"
			+ ": "
			+ salario;
		
	}
	
	public String toString1() {
		return nome
			+ "" + "," +" " + "Id" + ":" + id  + ": " + "Nome" + ": "
			+ nome
			+ " "
			+ "Salario"
			+ ": "
			+ salario;
		
	}


}

