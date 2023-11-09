package heranca;

public class main {

	public static void main(String[] args) {
		
		Gerente ger1 = new Gerente("Fabio",999999999,1111111111,"Gerente","Administracao");
		Vendedor vend1 = new Vendedor ("Marcelo",55555555,777777777,"Vendedor","Produtos quimicos");
		Faxineiro fax1 = new Faxineiro("João",11111111,22222222,"Faxineiro");
		
		ger1.fecharCaixa();
		ger1.baterPonto();
		vend1.realizarVenda();
		vend1.baterPonto();
		fax1.solicitarMatrial();
		fax1.baterPonto();
	}

}
