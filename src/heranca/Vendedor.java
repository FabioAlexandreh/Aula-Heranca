package heranca;

public class Vendedor extends Funcionario{
	
	String especialidade;
	
	public Vendedor(String nome, int rg, int cpf, String cargo, String esp) {
		super(nome,rg,cpf,cargo);
		this.especialidade = esp;
	}
	
	void realizarVenda() {
		System.out.println("Produto Vendido");
	}
}

