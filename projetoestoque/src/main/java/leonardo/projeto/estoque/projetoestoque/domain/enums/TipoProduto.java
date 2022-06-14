package leonardo.projeto.estoque.projetoestoque.domain.enums;

public enum TipoProduto {
	PERECIVEL    (1,"Perecível"),
	NAOPERECIVEL (2,"Não Perecível");
	
	private int cod;
	private String tipoProduto;
	
	private TipoProduto(int cod, String tipoProduto) {
		this.cod = cod;
		this.tipoProduto = tipoProduto;
	}

	public int getCod() {
		return cod;
	}


	public String getTipoProduto() {
		return tipoProduto;
	}

	public static String toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoProduto x: TipoProduto.values()) {
			if(cod.equals(x.getCod())) {
				return x.tipoProduto;
			}
		}
		throw new IllegalArgumentException("Id inválido" + cod);
	}
	
}