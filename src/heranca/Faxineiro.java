package heranca;

public class Faxineiro extends Funcionario {
	boolean vassoura = true;
	
	public Faxineiro(String nome, int rg, int cpf, String cargo) {
		super(nome,rg,cpf,cargo);
	}
	
	void solicitarMatrial() {
		System.out.println("Produto solicitado");
	}
}
