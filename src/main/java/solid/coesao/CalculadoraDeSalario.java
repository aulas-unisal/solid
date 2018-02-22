package solid.coesao;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario) {
		/**
		 * Al�m de tornar o c�digo coeso, trabalhamos aqui com encapsulamento tamb�m, 
		 * ou seja, a classe funcion�rio sabe como tratar o c�lculo do s�lario e n�o precisamos
		 * ver esse c�lculo, apenas perguntar e temos a resposta do sal�rio calculado.
		 */
		return funcionario.calculaSalario();        
    }
}
