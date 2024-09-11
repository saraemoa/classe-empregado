class EmpregadoComissao extends EmpregadoLei{
	private double comissao;

	public EmpregadoComissao(String matricula, String nome, double salarioBase, double comissao){
		super(matricula, nome, salarioBase);
		this.comissao = comissao;
	}

	public double getComissao(){
		return this.comissao;	
	}

	public void setComissao(double comissao){
		this.comissao = comissao;
	}

	public double salarioLiquido(double vendas){
		return super.salarioLiquido() + (vendas * (this.comissao/100)); 
	}

	public void mostrarDados(){
		System.out.print("\n\nMatricula: " + getMatricula() +
						"\nNome: " + getNome() +
						"\nSalario Base: " + getSalario() +
						"\nComissao: " + this.comissao);
	}
}