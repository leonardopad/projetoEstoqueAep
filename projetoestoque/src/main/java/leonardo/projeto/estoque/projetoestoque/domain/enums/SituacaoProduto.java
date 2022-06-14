package leonardo.projeto.estoque.projetoestoque.domain.enums;

public enum SituacaoProduto {
	ABERTO (1,"Aberto"),
	FECHADO (2,"Fechado");
	
	private int cod;
	private String situacaoProduto;
	
	private SituacaoProduto(int cod, String situacaoProduto) {
		this.cod = cod;
		this.situacaoProduto = situacaoProduto;
	}

	public int getCod() {
		return cod;
	}


	public String getSituacaoProduto() {
		return situacaoProduto;
	}

	public static String toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (SituacaoProduto x: SituacaoProduto.values()) {
			if(cod.equals(x.getCod())) {
				return x.situacaoProduto;
			}
		}
		throw new  IllegalArgumentException("Id inválido" + cod);
	}
	
}