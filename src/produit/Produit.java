package produit;

public abstract class Produit implements IProduit {
	private String nomProduit;
	private Unite unite;
	
	
	public Produit(String nomProduit, Unite unite) {
		this.nomProduit = nomProduit;
		this.unite = unite;
	}


	@Override
	public String getNomProduit() {
		return nomProduit;
	}

	@Override
	public abstract void descriptionProduit();
	

}
