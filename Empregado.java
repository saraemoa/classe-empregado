abstract class Empregado{
	private String matricula, nome;
	private double salarioBase;

	public Empregado(String matricula, String nome, double salarioBase){
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getMatricula(){
		return this.matricula;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public double getSalario(){
		return this.salarioBase;
	}

	public void setSalario(double salarioBase){
		this.salarioBase = salarioBase;
	}

	public double salarioLiquido(){
		return (salarioBase * (1 - 0.11));
	}

	public void mostrarDados(){
		System.out.print("\n\nMatricula: " + this.matricula +
						"\nNome: " + this.nome +
						"\nSalario Base: " + this.salarioBase);
	}

}