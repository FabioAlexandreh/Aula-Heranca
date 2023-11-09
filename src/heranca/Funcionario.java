package heranca;

public class Funcionario {
		public String nome;
		public int rg;
		public int cpf;
		public String cargo;
		
		public Funcionario(String nome, int rg, int cpf, String cargo) {
			this.nome = nome;
			this.rg = rg;
			this.cpf = cpf;
			this.cargo = cargo;
		}
		void baterPonto() {
			System.out.println("Ponto Registrados");
		}
}
