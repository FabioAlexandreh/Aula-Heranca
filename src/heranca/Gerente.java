package heranca;

public class Gerente extends Funcionario  {
		String diploma;
		
		public Gerente(String nome, int rg, int cpf, String cargo, String dpm) {
			super(nome,rg,cpf,cargo);
			this.diploma = dpm;
		}
		
		void fecharCaixa() {
			System.out.println("Caixa fechado");
		}
}
