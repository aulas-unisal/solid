package solid.coesao;

public class TrintaPorCento implements RegraDeCalculo{

	public double calcula(Funcionario funcionario) {		
		if (funcionario.getSalarioBase() > 5000.0) {
			return funcionario.getSalarioBase() * 1.5;
		} else {
			return funcionario.getSalarioBase() * 1.1;
		}
	}

}
