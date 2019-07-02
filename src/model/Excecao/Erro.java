package model.Excecao;

public class Erro extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public Erro(String mensagem) {
		super(mensagem);
	}
	
}
