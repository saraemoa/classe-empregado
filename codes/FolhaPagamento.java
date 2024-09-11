class FolhaPagamento{
	public static void main(String[] args) throws Exception{
		EmpregadoLei empregado1 = new EmpregadoLei("1", "Joao", 600);
		EmpregadoComissao empregado2 = new EmpregadoComissao("2", "Maria", 1000, 10);
		empregado1.mostrarDados();
		empregado2.mostrarDados();
		empregado1.setSalario(500);
		System.out.print("\n\nSalario liquido de Joao: R$ " + empregado1.salarioLiquido());
		System.out.print("\n\nSalario liquido de Maria: R$ " + empregado2.salarioLiquido(100));
		empregado1.setSalario(700);
		empregado2.setSalario(1200);
		empregado1.mostrarDados();
		empregado2.mostrarDados();
		System.out.print("\n\nSalario liquido de Joao: R$ " + empregado1.salarioLiquido());
		System.out.print("\n\nSalario liquido de Maria: R$ " + empregado2.salarioLiquido(200));
	}
}