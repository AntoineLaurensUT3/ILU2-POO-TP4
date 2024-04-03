package produit;

public class Poisson extends Produit{
	private String datePeche;
	
	
	public Poisson(String datePeche ) {
		super("poisson", Unite.PIECE);	
		this.datePeche = datePeche;
	}
	
	public void descriptionProduit(){
		System.out.println("poisson"+ datePeche + " \n");
		
	}
}
