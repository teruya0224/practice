public class Book extends TangibleAsset {
	pirvate String iabn;

	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn =  isbn;
	}

	public Srting getIsbn() { return this.isbn;}

}
