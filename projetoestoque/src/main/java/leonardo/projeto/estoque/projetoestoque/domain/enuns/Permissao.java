package leonardo.projeto.estoque.projetoestoque.domain.enuns;

public enum Permissao {
	Admin (1,"Administrador"),
	Comum (2,"Comum");
	
	private int cod;
	private String permissao;
	
	private Permissao(int cod, String permissao) {
		this.cod = cod;
		this.permissao = permissao;
	}

	public int getCod() {
		return cod;
	}


	public String getPermissao() {
		return permissao;
	}

	public static Permissao toEnum(Integer cod) throws IllegalAccessException {
		if (cod == null) {
			return null;
		}
		for (Permissao x: Permissao.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalAccessException("Id inválido" + cod);
	}
	
}
