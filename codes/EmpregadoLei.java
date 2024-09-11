class EmpregadoLei extends Empregado{
	public EmpregadoLei(String matricula, String nome, double salarioBase){
		super(matricula, nome, salarioBase);
	}

	public void setSalario(double salarioBase){
		if(salarioBase > getSalario()){
			super.setSalario(salarioBase);
		}else{
			System.out.print("\n\nSalario informado inferior ao cadastrado.");
		}
	}
}